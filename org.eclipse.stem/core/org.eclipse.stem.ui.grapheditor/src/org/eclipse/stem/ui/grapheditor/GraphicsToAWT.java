package org.eclipse.stem.ui.grapheditor;

import java.awt.BasicStroke;
import java.awt.Polygon;
import java.awt.Stroke;
import java.util.Deque;
import java.util.LinkedList;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.LineAttributes;

public class GraphicsToAWT extends Graphics {

	private java.awt.Graphics2D awtGraphics;
	private Rectangle clip;
	private Color foregroundColor;
	private Color backgroundColor;
	private LineAttributes lineAttributes;

	private Deque<State> states;

	public GraphicsToAWT(java.awt.Graphics2D awtGraphics, Dimension size) {
		this.awtGraphics = awtGraphics;
		clip = new Rectangle(0, 0, size.width, size.height);
		foregroundColor = ColorConstants.black;
		backgroundColor = ColorConstants.black;
		lineAttributes = new LineAttributes(0);
		states = new LinkedList<State>();

		awtGraphics.setClip(clip.x, clip.y, clip.width, clip.height);
	}

	@Override
	public void clipRect(Rectangle r) {
		// TODO
	}

	@Override
	public void dispose() {
		awtGraphics.dispose();
	}

	@Override
	public void drawArc(int x, int y, int w, int h, int offset, int length) {
		awtGraphics.drawArc(x, y, w, h, offset, length);
	}

	@Override
	public void drawFocus(int x, int y, int w, int h) {
		// TODO
	}

	@Override
	public void drawImage(Image srcImage, int x, int y) {
		// TODO
	}

	@Override
	public void drawImage(Image srcImage, int x1, int y1, int w1, int h1,
			int x2, int y2, int w2, int h2) {
		// TODO
	}

	@Override
	public void drawLine(int x1, int y1, int x2, int y2) {
		awtGraphics.setColor(convertToAWT(foregroundColor));
		awtGraphics.setStroke(convertToAWT(lineAttributes));
		awtGraphics.drawLine(x1, y1, x2, y2);
	}

	@Override
	public void drawOval(int x, int y, int w, int h) {
		awtGraphics.setColor(convertToAWT(foregroundColor));
		awtGraphics.setStroke(convertToAWT(lineAttributes));
		awtGraphics.drawOval(x, y, w, h);
	}

	@Override
	public void drawPolygon(PointList points) {
		awtGraphics.setColor(convertToAWT(foregroundColor));
		awtGraphics.setStroke(convertToAWT(lineAttributes));
		awtGraphics.drawPolygon(convertToAWT(points));
	}

	@Override
	public void drawPolyline(PointList points) {
		Polygon p = convertToAWT(points);

		awtGraphics.setColor(convertToAWT(foregroundColor));
		awtGraphics.setStroke(convertToAWT(lineAttributes));
		awtGraphics.drawPolyline(p.xpoints, p.ypoints, p.npoints);
	}

	@Override
	public void drawRectangle(int x, int y, int w, int h) {
		awtGraphics.setColor(convertToAWT(foregroundColor));
		awtGraphics.setStroke(convertToAWT(lineAttributes));
		awtGraphics.drawRect(x, y, w, h);
	}

	@Override
	public void drawRoundRectangle(Rectangle r, int arcWidth, int arcHeight) {
		awtGraphics.setColor(convertToAWT(foregroundColor));
		awtGraphics.setStroke(convertToAWT(lineAttributes));
		awtGraphics.drawRoundRect(r.x, r.y, r.width, r.height, arcWidth,
				arcHeight);
	}

	@Override
	public void drawString(String s, int x, int y) {
		awtGraphics.setColor(convertToAWT(foregroundColor));
		awtGraphics.drawString(s, x, y);
	}

	@Override
	public void drawText(String s, int x, int y) {
		awtGraphics.setColor(convertToAWT(foregroundColor));
		awtGraphics.drawString(s, x, y);
	}

	@Override
	public void fillArc(int x, int y, int w, int h, int offset, int length) {
		awtGraphics.setColor(convertToAWT(backgroundColor));
		awtGraphics.fillArc(x, y, w, h, offset, length);
	}

	@Override
	public void fillGradient(int x, int y, int w, int h, boolean vertical) {
		awtGraphics.setColor(convertToAWT(backgroundColor));
		awtGraphics.fillRect(x, y, w, h);
	}

	@Override
	public void fillOval(int x, int y, int w, int h) {
		awtGraphics.setColor(convertToAWT(backgroundColor));
		awtGraphics.fillOval(x, y, w, h);
	}

	@Override
	public void fillPolygon(PointList points) {
		awtGraphics.setColor(convertToAWT(backgroundColor));
		awtGraphics.fillPolygon(convertToAWT(points));
	}

	@Override
	public void fillRectangle(int x, int y, int w, int h) {
		awtGraphics.setColor(convertToAWT(backgroundColor));
		awtGraphics.fillRect(x, y, w, h);
	}

