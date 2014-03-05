package com.xkland.examples.rcp.minihis.jface;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.xkland.examples.rcp.minihis.models.Department;

public class DepartmentContentProvider implements IStructuredContentProvider {

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
		if(inputElement instanceof Department){
			return ((Department)inputElement).getPatients().toArray();
		}
		return null;
	}

}
