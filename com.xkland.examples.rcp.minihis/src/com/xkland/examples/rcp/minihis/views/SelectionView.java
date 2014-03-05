package com.xkland.examples.rcp.minihis.views;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import com.xkland.examples.rcp.minihis.jface.SelectionContentProvider;
import com.xkland.examples.rcp.minihis.jface.SelectionLabelProvider;

public class SelectionView extends ViewPart implements ISelectionListener {
	private ListViewer selectionList;
	
	public ListViewer getSelectionList() {
		return selectionList;
	}

	@Override
	public void createPartControl(Composite parent) {
		selectionList = new ListViewer(parent, SWT.BORDER | SWT.V_SCROLL);
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(this);
		selectionList.setContentProvider(new SelectionContentProvider());
		selectionList.setLabelProvider(new SelectionLabelProvider());
	}

	@Override
	public void setFocus() {
		// TODO 自动生成的方法存根

	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		selectionList.setInput(selection);
	}

}
