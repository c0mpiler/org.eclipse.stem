package org.eclipse.stem.ui.grapheditor;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class DynamicText extends Composite implements ModifyListener {

	private Text text;

	public DynamicText(Composite parent, String name, boolean editable) {
		super(parent, SWT.BORDER);
		setLayout(new GridLayout(2, false));

		Label label = new Label(this, SWT.NONE);
		label.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true));
		label.setText(name + ":");

		text = new Text(this, SWT.NONE);
		text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		text.addModifyListener(this);
		text.setEditable(editable);
		text.setBackground(Display.getCurrent().getSystemColor(
				SWT.COLOR_LIST_BACKGROUND));
	}

	@Override
	public Point computeSize(int wHint, int hHint, boolean changed) {
		Point size = super.computeSize(wHint, hHint, changed);

		if (text.getEditable()) {
			return new Point(size.x + 10, size.y);
		} else {
			return size;
		}
	}

	@Override
	protected void checkSubclass() {
	}

	@Override
	public void modifyText(ModifyEvent e) {		
		getParent().layout(true);
		getShell().layout(true);
	}

	public void addModifyListener(ModifyListener listener) {
		text.addModifyListener(listener);
	}

	public void setText(String s) {
		text.setText(s);
	}

	public void setEditable(boolean editable) {
		text.setEditable(editable);
	}

}
