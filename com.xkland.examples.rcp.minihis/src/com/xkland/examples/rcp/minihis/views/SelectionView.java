package com.xkland.examples.rcp.minihis.views;

import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class SelectionView extends ViewPart {
	private ListViewer selectionList;
	@Override
	public void createPartControl(Composite parent) {
		selectionList = new ListViewer(parent, SWT.BORDER | SWT.V_SCROLL);

	}

	@Override
	public void setFocus() {
		// TODO 自动生成的方法存根

	}

}
