package com.xkland.examples.rcp.minihis.jface;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.xkland.examples.rcp.minihis.models.Department;
import com.xkland.examples.rcp.minihis.models.Inpatient;
import com.xkland.examples.rcp.minihis.models.Patient;

public class PatientContentProvider implements ITreeContentProvider {

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
		if(inputElement instanceof Inpatient){
			return ((Inpatient)inputElement).getDepartments();
		}
		return null;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if(parentElement instanceof Department){
			return ((Department)parentElement).getPatients().toArray();
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		if(element instanceof Patient){
			return ((Patient)element).getDepartment();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if(element instanceof Department){
			return true;
		}
		return false;
	}

}
