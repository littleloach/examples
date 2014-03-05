package com.xkland.examples.rcp.minihis.jface;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import com.xkland.examples.rcp.minihis.models.Department;
import com.xkland.examples.rcp.minihis.models.Patient;

public class SelectionLabelProvider implements ILabelProvider {

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO 自动生成的方法存根

	}

	@Override
	public void dispose() {
		// TODO 自动生成的方法存根

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO 自动生成的方法存根

	}

	@Override
	public Image getImage(Object element) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public String getText(Object element) {
		if(element instanceof Department){
			return "Department:" + ((Department)element).getName();
		}
		if(element instanceof Patient){
			return "Patient:" + ((Patient)element).getName();
		}
		return element.toString();
	}

}
