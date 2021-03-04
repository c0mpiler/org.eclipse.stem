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
 *     Bundesinstitut f�r Risikobewertung
 *******************************************************************************/

package org.eclipse.stem.ui.views.graphmap;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.text.NumberFormatter;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.DefaultToolTip;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.definitions.edges.MigrationEdge;
import org.eclipse.stem.definitions.labels.AreaLabel;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.definitions.nodes.Region;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.geography.names.GeographicNames;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;
import org.eclipse.stem.ui.Activator;
import org.eclipse.stem.ui.adapters.color.ColorProviderAdapter;
import org.eclipse.stem.ui.adapters.color.RelativeValueColorProvider;
import org.eclipse.stem.ui.adapters.color.STEMColor;
import org.eclipse.stem.ui.adapters.color.StandardColorProvider;
import org.eclipse.stem.ui.preferences.PreferenceConstants;
import org.eclipse.stem.ui.views.geographic.map.GeographicSelectionElements;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseTrackListener;
import org.eclipse.swt.events.MouseWheelListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchActionConstants;

/**
 * This class is a SWT Widget that displays a "map" view of the geographic
 * features of a {@link org.eclipse.stem.jobs.simulation.Simulation}.
 */
public class GraphMapCanvas extends Canvas implements ISelectionProvider,
		PaintListener, MouseWheelListener, MouseMoveListener, KeyListener,
		DisposeListener, MouseListener, MouseTrackListener,
		IPropertyChangeListener, ControlListener {

	public final static double INITIAL_SCALE_FACTOR = 0.99;

	private final double INITIAL_GAIN_FACTOR = 1.0;
	private final double INITIAL_EDGE_GAIN_FACTOR = 1.0;
	private final boolean INITIAL_DRAW_POLYGON_BORDERS = true;
	private final boolean INITIAL_USE_LOG_SCALING = false;
	private final boolean INITIAL_USE_LOG_EDGE_SCALING = false;
	private final boolean INITIAL_ADJUST_EDGE_THICKNESS = false;
	private final boolean INITIAL_SHOW_OPTIONS_VIEW = true;
	private final double ZOOMING_FACTOR = 1.1;	
	private final int ARROWHEAD_LENGTH = 10;
	private final int ARROWHEAD_THICKNESS = 10;

	private Label gainScaleLabel;

	private GainFactorAction defaultGainFactorAction;
	private GainFactorAction lastGainFactorAction;
	private EdgeGainFactorAction defaultEdgeGainFactorAction;
	private EdgeGainFactorAction lastEdgeGainFactorAction;
	private LogarithmicAction logarithmicAction;
	private LogarithmicEdgeAction logarithmicEdgeAction;
	private AdjustEdgeThicknessAction adjustEdgeThicknessAction;
	private DrawPolygonBordersAction drawPolygonBordersAction;
	private ToggleOptionsViewAction toggleOptionsViewAction;

	private StemPolygonList polygonsToRender;
	private double gainFactor;
	private double edgeGainFactor;
	private boolean drawPolygonBorders;
	private StandardColorProvider stdColorProvider;
	private ColorProviderAdapter colorProvider;
	private boolean useLogScaling;
	private boolean useLogEdgeScaling;
	private boolean adjustEdgeThickness;
	private boolean leftMouseButtonPressed;
	private boolean initialTransformationComputed;
	private boolean transformationChanged;
	private boolean showOptionsBar;
	private double translationX;
	private double translationY;
	private double scaleFactor;
	private double scaleX;
	private double scaleY;
	private int lastX;
	private int lastY;
	private ISelection selection;
	private List<ISelectionChangedListener> selectionChangedListeners;
	private ISimulation simulation;
	private DefaultToolTip tooltip;
	private Image image;
	private GC imageGC;
	private Image borderImage;

	private StemPolygonList lastNonSquarePolygons;
	private StemPolygonList lastSquarePolygons;
	private List<Color> lastNonSquareColors;
	private List<Color> lastSquareColors;
	private int lastBorderAlpha;
	private Color lastBackgroundColor;
	private Color lastBorderColor;

	private Image canvasImage;
	private volatile GraphMapView view;
	private volatile GraphMapControl ctrl;

	private Observable paneChangeSubject;

	public GraphMapCanvas(Composite parent, int style, GraphMapView view) {
		super(parent, SWT.DOUBLE_BUFFERED | SWT.NO_BACKGROUND);

		this.ctrl = (GraphMapControl) parent;
		this.paneChangeSubject = new Observable() {
			@Override
			public void notifyObservers(Object arg) {
				super.setChanged();
				super.notifyObservers(arg);
			}
		};

		drawPolygonBorders = INITIAL_DRAW_POLYGON_BORDERS;
		useLogScaling = INITIAL_USE_LOG_SCALING;
		useLogEdgeScaling = INITIAL_USE_LOG_EDGE_SCALING;
		gainFactor = INITIAL_GAIN_FACTOR;
		edgeGainFactor = INITIAL_EDGE_GAIN_FACTOR;
		adjustEdgeThickness = INITIAL_ADJUST_EDGE_THICKNESS;
		showOptionsBar = INITIAL_SHOW_OPTIONS_VIEW;

		addPaintListener(this);
		addMouseWheelListener(this);
		addMouseMoveListener(this);
		addKeyListener(this);
		addDisposeListener(this);
		addMouseListener(this);
		addMouseTrackListener(this);
		addControlListener(this);

		tooltip = new DefaultToolTip(this);
		transformationChanged = false;
		leftMouseButtonPressed = false;
		initialTransformationComputed = false;
		stdColorProvider = new StandardColorProvider(this.getDisplay());
		selectionChangedListeners = new CopyOnWriteArrayList<ISelectionChangedListener>();

		Activator.getDefault().getPreferenceStore()
				.addPropertyChangeListener(this);
		this.view = view;
	}

	@Override
	public void paintControl(PaintEvent e) {
		Rectangle rect = getClientArea();
		Color backgroundColor = stdColorProvider.getBackgroundColor();
		Color borderColor = stdColorProvider.getBordersColor();
		int borderAlpha = stdColorProvider.getBordersAlpha();
		Image newCanvasImage = new Image(e.display, rect.width, rect.height);
		GC gc = new GC(newCanvasImage);

		gc.setBackground(backgroundColor);
		drawBackground(gc, 0, 0, rect.width, rect.height);

		if (polygonsToRender == null || polygonsToRender.isEmpty()) {
			return;
		}

		StemPolygonList nonSquarePolygons = new StemPolygonList();
		StemPolygonList squarePolygons = new StemPolygonList();
		StemPolygonList nonMigrationEdges = new StemPolygonList();
		StemPolygonList migrationsEdges = new StemPolygonList();

		for (StemPolygon stempoly : polygonsToRender) {
			Identifiable id = stempoly.getIdentifiable();

			if (id instanceof Node) {
				if (stempoly.isSquare()) {
					squarePolygons.add(stempoly);
				} else {
					nonSquarePolygons.add(stempoly);
				}
			} else if (id instanceof MigrationEdge) {
				migrationsEdges.add(stempoly);
			} else if (id instanceof Edge) {
				nonMigrationEdges.add(stempoly);
			}
		}

		if (transformationChanged) {

			Rectangle canvasBounds = getClientArea();

			int cCX = canvasBounds.x + canvasBounds.width / 2;
			int cCY = canvasBounds.y + canvasBounds.height / 2;

			double relTransX = cCX - translationX;
			double relTransY = cCY - translationY;
			// fire pane change event
			this.paneChangeSubject.notifyObservers(new PaneChangeEvent(scaleX, // this.scaleFactor,
					relTransX, relTransY));
			for (StemPolygon stempoly : polygonsToRender) {
				stempoly.computeTransformedPoints(translationX, translationY,
						scaleX, scaleY);
			}
		}

		if (transformationChanged
				|| !nonSquarePolygons.equals(lastNonSquarePolygons)
				|| !squarePolygons.equals(lastSquarePolygons)
				|| !backgroundColor.equals(lastBackgroundColor)) {
			if (image != null) {
				image.dispose();
				image = null;
			}

			if (borderImage != null) {
				borderImage.dispose();
				borderImage = null;
			}
		} else if (borderAlpha != lastBorderAlpha
				|| !borderColor.equals(lastBorderColor)) {
			if (borderImage != null) {
				borderImage.dispose();
				borderImage = null;
			}
		}

		List<Color> nonSquareColors = getColors(gc, nonSquarePolygons);
		List<Color> squareColors = getColors(gc, squarePolygons);

		// Paint polygons
		if (image == null) {
			createImage(gc.getDevice(), rect.width, rect.height,
					nonSquarePolygons, squarePolygons, nonSquareColors,
					squareColors);
			gc.drawImage(image, 0, 0);
		} else {
			updateImage(gc.getDevice(), rect.width, rect.height,
					nonSquarePolygons, squarePolygons, nonSquareColors,
					squareColors);
			gc.drawImage(image, 0, 0);
		}

		// Paint polygon borders
		if (drawPolygonBorders) {
			if (borderImage == null) {
				computeBorderImage(gc.getDevice(), rect.width, rect.height,
						nonSquarePolygons, squarePolygons);
			}

			gc.drawImage(borderImage, 0, 0);
		}

		// Paint non-migration edges
		for (StemPolygon stempoly : nonMigrationEdges) {
			paintEdge(gc, stempoly);
		}

		// Paint migration edges
		for (StemPolygon stempoly : migrationsEdges) {
			paintMigrationEdge(gc, stempoly);
		}

		gc.setLineWidth(0);
		gc.setForeground(getInvertedColor(backgroundColor));
		gc.drawRectangle(rect.x, rect.y, rect.width - 1, rect.height - 1);

		e.gc.drawImage(newCanvasImage, 0, 0);

		if (canvasImage != null && !canvasImage.isDisposed()) {
			canvasImage.dispose();
		}

		canvasImage = newCanvasImage;

		transformationChanged = false;
		lastNonSquarePolygons = nonSquarePolygons;
		lastSquarePolygons = squarePolygons;
		lastNonSquareColors = nonSquareColors;
		lastSquareColors = squareColors;
		lastBackgroundColor = backgroundColor;
		lastBorderAlpha = borderAlpha;
		lastBorderColor = borderColor;
	}

	@Override
	public void widgetDisposed(DisposeEvent e) {
		if (!isDisposed()) {
			dispose();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
		Rectangle bounds = this.getClientArea();
		int centerX = bounds.x + bounds.width / 2;
		int centerY = bounds.y + bounds.height / 2;

		switch (e.keyCode) {
		case SWT.ARROW_UP:
			zoomIn(centerX, centerY);
			break;
		case SWT.ARROW_DOWN:
			zoomOut(centerX, centerY);
			break;
		}
	}

	@Override
	public void mouseDoubleClick(MouseEvent e) {
		// Is the left mouse button?
		if (e.button == 1) {
			StemPolygon polygon = getPolygon(e.x, e.y);
			// Are we clicking on a polygon?
			if (polygon != null) {
				// Yes
				// Get the Identifiable associated with the polygon and
				// make it the current selection.
				// Build the GeographicSelectionElements
				// and pass it via the StructuredSelection as the 2nd
				// element
				GeographicSelectionElements gse = new GeographicSelectionElements();

				// Convert from canvas space coordinates to lat/long by
				// the inverse
				// transform.
				Point2D.Double latLongPosition = getInversedPoint(e.x, e.y);// inverseMap(new
				// Point(e.x,
				// e.y));
				double longitude = latLongPosition.getX();
				double latitude = latLongPosition.getY();
				gse.setPoint(longitude, latitude);
				Identifiable regnImpl = polygon.getIdentifiable();
				Object[] elements = new Object[] { regnImpl, gse };
				IStructuredSelection selection = new StructuredSelection(
						elements);
				fireSelection(selection);
			}
		}
	}

	@Override
	public void mouseDown(MouseEvent e) {
		// Is the left mouse button?
		if (e.button == 1) {
			// Capture the starting point
			lastX = e.x;
			lastY = e.y;
			leftMouseButtonPressed = true;
		}
	}

	@Override
	public void mouseUp(MouseEvent e) {
		// Is the left mouse button?
		if (e.button == 1) {
			leftMouseButtonPressed = false;
		}
	}

	@Override
	public void mouseScrolled(MouseEvent e) {
		if (e.count >= 0) {
			zoomIn(e.x, e.y);
		} else {
			zoomOut(e.x, e.y);
		}
	}

	@Override
	public void mouseMove(MouseEvent e) {
		if (leftMouseButtonPressed) {
			int diffX = e.x - lastX;
			int diffY = e.y - lastY;

			lastX = e.x;
			lastY = e.y;

			// Did we move from the spot where the mouse went down?
			if (diffX != 0 || diffY != 0) {
				// This is a translation of the map then
				// update the canvas translation
				translationX += diffX;
				translationY += diffY;
				transformationChanged = true;
				redraw();
			}
		}
	}

	@Override
	public void mouseEnter(MouseEvent e) {
	}

	@Override
	public void mouseExit(MouseEvent e) {
	}

	@Override
	public void mouseHover(MouseEvent e) {
		// Try to get the polygon that matches the position of the mouse
		StemPolygon polygon = getPolygon(e.x, e.y);

		if (polygon == null) {
			tooltip.setText("No region");
			return;
		}

		// We want to get the ISO-key for the identifiable, it will be
		// at the end of the value of the dublin core "identifier"
		// attribute
		String toolTipText = null;
		Identifiable identifiable = polygon.getIdentifiable();
		String dcIdentifier = identifiable.getDublinCore().getIdentifier();
		String isoKey = dcIdentifier
				.substring(dcIdentifier.lastIndexOf("/") + 1);

		if (isoKey == null || isoKey.equals("")) {
			tooltip.setText(polygon.getIdentifiable().getDublinCore()
					.getTitle());
			return;
		}

		boolean retry = true;

		while (retry) {
			try {
				StringBuilder sb = new StringBuilder(
						GeographicNames.getName(isoKey));
				Region region = (Region) identifiable;
				STEMTime time = simulation.getScenario().getSequencer()
						.getCurrentTime();
				Point2D.Double latLongPosition = getInversedPoint(e.x, e.y);

				sb.append(" (" + isoKey + ")");

				for (NodeLabel nextLabel : region.getLabels()) {
					if (nextLabel instanceof PopulationModelLabel) {
						sb.append("\nPopulation (now): " + nextLabel);
					} else if (nextLabel instanceof PopulationLabel) {
						sb.append("\nPopulation ("
								+ ((PopulationLabel) nextLabel).getValidYear()
								+ "):" + nextLabel);
					} else if (nextLabel instanceof AreaLabel) {
						sb.append("\nArea: " + nextLabel);
					} else if (nextLabel instanceof StandardDiseaseModelLabel) {
						sb.append("\n"
								+ ((StandardDiseaseModelLabel) nextLabel)
										.toTooltipString());
					}
				}

				sb.append("\nLatitude: " + latLongPosition.y + ", Longitude: "
						+ latLongPosition.x);
				sb.append("\nTime: " + time);
				toolTipText = sb.toString();
				retry = false;
			} catch (ConcurrentModificationException cme) {
				retry = true; // Should be rare, just retry
			}
		}

		tooltip.setText(toolTipText);
	}
	
	@Override
	public void controlMoved(ControlEvent e) {		
	}

	@Override
	public void controlResized(ControlEvent e) {
		transformationChanged = true;
	}

	@Override
	public void propertyChange(PropertyChangeEvent event) {
		if (!isDisposed()) {
			redraw();
		}
	}

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}

	@Override
	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
	}

	@Override
	public ISelection getSelection() {
		return selection;
	}

	@Override
	public void setSelection(ISelection selection) {
		this.selection = selection;
		fireSelection(selection);
	}

	public void addPaneChangeListener(Observer listener) {
		this.paneChangeSubject.addObserver(listener);
	}

	public void removePaneChangeListener(Observer listener) {
		this.paneChangeSubject.deleteObserver(listener);
	}

	@Override
	public void dispose() {
		removePaintListener(this);
		removeMouseWheelListener(this);
		removeMouseMoveListener(this);
		removeKeyListener(this);
		removeDisposeListener(this);
		removeMouseListener(this);
		removeMouseTrackListener(this);
	}

	public void render(StemPolygonList polygonsToRender, ISimulation sim) {
		simulation = sim;
		this.polygonsToRender = polygonsToRender;

		updateScaleLogLinLabel();

		if (!initialTransformationComputed) {
			this.loadMenuSettings(sim);
			MenuManager menuManager = this.createContextMenuManager();
			this.setMenu(menuManager.createContextMenu(this));
			if (computeTransform(true)) {
				initialTransformationComputed = true;
			} else {
				this.setMenu(null);
			}
		}

		for (StemPolygon stempoly : polygonsToRender) {
			stempoly.computeTransformedPoints(translationX, translationY,
					scaleX, scaleY);
		}

		if (!isDisposed()) {
			redraw();
		}
	}

	public void setDrawPolygonBorders(boolean drawPolygonBorders) {
		this.drawPolygonBorders = drawPolygonBorders;
	}

	public void setGainFactor(double gainFactor) {
		this.gainFactor = gainFactor;
	}

	public void setEdgeGainFactor(double edgeGainFactor) {
		this.edgeGainFactor = edgeGainFactor;
	}

	public void setUseLogScaling(boolean useLogScaling) {
		this.useLogScaling = useLogScaling;
	}

	public void setUseLogEdgeScaling(boolean useLogEdgeScaling) {
		this.useLogEdgeScaling = useLogEdgeScaling;
	}

	public void setAdjustEdgeThickness(boolean adjustEdgeThickness) {
		this.adjustEdgeThickness = adjustEdgeThickness;
	}

	public void setColorProvider(ColorProviderAdapter colorProvider) {
		this.colorProvider = colorProvider;
	}

	public void showOptionsBar(boolean show) {
		this.showOptionsBar = show;
		this.ctrl.showOptionsBar(show);
	}

	public void reset() {
		// Reset the gain factor and update the checks in the context menu
		lastGainFactorAction.setChecked(false);
		defaultGainFactorAction.setChecked(true);

		lastEdgeGainFactorAction.setChecked(false);
		defaultEdgeGainFactorAction.setChecked(true);

		useLogScaling = INITIAL_USE_LOG_SCALING;
		logarithmicAction.setChecked(useLogScaling);

		useLogEdgeScaling = INITIAL_USE_LOG_EDGE_SCALING;
		logarithmicEdgeAction.setChecked(useLogEdgeScaling);

		drawPolygonBorders = INITIAL_DRAW_POLYGON_BORDERS;
		drawPolygonBordersAction.setChecked(drawPolygonBorders);

		adjustEdgeThickness = INITIAL_ADJUST_EDGE_THICKNESS;
		adjustEdgeThicknessAction.setChecked(adjustEdgeThickness);

		showOptionsBar = INITIAL_SHOW_OPTIONS_VIEW;
		toggleOptionsViewAction.setChecked(showOptionsBar);
		this.showOptionsBar(showOptionsBar);
		resetView();
	}

	public void resetView() {

		if (this.simulation == null) {
			return;
		}

		initialTransformationComputed = false;

		if (computeTransform(false)) {
			initialTransformationComputed = true;
		}

		transformationChanged = true;

		if (!isDisposed()) {
			redraw();
		}
	}

	public void setGainScaleLabel(Label gainScaleLabel) {
		this.gainScaleLabel = gainScaleLabel;
		updateScaleLogLinLabel();
	}

	public Image getCanvasImage() {
		return canvasImage;
	}

	/**
	 * labels the map with current gain and log/lin mode
	 */
	private void updateScaleLogLinLabel() {
		String text = "  ";

		if (simulation != null) {
			text += simulation.getName() + " | ";
		}

		if (useLogScaling) {
			text += Messages.getString("MapMenu.LogScale") + " | ";
		} else {
			text += Messages.getString("MapMenu.LinScale") + " | ";
		}

		text += Messages.getString("MapMenu.Gain") + " x" + gainFactor;

		gainScaleLabel.setText(text);
	}

	private void createImage(Device device, int width, int height,
			StemPolygonList nonSquarePolygons, StemPolygonList squarePolygons,
			List<Color> nonSquareColors, List<Color> squareColors) {
		Color backgroundColor = stdColorProvider.getBackgroundColor();

		image = new Image(device, width, height);
		imageGC = new GC(image);
		imageGC.setBackground(backgroundColor);
		imageGC.fillRectangle(0, 0, width, height);

		int n1 = nonSquarePolygons.size();
		int n2 = squarePolygons.size();

		for (int i = 0; i < n1; i++) {
			if (!nonSquareColors.get(i).equals(backgroundColor)) {
				imageGC.setBackground(nonSquareColors.get(i));
				imageGC.fillPolygon(nonSquarePolygons.get(i).transformedPoints);
			}
		}

		for (int i = 0; i < n2; i++) {
			imageGC.setBackground(squareColors.get(i));
			imageGC.fillPolygon(squarePolygons.get(i).transformedPoints);
		}
	}

	private void updateImage(Device device, int width, int height,
			StemPolygonList nonSquarePolygons, StemPolygonList squarePolygons,
			List<Color> nonSquareColors, List<Color> squareColors) {
		int n1 = nonSquarePolygons.size();
		int n2 = squarePolygons.size();
		boolean nonSquareColorsChanged = false;

		for (int i = 0; i < n1; i++) {
			if (!nonSquareColors.get(i).equals(lastNonSquareColors.get(i))) {
				imageGC.setBackground(nonSquareColors.get(i));
				imageGC.fillPolygon(nonSquarePolygons.get(i).transformedPoints);
				nonSquareColorsChanged = true;
			}
		}

		if (nonSquareColorsChanged) {
			for (int i = 0; i < n2; i++) {
				imageGC.setBackground(squareColors.get(i));
				imageGC.fillPolygon(squarePolygons.get(i).transformedPoints);
			}
		} else {
			for (int i = 0; i < n2; i++) {
				if (!squareColors.get(i).equals(lastSquareColors.get(i))) {
					imageGC.setBackground(squareColors.get(i));
					imageGC.fillPolygon(squarePolygons.get(i).transformedPoints);
				}
			}
		}
	}

	private void computeBorderImage(Device device, int width, int height,
			StemPolygonList nonSquarePolygons, StemPolygonList squarePolygons) {
		Color backgroundColor = stdColorProvider.getBackgroundColor();
		Color borderColor = stdColorProvider.getBordersColor();
		int borderAlpha = stdColorProvider.getBordersAlpha();
		Image memImage = new Image(device, width, height);
		GC gc = new GC(memImage);

		gc.setBackground(backgroundColor);
		gc.fillRectangle(0, 0, width, height);
		gc.setForeground(borderColor);
		gc.setLineWidth(0);

		for (StemPolygon stempoly : nonSquarePolygons) {
			gc.drawPolygon(stempoly.transformedPoints);
		}

		for (StemPolygon stempoly : squarePolygons) {
			gc.fillPolygon(stempoly.transformedPoints);
		}

		for (StemPolygon stempoly : squarePolygons) {
			gc.drawPolygon(stempoly.transformedPoints);
		}

		ImageData data = memImage.getImageData();
		int back = data.palette.getPixel(backgroundColor.getRGB());
		int[] pixels = new int[width * height];
		int startIndex = 0;

		for (int y = 0; y < height; y++) {
			data.getPixels(0, y, width, pixels, startIndex);
			startIndex += width;
		}

		data.alphaData = new byte[width * height];

		for (int i = 0; i < width * height; i++) {
			if (pixels[i] == back) {
				data.alphaData[i] = (byte) 0;
			} else {
				data.alphaData[i] = (byte) borderAlpha;
			}
		}

		borderImage = new Image(device, data);
		memImage.dispose();
	}

	private List<Color> getColors(GC gc, StemPolygonList polygonList) {
		List<Color> colors = new ArrayList<Color>(polygonList.size());

		for (StemPolygon stempoly : polygonList) {
			Color backgroundColor = stdColorProvider.getBackgroundColor();
			STEMColor stemColor;

			if (Double.isNaN(stempoly.getValueToDisplay())) {
				colorProvider.setTarget(stempoly.getIdentifiable());
				stemColor = colorProvider.getColor((float) gainFactor,
						useLogScaling);

			} else {
				double value = Math.min(1.0, stempoly.getValueToDisplay()
						* gainFactor);

				if (useLogScaling) {
					value = Math.log10(value * 9.0 + 1.0);
				}

				stemColor = ((RelativeValueColorProvider) colorProvider)
						.getColorForRelativeValue(value);
			}

			Color color = stemColor.toSWTColor(gc.getDevice());
			double alpha = stemColor.getAlpha();

			if (alpha == 1.0) {
				colors.add(color);
			} else if (alpha * 255 >= 1.0) {
				int r = (int) (alpha * color.getRed() + (1 - alpha)
						* backgroundColor.getRed());
				int g = (int) (alpha * color.getGreen() + (1 - alpha)
						* backgroundColor.getGreen());
				int b = (int) (alpha * color.getBlue() + (1 - alpha)
						* backgroundColor.getBlue());

				colors.add(new Color(gc.getDevice(), r, g, b));
			} else {
				colors.add(backgroundColor);
			}
		}

		return colors;
	}

	private void paintEdge(GC gc, StemPolygon stempoly) {
		gc.setForeground(stdColorProvider.getEdgesColor());
		gc.setLineWidth(3);
		gc.drawLine(stempoly.transformedPoints[0],
				stempoly.transformedPoints[1], stempoly.transformedPoints[2],
				stempoly.transformedPoints[3]);
	}

	private void paintMigrationEdge(GC gc, StemPolygon stempoly) {
		int thickness = 3;

		if (adjustEdgeThickness) {
			double value;

			if (Double.isNaN(stempoly.getValueToDisplay())) {
				MigrationEdge edge = (MigrationEdge) stempoly.getIdentifiable();
				value = edge.getLabel().getCurrentValue().getMigrationRate();
			} else {
				value = stempoly.getValueToDisplay();
			}

			value = Math.min(value * edgeGainFactor, 1.0);

			if (useLogEdgeScaling) {
				value = Math.log10(value * 9.0 + 1.0);
			}

			thickness = (int) Math.ceil(value * 10.0);
		}

		drawArrow(gc, stempoly.transformedPoints[0],
				stempoly.transformedPoints[1], stempoly.transformedPoints[2],
				stempoly.transformedPoints[3], thickness);
	}

	private void drawArrow(GC gc, int x1, int y1, int x2, int y2, int thickness) {
		double angle;

		if (x1 == x2 && y1 == y2) {
			angle = Math.PI * 3.0 / 16.0;
		} else {
			angle = Math.atan2(y1 - y2, x1 - x2);
		}

		int arrowHeadThickness = Math.max(ARROWHEAD_THICKNESS, 2 * thickness);
		int nx = x2 + (int) (ARROWHEAD_LENGTH * Math.cos(angle));
		int ny = y2 + (int) (ARROWHEAD_LENGTH * Math.sin(angle));
		double orthAngle = angle + Math.PI / 2.0;
		int nx1 = nx + (int) (arrowHeadThickness / 2.0 * Math.cos(orthAngle));
		int ny1 = ny + (int) (arrowHeadThickness / 2.0 * Math.sin(orthAngle));
		int nx2 = nx - (int) (arrowHeadThickness / 2.0 * Math.cos(orthAngle));
		int ny2 = ny - (int) (arrowHeadThickness / 2.0 * Math.sin(orthAngle));
		int[] poly = { x2, y2, nx1, ny1, nx2, ny2, x2, y2 };

		gc.setForeground(stdColorProvider.getEdgesColor());
		gc.setBackground(stdColorProvider.getEdgesColor());
		gc.fillPolygon(poly);
		gc.setLineWidth(thickness);

		if (x1 == x2 && y1 == y2) {
			gc.drawOval(x1 - ARROWHEAD_LENGTH, y1, 2 * ARROWHEAD_LENGTH,
					2 * ARROWHEAD_LENGTH);
		} else {
			gc.drawLine(x1, y1, nx, ny);
		}
	}

	private boolean computeTransform(boolean usePreferences) {
		GraphMapPreferences pref = GraphMapPreferences.getInstance();

		int viewId = GraphMapRegistry.getInstance().getViewId(this.view);
		Scenario sce = this.simulation.getScenario();

		IDialogSettings settings = pref.getPreferencesFor(viewId, sce);

		this.scaleFactor = INITIAL_SCALE_FACTOR;

		Rectangle2D.Double polygonsBounds = polygonsToRender.getBounds();

		if (polygonsBounds == null || polygonsBounds.isEmpty()) {
			return false;
		}

		Rectangle canvasBounds = getClientArea();
		double widthRatio = canvasBounds.width / polygonsBounds.width;
		double heightRatio = canvasBounds.height / polygonsBounds.height;
		int canvasCenterX = canvasBounds.x + canvasBounds.width / 2;
		int canvasCenterY = canvasBounds.y + canvasBounds.height / 2;
		double polygonCenterX = polygonsBounds.getCenterX();
		double polygonCenterY = polygonsBounds.getCenterY();
		scaleX = Math.min(widthRatio, heightRatio) * this.scaleFactor;
		scaleY = -scaleX;
		translationX = canvasCenterX - polygonCenterX * scaleX;
		translationY = canvasCenterY - polygonCenterY * scaleY;

		if (usePreferences && settings != null) {
			if (settings
					.get(PreferenceConstants.GRAPHMAP_PERSISTANT_VIEW_SCALE_FACTOR) != null) {
				this.scaleFactor = settings
						.getDouble(PreferenceConstants.GRAPHMAP_PERSISTANT_VIEW_SCALE_FACTOR);
				scaleX = this.scaleFactor;
				scaleY = -scaleX;
				this.translationX = canvasCenterX
						- settings
								.getDouble(PreferenceConstants.GRAPHMAP_PERSISTANT_VIEW_TRANS_X);
				this.translationY = canvasCenterY
						- settings
								.getDouble(PreferenceConstants.GRAPHMAP_PERSISTANT_VIEW_TRANS_Y);
			}
		}
		return true;
	}

	private void zoomIn(int x, int y) {
		Point2D.Double p = getInversedPoint(x, y);

		translationX -= (ZOOMING_FACTOR - 1) * scaleX * p.x;
		translationY -= (ZOOMING_FACTOR - 1) * scaleY * p.y;
		this.scaleFactor *= ZOOMING_FACTOR;
		scaleX *= ZOOMING_FACTOR;
		scaleY *= ZOOMING_FACTOR;
		transformationChanged = true;
		redraw();

	}

	private void zoomOut(int x, int y) {
		Point2D.Double p = getInversedPoint(x, y);

		scaleX /= ZOOMING_FACTOR;
		scaleY /= ZOOMING_FACTOR;
		this.scaleFactor /= ZOOMING_FACTOR;
		translationX += (ZOOMING_FACTOR - 1) * scaleX * p.x;
		translationY += (ZOOMING_FACTOR - 1) * scaleY * p.y;
		transformationChanged = true;
		redraw();
	}

	private StemPolygon getPolygon(int x, int y) {
		Point2D.Double point = getInversedPoint(x, y);
		StemPolygon retValue = null;

		if (point != null && polygonsToRender != null) {
			// Find the Polygon that contains the lat/long coordinates
			retValue = polygonsToRender.getContainingRegionPolygon(point);
		}

		return retValue;
	}

	private void fireSelection(ISelection selection) {
		SelectionChangedEvent event = new SelectionChangedEvent(this, selection);

		for (ISelectionChangedListener listener : selectionChangedListeners) {
			listener.selectionChanged(event);
		}
	}

	private Point2D.Double getInversedPoint(int x, int y) {
		return new Point2D.Double((x - translationX) / scaleX,
				(y - translationY) / scaleY);
	}

	private void loadMenuSettings(ISimulation sim) {
		GraphMapPreferences pref = GraphMapPreferences.getInstance();

		int viewId = GraphMapRegistry.getInstance().getViewId(this.view);
		Scenario sce = this.simulation.getScenario();

		IDialogSettings settings = pref.getPreferencesFor(viewId, sce);
		// set graphmap view options
		drawPolygonBorders = INITIAL_DRAW_POLYGON_BORDERS;
		useLogScaling = INITIAL_USE_LOG_SCALING;
		useLogEdgeScaling = INITIAL_USE_LOG_EDGE_SCALING;
		gainFactor = INITIAL_GAIN_FACTOR;
		edgeGainFactor = INITIAL_EDGE_GAIN_FACTOR;
		adjustEdgeThickness = INITIAL_ADJUST_EDGE_THICKNESS;
		showOptionsBar = INITIAL_SHOW_OPTIONS_VIEW;
		if (settings == null) {
			return;
		}
		if (settings
				.get(PreferenceConstants.GRAPHMAP_PERSISTANT_DRAW_POLYGON_BORDERS) != null) {
			this.drawPolygonBorders = settings
					.getBoolean(PreferenceConstants.GRAPHMAP_PERSISTANT_DRAW_POLYGON_BORDERS);
		}
		if (settings
				.get(PreferenceConstants.GRAPHMAP_PERSISTANT_USE_LOG_SCALING) != null) {
			this.useLogScaling = settings
					.getBoolean(PreferenceConstants.GRAPHMAP_PERSISTANT_USE_LOG_SCALING);
		}
		if (settings
				.get(PreferenceConstants.GRAPHMAP_PERSISTANT_USE_LOG_EDGE_SCALING) != null) {
			this.useLogEdgeScaling = settings
					.getBoolean(PreferenceConstants.GRAPHMAP_PERSISTANT_USE_LOG_EDGE_SCALING);
		}
		if (settings.get(PreferenceConstants.GRAPHMAP_PERSISTANT_GAIN_FACTOR) != null) {
			this.gainFactor = settings
					.getDouble(PreferenceConstants.GRAPHMAP_PERSISTANT_GAIN_FACTOR);
		}
		if (settings
				.get(PreferenceConstants.GRAPHMAP_PERSISTANT_EDGE_GAIN_FACTOR) != null) {
			this.edgeGainFactor = settings
					.getDouble(PreferenceConstants.GRAPHMAP_PERSISTANT_EDGE_GAIN_FACTOR);
		}
		if (settings
				.get(PreferenceConstants.GRAPHMAP_PERSISTANT_ADJUST_EDGE_THICKNESS) != null) {
			this.adjustEdgeThickness = settings
					.getBoolean(PreferenceConstants.GRAPHMAP_PERSISTANT_ADJUST_EDGE_THICKNESS);
		}
		if (settings
				.get(PreferenceConstants.GRAPHMAP_PERSISTANT_SHOW_OPTIONS_VIEW) != null) {
			this.showOptionsBar = settings
					.getBoolean(PreferenceConstants.GRAPHMAP_PERSISTANT_SHOW_OPTIONS_VIEW);
			this.showOptionsBar(this.showOptionsBar);
		}
	}

	/**
	 * Create the view's context menu and add the action handlers to it.
	 * 
	 * @return the MenuManager
	 */
	private MenuManager createContextMenuManager() {

		// Context Menu
		MenuManager contextMenuManager = new MenuManager();
		contextMenuManager.add(createGainFactorMenu(this.gainFactor));

		logarithmicAction = new LogarithmicAction();
		contextMenuManager.add(logarithmicAction);

		contextMenuManager.add(new Separator());
		drawPolygonBordersAction = new DrawPolygonBordersAction();
		contextMenuManager.add(drawPolygonBordersAction);

		// connectPolygonCentersAction = new ConnectPolygonCentersAction();
		// contextMenuManager.add(connectPolygonCentersAction);

		contextMenuManager.add(new Separator());

		adjustEdgeThicknessAction = new AdjustEdgeThicknessAction();
		contextMenuManager.add(adjustEdgeThicknessAction);
		contextMenuManager.add(createEdgeGainFactorMenu(this.edgeGainFactor));
		logarithmicEdgeAction = new LogarithmicEdgeAction();
		contextMenuManager.add(logarithmicEdgeAction);

		contextMenuManager.add(new Separator());

		// ---------------------------------------------------------------------

		contextMenuManager.add(new ResetViewAction());
		contextMenuManager.add(new ResetMapCanvasAction());

		contextMenuManager.add(new Separator());
		// ---------------------------------------------------------------------
		toggleOptionsViewAction = new ToggleOptionsViewAction();
		contextMenuManager.add(toggleOptionsViewAction);

		// Place Holder for Menu Additions
		contextMenuManager.add(new Separator(
				IWorkbenchActionConstants.MB_ADDITIONS));

		// ---------------------------------------------------------------------

		return contextMenuManager;

	} // createContextMenu

	/**
	 * @return
	 */
	private MenuManager createGainFactorMenu(double defaultFactor) {
		MenuManager gainFactorMenu = new MenuManager(
				Messages.getString("MapMenu.GainFactor"));
		for (int i = -7; i < 7; i++) {
			double factor = Math.pow(10, i);
			GainFactorAction action = new GainFactorAction(factor);
			gainFactorMenu.add(action);
			if (factor == defaultFactor) {
				this.defaultGainFactorAction = action;
				this.lastGainFactorAction = action;
			}
		}
		return gainFactorMenu;
	}

	private MenuManager createEdgeGainFactorMenu(double defaultFactor) {
		MenuManager edgeGainFactorMenu = new MenuManager(
				Messages.getString("MapMenu.EdgeGainFactor"));
		for (int i = -7; i < 7; i++) {
			double factor = Math.pow(10, i);
			EdgeGainFactorAction action = new EdgeGainFactorAction(factor);
			edgeGainFactorMenu.add(action);
			if (factor == defaultFactor) {
				this.defaultEdgeGainFactorAction = action;
				this.lastEdgeGainFactorAction = action;
			}
		}
		return edgeGainFactorMenu;
	}

	private String getText(double factor) {
		NumberFormat format = NumberFormat.getNumberInstance();

		format.setMaximumFractionDigits(10);

		NumberFormatter formatter = new NumberFormatter(format);
		String retValue = "";
		try {
			retValue = formatter.valueToString(Double.valueOf(factor));
		} catch (ParseException e) {
			Activator.logError("Problem parsing gain factor value \"" + factor
					+ "\"", e);
		}
		return retValue;
	}

	private Color getInvertedColor(Color color) {
		return new Color(color.getDevice(), 255 - color.getRed(),
				255 - color.getGreen(), 255 - color.getBlue());
	}

	private class GainFactorAction extends Action {

		private double factor;

		GainFactorAction(double factor) {
			super(GraphMapCanvas.this.getText(factor), IAction.AS_RADIO_BUTTON);
			this.factor = factor;
			setChecked(factor == gainFactor);
		}

		@Override
		public String getText() {
			return GraphMapCanvas.this.getText(factor);
		}

		@Override
		public void run() {
			gainFactor = factor;
			lastGainFactorAction = this;
			GraphMapPreferences pref = GraphMapPreferences.getInstance();
			pref.updatePreferenceState(GraphMapRegistry.getInstance()
					.getViewId(view), simulation,
					PreferenceConstants.GRAPHMAP_PERSISTANT_GAIN_FACTOR,
					gainFactor);
			updateScaleLogLinLabel();
			redraw();
		}
	}

	private class EdgeGainFactorAction extends Action {

		private double factor;

		EdgeGainFactorAction(double factor) {
			super(GraphMapCanvas.this.getText(factor), IAction.AS_RADIO_BUTTON);
			this.factor = factor;
			setChecked(factor == edgeGainFactor);
		}

		@Override
		public String getText() {
			return GraphMapCanvas.this.getText(factor);
		}

		@Override
		public void run() {
			edgeGainFactor = factor;
			lastEdgeGainFactorAction = this;
			GraphMapPreferences pref = GraphMapPreferences.getInstance();
			pref.updatePreferenceState(GraphMapRegistry.getInstance()
					.getViewId(view), simulation,
					PreferenceConstants.GRAPHMAP_PERSISTANT_EDGE_GAIN_FACTOR,
					edgeGainFactor);
			redraw();
		}
	}

	private class LogarithmicAction extends Action {

		public LogarithmicAction() {
			super(Messages.getString("MapMenu.Logrithmic_Scaling"),
					IAction.AS_CHECK_BOX);
			setChecked(useLogScaling);
		}

		@Override
		public String getText() {
			return Messages.getString("MapMenu.Logrithmic_Scaling");
		}

		@Override
		public void run() {
			useLogScaling = !useLogScaling;
			GraphMapPreferences pref = GraphMapPreferences.getInstance();
			pref.updatePreferenceState(GraphMapRegistry.getInstance()
					.getViewId(view), simulation,
					PreferenceConstants.GRAPHMAP_PERSISTANT_USE_LOG_SCALING,
					useLogScaling);
			updateScaleLogLinLabel();
			redraw();
		}
	}

	private class LogarithmicEdgeAction extends Action {

		public LogarithmicEdgeAction() {
			super(Messages.getString("MapMenu.Logrithmic_EdgeScaling"),
					IAction.AS_CHECK_BOX);
			setChecked(useLogEdgeScaling);
		}

		@Override
		public String getText() {
			return Messages.getString("MapMenu.Logrithmic_EdgeScaling");
		}

		@Override
		public void run() {
			useLogEdgeScaling = !useLogEdgeScaling;
			GraphMapPreferences pref = GraphMapPreferences.getInstance();
			pref.updatePreferenceState(
					GraphMapRegistry.getInstance().getViewId(view),
					simulation,
					PreferenceConstants.GRAPHMAP_PERSISTANT_USE_LOG_EDGE_SCALING,
					useLogEdgeScaling);
			redraw();
		}
	}

	private class AdjustEdgeThicknessAction extends Action {
		public AdjustEdgeThicknessAction() {
			super(Messages.getString("MapMenu.AdjustEdgeThickness"),
					IAction.AS_CHECK_BOX);
			setChecked(adjustEdgeThickness);
		}

		@Override
		public String getText() {
			return Messages.getString("MapMenu.AdjustEdgeThickness");
		}

		@Override
		public void run() {
			adjustEdgeThickness = !adjustEdgeThickness;
			GraphMapPreferences pref = GraphMapPreferences.getInstance();
			pref.updatePreferenceState(
					GraphMapRegistry.getInstance().getViewId(view),
					simulation,
					PreferenceConstants.GRAPHMAP_PERSISTANT_ADJUST_EDGE_THICKNESS,
					adjustEdgeThickness);
			redraw();
		}
	}

	private class ResetViewAction extends Action {
		@Override
		public String getText() {
			return Messages.getString("MapMenu.ResetView");
		}

		@Override
		public void run() {
			resetView();
		}
	}

	private class DrawPolygonBordersAction extends Action {

		public DrawPolygonBordersAction() {
			super(Messages.getString("MapMenu.Polygon_Borders"),
					IAction.AS_CHECK_BOX);

			if (drawPolygonBorders) {
				setChecked(true);
			}
		}

		@Override
		public String getText() {
			return Messages.getString("MapMenu.Polygon_Borders");
		}

		@Override
		public void run() {
			drawPolygonBorders = !drawPolygonBorders;
			GraphMapPreferences pref = GraphMapPreferences.getInstance();
			pref.updatePreferenceState(
					GraphMapRegistry.getInstance().getViewId(view),
					simulation,
					PreferenceConstants.GRAPHMAP_PERSISTANT_DRAW_POLYGON_BORDERS,
					drawPolygonBorders);
			redraw();
		}
	}

	private class ResetMapCanvasAction extends Action {

		@Override
		public String getText() {
			return Messages.getString("MapMenu.Reset");
		}

		@Override
		public void run() {
			reset();
		}
	}

	private class ToggleOptionsViewAction extends Action {

		public ToggleOptionsViewAction() {
			super(Messages.getString("MapMenu.ToggleOptionsView"),
					IAction.AS_CHECK_BOX);
			this.setChecked(showOptionsBar);
		}

		@Override
		public String getText() {
			return Messages.getString("MapMenu.ToggleOptionsView");
		}

		@Override
		public void run() {
			showOptionsBar = this.isChecked();
			showOptionsBar(showOptionsBar);
			GraphMapPreferences pref = GraphMapPreferences.getInstance();
			pref.updatePreferenceState(GraphMapRegistry.getInstance()
					.getViewId(view), simulation,
					PreferenceConstants.GRAPHMAP_PERSISTANT_SHOW_OPTIONS_VIEW,
					showOptionsBar);
		}
	}

}
