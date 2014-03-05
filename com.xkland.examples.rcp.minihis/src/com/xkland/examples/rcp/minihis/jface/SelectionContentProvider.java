package com.xkland.examples.rcp.minihis.jface;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;

public class SelectionContentProvider implements IStructuredContentProvider {

	@Override
	public void dispose() {
		// TODO 自动生成的方法存根

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO 自动生成的方法存根

	}

	@Override
	public Object[] getElements(Object inputElement) {
		if(inputElement instanceof IStructuredSelection){
			return ((IStructuredSelection)inputElement).toArray();
		}else{
			return new Object[]{"Not structured selection"};
		}
	}

}