	@Override
	public void fillRoundRectangle(Rectangle r, int arcWidth, int arcHeight) {
		awtGraphics.setColor(convertToAWT(backgroundColor));
		awtGraphics.fillRoundRect(r.x, r.y, r.width, r.height, arcWidth,
				arcHeight);
	}

	@Override
	public void fillString(String s, int x, int y) {
		awtGraphics.setColor(convertToAWT(backgroundColor));
		awtGraphics.drawString(s, x, y);
	}

	@Override
	public void fillText(String s, int x, int y) {
		awtGraphics.setColor(convertToAWT(backgroundColor));
		awtGraphics.drawString(s, x, y);
	}

	@Override
	public Color getBackgroundColor() {
		return backgroundColor;
	}

	@Override
	public Rectangle getClip(Rectangle rect) {
		// TODO
		return clip;
	}

	@Override
	public Font getFont() {
		// TODO
		return null;
	}

	@Override
	public FontMetrics getFontMetrics() {
		// TODO
		return null;
	}

	@Override
	public Color getForegroundColor() {
		return foregroundColor;
	}

	@Override
	public int getLineStyle() {
		return lineAttributes.style;
	}

	@Override
	public int getLineWidth() {
		return (int) lineAttributes.width;
	}

	@Override
	public float getLineWidthFloat() {
		return lineAttributes.width;
	}

	@Override
	public boolean getXORMode() {
		// TODO
		return false;
	}

	@Override
	public void popState() {
		restoreState();
		states.removeFirst();
	}

	@Override
	public void pushState() {
		states.addFirst(new State(backgroundColor, foregroundColor,
				lineAttributes));
	}

	@Override
	public void restoreState() {
		State s = states.getFirst();

		backgroundColor = s.backgroundColor;
		foregroundColor = s.foregroundColor;
		lineAttributes = s.lineAttributes;
	}

	@Override
	public void scale(double amount) {
		// TODO
	}

	@Override
	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	@Override
	public void setClip(Rectangle r) {
		// TODO
	}

	@Override
	public void setFont(Font f) {
		// TODO
	}

	@Override
	public void setForegroundColor(Color foregroundColor) {
		this.foregroundColor = foregroundColor;
	}

	@Override
	public void setLineStyle(int style) {
		lineAttributes.style = style;
	}

	@Override
	public void setLineWidth(int width) {
		lineAttributes.width = Math.max(1.0f, width);
	}

	@Override
	public void setLineWidthFloat(float width) {
		lineAttributes.width = Math.max(1.0f, width);
	}

	@Override
	public void setLineMiterLimit(float miterLimit) {
		lineAttributes.miterLimit = miterLimit;
	}

	@Override
	public void setXORMode(boolean b) {
		// TODO
	}

	@Override
	public void translate(int dx, int dy) {
		// TODO
	}

	@Override
	public void setLineAttributes(LineAttributes lineAttributes) {
		this.lineAttributes = lineAttributes;
	}

	private java.awt.Color convertToAWT(Color color) {
		return new java.awt.Color(color.getRed(), color.getGreen(),
				color.getBlue());
	}

	private Polygon convertToAWT(PointList points) {
		int[] xs = new int[points.size()];
		int[] ys = new int[points.size()];

		for (int i = 0; i < points.size(); i++) {
			Point p = points.getPoint(i);

			xs[i] = p.x;
			ys[i] = p.y;
		}

		return new Polygon(xs, ys, points.size());
	}

	private Stroke convertToAWT(LineAttributes lineAttributes) {
		float width = 1.0f;
		int cap = BasicStroke.CAP_SQUARE;
		int join = BasicStroke.JOIN_MITER;
		float miterLimit = 10.0f;
		float[] dash = null;
		float dashOffset = 0.0f;

		switch (lineAttributes.style) {
		case SWT.LINE_CUSTOM:
			dash = lineAttributes.dash;
			dashOffset = lineAttributes.dashOffset;
			break;
		case SWT.LINE_DASH:
			// TODO
			break;
		case SWT.LINE_DASHDOT:
			// TODO
			break;
		case SWT.LINE_DASHDOTDOT:
			// TODO
			break;
		case SWT.LINE_DOT:
			dash = new float[] { 1.0f, 2.0f };
			dashOffset = 0.0f;
			break;
		case SWT.LINE_SOLID:
			dash = null;
			dashOffset = 0.0f;
			break;
		}

		return new BasicStroke(width, cap, join, miterLimit, dash, dashOffset);
	}

	private class State {
		private Color backgroundColor;
		private Color foregroundColor;
		private LineAttributes lineAttributes;

		public State(Color backgroundColor, Color foregroundColor,
				LineAttributes lineAttributes) {
			this.backgroundColor = backgroundColor;
			this.foregroundColor = foregroundColor;
			this.lineAttributes = lineAttributes;
		}	
	}

}
