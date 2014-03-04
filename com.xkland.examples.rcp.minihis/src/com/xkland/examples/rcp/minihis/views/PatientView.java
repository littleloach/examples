package com.xkland.examples.rcp.minihis.views;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class PatientView extends ViewPart {
	private TreeViewer patientViewer;
	@Override
	public void createPartControl(Composite parent) {
		patientViewer = new TreeViewer(parent,SWT.V_SCROLL);
		
	}

	@Override
	public void setFocus() {
		// TODO 自动生成的方法存根

	}

}
