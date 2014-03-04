package com.xkland.examples.rcp.minihis.jface;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import com.xkland.examples.rcp.minihis.models.Department;
import com.xkland.examples.rcp.minihis.models.Gender;
import com.xkland.examples.rcp.minihis.models.Patient;

public class PatientLabelProvider implements ILabelProvider {

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
		if(element instanceof Department){
			return new Image(null, this.getClass().getResourceAsStream("/icons/department_24.png"));
		}
		if(element instanceof Patient){
			Patient patient = (Patient)element;
			if(patient.getGender() == Gender.MALE){
				return new Image(null, this.getClass().getResourceAsStream("/icons/male_24.png"));
			}
			if(patient.getGender() == Gender.FEMALE){
				return new Image(null, this.getClass().getResourceAsStream("/icons/female_24.png"));
			}
		}
		return null;
	}

	@Override
	public String getText(Object element) {
		if(element instanceof Department){
			return ((Department)element).getName();
		}
		if(element instanceof Patient){
			return ((Patient)element).getId() + "床 " + ((Patient)element).getName();
		}
		return null;
	}

}
