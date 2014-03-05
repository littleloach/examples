package com.xkland.examples.rcp.minihis.jface;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

import com.xkland.examples.rcp.minihis.models.Gender;
import com.xkland.examples.rcp.minihis.models.Patient;

public class DepartmentDetailLabelProvider implements ITableLabelProvider {

	@Override
	public String getColumnText(Object element, int columnIndex) {
		if(element instanceof Patient){
			Patient patient = (Patient)element;
			switch(columnIndex){
			case 0:
				return Integer.toString(patient.getId())+"床";
			case 1:
				return patient.getName();
			case 2:
				if(patient.getGender() == Gender.MALE){
					return "男";
				}else{
					return "女";
				}
			case 3:
				return Integer.toString(patient.getAge())+"岁";
			}
		}
		return null;
	}

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
	public Image getColumnImage(Object element, int columnIndex) {
		// TODO 自动生成的方法存根
		return null;
	}

}
