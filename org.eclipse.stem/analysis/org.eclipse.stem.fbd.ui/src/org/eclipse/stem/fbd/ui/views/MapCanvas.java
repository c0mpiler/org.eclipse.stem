// MapCanvas.java
package org.eclipse.stem.fbd.ui.views;

/*******************************************************************************
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation and new features
 *     Bundesinstitut für Risikobewertung - Pajek Graph interface, new Veterinary Models
 *******************************************************************************/

import java.io.File;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.DefaultToolTip;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.definitions.labels.AreaLabel;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.definitions.nodes.Region;
import org.eclipse.stem.geography.names.GeographicNames;
import org.eclipse.stem.ui.Activator;
import org.eclipse.stem.ui.adapters.color.ColorProviderAdapter;
import org.eclipse.stem.ui.adapters.color.ColorScaleComposite;
import org.eclipse.stem.ui.adapters.color.STEMColor;
import org.eclipse.stem.ui.adapters.color.StandardColorProvider;
import org.eclipse.stem.ui.views.geographic.map.GeographicSelectionElements;
import org.eclipse.stem.ui.views.geographic.map.StemPolygon;
import org.eclipse.stem.ui.views.geographic.map.StemPolygonTransform;
import org.eclipse.stem.ui.views.geographic.map.StemPolygonsList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseTrackAdapter;
import org.eclipse.swt.events.MouseWheelListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * This class is a SWT Widget that displays a "map" view of the geographic
 * features of a {@link org.eclipse.stem.jobs.simulation.Simulation}.
 */
