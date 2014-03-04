package com.xkland.examples.rcp.minihis.views;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class DepartmentDetailView extends ViewPart {
	private TableViewer departmentDetail;
	@Override
	public void createPartControl(Composite parent) {
		departmentDetail = new TableViewer(parent,SWT.BORDER | SWT.V_SCROLL);

	}

	@Override
	public void setFocus() {
		// TODO 自动生成的方法存根

	}

}