public class MapCanvas extends Canvas implements ISelectionProvider,
		PaintListener, MouseWheelListener, MouseMoveListener, DisposeListener,
		IPropertyChangeListener {

	private static final int TOOLTIP_HIDE_DELAY = 30000; // milliseconds

	private static final double INITIAL_ZOOM_FACTOR = 1;
	private static final double INITIAL_X_TRANSLATION = 0;
	private static final double INITIAL_Y_TRANSLATION = 0;

	protected static final double ZOOMING_FACTOR = 1.1;
	protected static final double UNZOOMING_FACTOR = 1 / ZOOMING_FACTOR;

	/**
	 * This is the list of polygons that are rendered.
	 */
	private StemPolygonsList polygonsToRender;

	double zoomFactor = INITIAL_ZOOM_FACTOR;
	private float gainFactor = 1.0f;
	private double xTranslation = INITIAL_X_TRANSLATION;
	private double yTranslation = INITIAL_Y_TRANSLATION;
	boolean drawPolygonBorders = true;
	StemPolygonTransform pointsTransformer = new StemPolygonTransform();
	boolean toUpdateTranform = true;

	private final StandardColorProvider stdColorProvider = new StandardColorProvider(
			this.getDisplay());
	private ColorProviderAdapter colorProvider = null;

	private boolean useLogScaling = true;

	boolean leftMouseButtonPressed = false;
	int lastOffsetX;
	int lastOffsetY;
	ColorScaleComposite colorScale = null;

	private ISelection selection;
	/**
	 * The collection of ISelectionChangedListener waiting to be told about
	 * selections.
	 */
	protected final List<ISelectionChangedListener> selectionChangedListeners = new CopyOnWriteArrayList<ISelectionChangedListener>();
	private Rectangle polygonsBoundsRect = null;
	private static final int MARGIN = 10;

	private final MouseTrackHandler mouseTrackHandler = new MouseTrackHandler();
	private final MouseButtonHandler mouseButtonHandler = new MouseButtonHandler();
	private final MouseHoverHandler mouseHoverHandler = new MouseHoverHandler();
	private final KeyHandler keyHandler = new KeyHandler();

	protected Image canvasImage;

	private DefaultToolTip tooltip;

	/**
	 * @param parent
	 * @param style
	 */
	public MapCanvas(final Composite parent, final int style) {
		super(parent, SWT.DOUBLE_BUFFERED | SWT.NO_BACKGROUND);

		addPaintListener(this);
		addMouseWheelListener(this);
		addMouseTrackListener(mouseTrackHandler);
		addMouseMoveListener(this);
		addKeyListener(keyHandler);
		addDisposeListener(this);
		addMouseListener(mouseButtonHandler);
		addMouseTrackListener(mouseHoverHandler);

		tooltip = new DefaultToolTip(this);
		tooltip.setHideDelay(TOOLTIP_HIDE_DELAY);

		Activator.getDefault().getPreferenceStore()
				.addPropertyChangeListener(this);
	} // MapCanvas

	/**
	 * @see org.eclipse.swt.events.PaintListener#paintControl(org.eclipse.swt.events.PaintEvent)
	 */
	public void paintControl(final PaintEvent e) {
		final GC gc = e.gc;
		final Point controlSize = ((Control) e.getSource()).getSize();
		toUpdateTranform = true;

		Image newCanvasImage = new Image(e.display, controlSize.x,
				controlSize.y);

		GC localGC = new GC(newCanvasImage);
		draw(localGC, 0, 0, controlSize.x, controlSize.y);
		localGC.dispose();

		gc.drawImage(newCanvasImage, 0, 0);

		Image oldCanvasImage = canvasImage;
		canvasImage = newCanvasImage;
		if (oldCanvasImage != null && !oldCanvasImage.isDisposed()) {
			oldCanvasImage.dispose();
		}

	}

	@Override
	public void propertyChange(PropertyChangeEvent event) {
		redraw();
	}

	/**
	 * @param path
	 * @throws IOException
	 */
	public void saveCanvasImage(File path) throws IOException {
		try {
			if (canvasImage != null && !canvasImage.isDisposed()) {
				ImageLoader loader = new ImageLoader();
				loader.data = new ImageData[] { canvasImage.getImageData() };
				loader.save(path.getAbsolutePath(), SWT.IMAGE_PNG);
			}
		} catch (Exception e) {
			throw new IOException(
					"MapCanvas:saveCanvasImage() Unable to save map canvas image to the file "
							+ path.getAbsolutePath());
		}
	}

	/**
	 * @return
	 */
	public Image getCanvasImage() {
		return canvasImage;
	}

	/**
	 * @param e
	 */
	public void mouseScrolled(final MouseEvent e) {
		// Zoom Out?
		if (e.count >= 0) {
			// Yes
			zoomIn();
		} else {
			zoomOut();
		}
	}

	/**
	 * @param e
	 */
	public void mouseMove(MouseEvent e) {

		if (leftMouseButtonPressed) {
			// Yes
			// new x and y are defined by current mouse location subtracted
			// by previously processed mouse location
			final int newX = e.x - lastOffsetX;
			final int newY = e.y - lastOffsetY;
			lastOffsetX = e.x;
			lastOffsetY = e.y;

			// Did we move from the spot where the mouse went down?
			if (newX != 0 || newY != 0) {
				// Yes
				// This is a translation of the map then
				// update the canvas translation
				addTranslation(newX, newY);
			} // if moved
		}
	}

	/**
	 * @see org.eclipse.swt.events.DisposeListener#widgetDisposed(org.eclipse.swt.events.DisposeEvent)
	 */
	public void widgetDisposed(final DisposeEvent e) {
		if (!isDisposed()) {
			dispose();
		}
	}

	/**
	 * @param polygonsToRender
	 */
	public void render(final StemPolygonsList polygonsToRender) {
		this.polygonsToRender = polygonsToRender;
		redraw();
	} // render

	/**
	 * @param drawPolygonBorders
	 */
	public final void setDrawPolygonBorders(final boolean drawPolygonBorders) {
		this.drawPolygonBorders = drawPolygonBorders;
	}

	/**
	 * @param gainFactor
	 */
	public final void setGainFactor(final float gainFactor) {
		this.gainFactor = gainFactor;
	}

	/**
	 * @param useLogScaling
	 */
	public final void setUseLogScaling(final boolean useLogScaling) {
		this.useLogScaling = useLogScaling;
	}

	/**
	 * Reset
	 */
	public void reset() {
		xTranslation = INITIAL_X_TRANSLATION;
		yTranslation = INITIAL_Y_TRANSLATION;
		zoomFactor = INITIAL_ZOOM_FACTOR;
	} // reset

	/**
	 * The method which gets the MapCanvas' polygons list, and draws it on the
	 * MapCanvas.
	 * 
	 * @param gc
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	void draw(final GC gc, final int x, final int y, final int width,
			final int height) {

		gc.setBackground(stdColorProvider.getBackgroundColor());
		drawBackground(gc, x, y, width, height);
		gc.setLineWidth(0); // Zero means the fastest possible line drawing
							// algorithm

		if (polygonsToRender == null || polygonsToRender.isEmpty()) {
			return;
		}

		// Do we need to recalculate the transform?
		if (toUpdateTranform) {
			// Yes, compute it
			computeTransform(polygonsToRender);
			// Update all polygons about the changes in the transform
			for (StemPolygon stempoly : polygonsToRender) {
				stempoly.setPointsTransformer(pointsTransformer);
			}
			toUpdateTranform = false;
		}

		Color bordersColor = stdColorProvider.getBordersColor();
		int bordersAlpha = stdColorProvider.getBordersAlpha();

		for (final StemPolygon stempoly : polygonsToRender) {

			Identifiable identifiable = stempoly.getIdentifiable();

			if (identifiable instanceof Node) {
				colorProvider.setTarget(identifiable);

				// Update the G2D with the appropriate color before filling the
				// polygon
				// this code improves the performance by not using alpha values
				STEMColor color = colorProvider.getColor(gainFactor,
						useLogScaling);
				Color c = color.toSWTColor(gc.getDevice());
				Color back = stdColorProvider.getBackgroundColor();
				double alpha = color.getAlpha();
				int r = (int) (alpha * c.getRed() + (1 - alpha) * back.getRed());
				int g = (int) (alpha * c.getGreen() + (1 - alpha)
						* back.getGreen());
				int b = (int) (alpha * c.getBlue() + (1 - alpha)
						* back.getBlue());

				gc.setBackground(new Color(gc.getDevice(), r, g, b));
				gc.fillPolygon(stempoly.transformedPoints);

				if (drawPolygonBorders) {
					gc.setForeground(bordersColor);
					gc.setAlpha(bordersAlpha);
					gc.drawPolygon(stempoly.transformedPoints);
					gc.setAlpha(255); // set it back
				}
			}

			if (identifiable instanceof Edge) {

				gc.setForeground(stdColorProvider.getEdgesColor());
				if (stempoly.transformedPoints == null) {
					stempoly.setPointsTransformer(pointsTransformer);
				}
				gc.drawLine(stempoly.transformedPoints[0],
						stempoly.transformedPoints[1],
						stempoly.transformedPoints[2],
						stempoly.transformedPoints[3]);
			}
		} // for each StemPolygon

		// if(colorProvider instanceof
		// AbstractRelativeValueColorProviderAdapter) {
		// AbstractRelativeValueColorProviderAdapter c =
		// (AbstractRelativeValueColorProviderAdapter) colorProvider;
		// drawColorScale(c);
		// }

		gc.setForeground(getDisplay().getSystemColor(SWT.COLOR_BLACK));
	} // draw

	/**
	 * 
	 * @param adapter
	 */
	// private void drawColorScale(AbstractRelativeValueColorProviderAdapter
	// adapter) {
	// Color saturatedColor = adapter.getForegroundFillColor(); // to
	// transparent color over the background
	// Color textColor = saturatedColor; // text
	// Color backGround = adapter.getBackgroundFillColor(); // textBackground
	//
	// if (colorScale == null) {
	// colorScale = new ColorScaleComposite(this, saturatedColor, new
	// double[]{0.0, 1.0/gainFactor}, useLogScaling, SWT.BORDER, backGround,
	// textColor);
	// }
	// colorScale.updateColorScale(saturatedColor, new double[]{0.0,
	// 1.0/gainFactor},useLogScaling, backGround, textColor);
	// }

	/**
	 * @param polygonList
	 */
	private void computeTransform(final StemPolygonsList polygonList) {
		if (polygonsBoundsRect == null) {
			polygonsBoundsRect = polygonList.getBounds();
			if (polygonsBoundsRect == null) {
				return;
			}
		}

		final Rectangle canvasBounds = getBounds();

		final int effectiveCanvasWidth = canvasBounds.width - 2 * MARGIN;
		final int effectiveCanvasHeight = canvasBounds.height - 2 * MARGIN;
		final double width = polygonsBoundsRect.width;
		final double height = polygonsBoundsRect.height;
		final double WIDTH_RATIO = effectiveCanvasWidth / width;
		final double HEIGHT_RATIO = effectiveCanvasHeight / height;
		final double SCALE_FACTOR = Math.min(WIDTH_RATIO, HEIGHT_RATIO)
				* zoomFactor;

		// Figure out the extra translation needed to center the image either
		// vertically or horizontally in the canvas
		int xCenteringTranslation = 0;
		int yCenteringTranslation = 0;
		// Anything to center?
		if (width > 0 && height > 0) {
			// Yes
			xCenteringTranslation = (effectiveCanvasWidth - (int) (width * SCALE_FACTOR)) / 2;
			yCenteringTranslation = (effectiveCanvasHeight - (int) (height * SCALE_FACTOR)) / 2;
		} // if anything to center
		int boundsMinX = polygonsBoundsRect.x;
		int boundsMinY = polygonsBoundsRect.y;

		pointsTransformer.setOffsetX(-boundsMinX * SCALE_FACTOR + MARGIN
				+ xCenteringTranslation + xTranslation * zoomFactor);
		pointsTransformer.setOffsetY(-boundsMinY * SCALE_FACTOR + MARGIN
				+ yCenteringTranslation + yTranslation * zoomFactor);
		pointsTransformer.setScale(SCALE_FACTOR);
	} // computeTransform

	void zoomIn() {
		zoomFactor *= ZOOMING_FACTOR;
		toUpdateTranform = true;
		redraw();
	}

	void zoomOut() {
		zoomFactor *= UNZOOMING_FACTOR;
		toUpdateTranform = true;
		redraw();
	}

	/**
	 *
	 */
	protected static class MouseTrackHandler extends MouseTrackAdapter {
		@Override
		public void mouseEnter(final MouseEvent e) {

			// The Map does not NEED to steal focus at all
			// IF in the future we need focus then the following
			// Guard claused protects against irrelevant/unneeded stealing of
			// focus

			// if there is NOTHING in the map, don't steal focus
			// if (polygonsToRender != null && !polygonsToRender.isEmpty()) {
			// forceFocus();
			// }
		}
	}

	/**
	 * 
	 */
	protected class KeyHandler extends KeyAdapter {
		@Override
		public void keyReleased(final KeyEvent e) {
			switch (e.keyCode) {
			case SWT.ARROW_UP:
				zoomIn();
				break;
			case SWT.ARROW_DOWN:
				zoomOut();
				break;
			default:
				break;
			} // switch
		}
	}

	/**
	 * A helper class that defines a mouse-listener that will provide the user
	 * the ability to move the map inside the view.
	 * 
	 */
	protected class MouseButtonHandler extends MouseAdapter {
		/**
		 * @see org.eclipse.swt.events.MouseListener#mouseDown(org.eclipse.swt.events.MouseEvent)
		 */
		@Override
		public void mouseDown(final MouseEvent e) {
			// Is the left mouse button?
			if (e.button == 1) {
				// Yes
				// Capture the starting point
				lastOffsetX = e.x;
				lastOffsetY = e.y;
				leftMouseButtonPressed = true;
			} // if
		} // mouseDown

		/**
		 * @see org.eclipse.swt.events.MouseListener#mouseUp(org.eclipse.swt.events.MouseEvent)
		 */
		@Override
		public void mouseUp(final MouseEvent e) {
			// Is it the left mouse button?
			if (e.button == 1) {
				// Yes
				// new x and y are defined by current mouse location subtracted
				// by previously processed mouse location
				final int newX = e.x - lastOffsetX;
				final int newY = e.y - lastOffsetY;

				// Did we move from the spot where the mouse went down?
				if (newX != 0 || newY != 0) {
					// Yes
					// This is a translation of the map then
					// update the canvas translation
					addTranslation(newX, newY);
				} // if moved
				else {
					// No
					// This is a potential selection of a polygon
					final StemPolygon polygon = getPolygon(e);
					// Are we clicking on a polygon?
					if (polygon != null) {
						// Yes
						// Get the Identifiable associated with the polygon and
						// make it the current selection.
						// Build the GeographicSelectionElements
						// and pass it via the StructuredSelection as the 2nd
						// element
						final GeographicSelectionElements gse = new GeographicSelectionElements();

						// Convert from canvas space coordinates to lat/long by
						// the inverse
						// transform.
						final Point latLongPosition = pointsTransformer
								.getInversedPoint(e.x, e.y);// inverseMap(new
															// Point(e.x, e.y));
						final double longitude = polygon
								.unScaleLongitude(latLongPosition.x);
						final double latitude = polygon
								.unScaleLatitude(latLongPosition.y);
						gse.setPoint(longitude, latitude);
						final Identifiable regnImpl = polygon.getIdentifiable();
						final Object[] elements = new Object[] { regnImpl, gse };
						final IStructuredSelection selection = new StructuredSelection(
								elements);
						fireSelection(selection);
					}
				} // else didn't move
				leftMouseButtonPressed = false;
			} // if left mouse button
		} // mouseUp
	} // MouseButtonHandler

	protected class MouseHoverHandler extends MouseTrackAdapter {

		// @Override
		// public void mouseEnter(MouseEvent e) {
		// final Cursor cursor = new Cursor(getDisplay(), SWT.CURSOR_SIZEALL);
		// Canvas mapCanvas = (Canvas)e.getSource();
		// mapCanvas.setCursor(cursor);
		// super.mouseEnter(e);
		// }
		//
		// @Override
		// public void mouseExit(MouseEvent e) {
		// final Cursor cursor = new Cursor(getDisplay(), SWT.CURSOR_ARROW);
		// Canvas mapCanvas = (Canvas)e.getSource();
		// mapCanvas.setCursor(cursor);
		// super.mouseExit(e);
		// }

		/**
		 * @see org.eclipse.swt.events.MouseTrackListener#mouseHover(org.eclipse.swt.events.MouseEvent)
		 */
		@Override
		public void mouseHover(final MouseEvent e) {

			// Convert from canvas space coordinates to lat/long by the inverse
			// transform.
			final Point latLongPosition = pointsTransformer.getInversedPoint(
					e.x, e.y);// inverseMap(new Point(e.x, e.y));

			// Try to get the polygon that matches the position of the mouse
			final StemPolygon polygon = getPolygon(latLongPosition);

			// Did we find an enclosing polygon?
			if (polygon != null) {
				// Yes
				// We want to get the ISO-key for the identifiable, it will be
				// at the end of the value of the dublin core "identifier"
				// attribute
				Identifiable identifiable = polygon.getIdentifiable();
				final DublinCore dc = identifiable.getDublinCore();
				final String dcIdentifier = dc.getIdentifier();

				final String isoKey = dcIdentifier.substring(dcIdentifier
						.lastIndexOf("/") + 1);
				// Did we get it?

				String toolTipText = null;

				if (isoKey != null && !isoKey.equals("")) {
					// Yes
					final String geographicName = GeographicNames
							.getName(isoKey);
					boolean retry = true;
					StringBuilder sb = null;
					while (retry) {
						retry = false;
						try {
							sb = new StringBuilder(geographicName);
							sb.append(" (");
							sb.append(isoKey);
							sb.append(")");

							Region region = (Region) identifiable;
							for (NodeLabel nextLabel : region.getLabels()) {
								if (nextLabel instanceof PopulationLabel) {
									sb.append("\nPopulation ("
											+ ((PopulationLabel) nextLabel)
													.getValidYear() + "):"
											+ nextLabel);
								}
								if (nextLabel instanceof AreaLabel) {
									sb.append("\nArea: " + nextLabel);
								}
							}

							if (latLongPosition != null) {
								double latitude = -1
										* StemPolygon
												.getUnscaledLatitude(latLongPosition.y);
								double longitude = -1
										* StemPolygon
												.getUnscaledLongitude(latLongPosition.x);
								sb.append("\nLatitude: " + latitude
										+ ", Longitude: " + longitude);
							}
						} catch (ConcurrentModificationException cme) {
							retry = true; // Should be rare, just retry
						}
					}

					toolTipText = sb.toString();

				} // if
				else {
					toolTipText = polygon.getTitle();
				}

				if (tooltip != null) {
					if (toolTipText != null) {
						tooltip.setText(toolTipText);
						tooltip.show(new Point(e.x, e.y));
					} else {
						tooltip.hide();
					}
				}

				/*
				 * // Yes //mapCanvas.setToolTipText(polygon.getTitle() + "\n"
				 * +polygon.getRelativeValue());
				 * 
				 * String key =
				 * propertySelectionControl.getSelectedPropertyString();
				 * mapCanvas.setToolTipText("Name: " + polygon.getTitle() + "\n"
				 * + "Relative Value: " + polygon.getRelativeValue(key));
				 */
			} // if
			else {
				// No
				if (tooltip != null) {
					tooltip.hide();
				}
			}
		} // mouseHover

	} // MouseHoverHandler

	/**
	 * @param e
	 *            a mouse event
	 * @return the polygon the matches the position of the mouse, or
	 *         <code>null</code> if there is no such polygon.
	 */
	StemPolygon getPolygon(final MouseEvent e) {
		// Convert from canvas space coordinates to lat/long by the inverse
		// transform.
		// final Point latLongPosition = inverseMap(new Point(e.x, e.y));
		final Point latLongPosition = pointsTransformer.getInversedPoint(e.x,
				e.y);
		return getPolygon(latLongPosition);

	} // getPolygon

	/**
	 * @param point
	 *            a point (probably within the polygon)
	 * @return the polygon the matches the position of the point, or
	 *         <code>null</code> if there is no such polygon.
	 */
	StemPolygon getPolygon(final Point point) {
		StemPolygon retValue = null;

		if (point != null && polygonsToRender != null) {
			// Find the Polygon that contains the lat/long coordinates
			retValue = polygonsToRender.getContainingRegionPolygon(point);
		} // if
		return retValue;
	} // getPolygon

	/**
	 * Adds offsets to the current translation.
	 * 
	 * @param xTranslationAddition
	 * @param yTranslationAddition
	 */
	protected void addTranslation(final double xTranslationAddition,
			final double yTranslationAddition) {
		this.xTranslation += (xTranslationAddition / zoomFactor);
		this.yTranslation += (yTranslationAddition / zoomFactor);
		toUpdateTranform = true;
		redraw();
	} // addTranslation

	/**
	 * @see org.eclipse.jface.viewers.ISelectionProvider#addSelectionChangedListener(org.eclipse.jface.viewers.ISelectionChangedListener)
	 */
	public void addSelectionChangedListener(
			final ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}

	/**
	 * @see org.eclipse.jface.viewers.ISelectionProvider#removeSelectionChangedListener(org.eclipse.jface.viewers.ISelectionChangedListener)
	 */
	public void removeSelectionChangedListener(
			final ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
	}

	/**
	 * @return the selection
	 */
	public final ISelection getSelection() {
		return selection;
	}

	/**
	 * @see org.eclipse.jface.viewers.ISelectionProvider#setSelection(org.eclipse.jface.viewers.ISelection)
	 */
	public void setSelection(final ISelection selection) {
		this.selection = selection;
		fireSelection(selection);
	}

	void fireSelection(final ISelection selection) {

		final SelectionChangedEvent event = new SelectionChangedEvent(this,
				selection);
		for (final ISelectionChangedListener listener : selectionChangedListeners) {
			listener.selectionChanged(event);
		} // for each ISelectionChangedListener

	} // fireSelection

	/**
	 * @param colorProvider
	 *            the colorProvider to set
	 */
	public void setColorProvider(ColorProviderAdapter colorProvider) {
		this.colorProvider = colorProvider;

		// if(colorProvider instanceof
		// AbstractRelativeValueColorProviderAdapter) {
		// AbstractRelativeValueColorProviderAdapter c =
		// (AbstractRelativeValueColorProviderAdapter) colorProvider;
		// drawColorScale(c);
		// }

	}

	/**
	 * @see org.eclipse.swt.widgets.Widget#dispose()
	 */
	@Override
	public void dispose() {
		tooltip = null;

		removePaintListener(this);
		removeMouseWheelListener(this);
		removeMouseTrackListener(mouseTrackHandler);
		removeMouseMoveListener(this);
		removeKeyListener(keyHandler);
		removeDisposeListener(this);
		removeMouseListener(mouseButtonHandler);
		removeMouseTrackListener(mouseHoverHandler);
	}

} // MapCanvas