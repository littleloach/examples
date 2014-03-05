package com.xkland.examples.rcp.minihis.views;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.xkland.examples.rcp.minihis.jface.PatientContentProvider;
import com.xkland.examples.rcp.minihis.jface.PatientLabelProvider;
import com.xkland.examples.rcp.minihis.models.Department;
import com.xkland.examples.rcp.minihis.models.Gender;
import com.xkland.examples.rcp.minihis.models.Inpatient;
import com.xkland.examples.rcp.minihis.models.Patient;

public class PatientView extends ViewPart {
	private TreeViewer patientViewer;
	Inpatient inpatient = new Inpatient();
	@Override
	public void createPartControl(Composite parent) {
		patientViewer = new TreeViewer(parent,SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);
		//创建一点点初始化数据，以便测试用
		Department surgery = inpatient.getDepartments()[1];
		surgery.addPatient(new Patient(1,"赵某某",Gender.MALE,28,surgery));
		surgery.addPatient(new Patient(2,"钱某某",Gender.FEMALE,29,surgery));
		surgery.addPatient(new Patient(3,"孙某某",Gender.MALE,30,surgery));
		surgery.addPatient(new Patient(4,"李某某",Gender.FEMALE,31,surgery));
		//设置好ContentProvider和LabelProvider
		patientViewer.setContentProvider(new PatientContentProvider());
		patientViewer.setLabelProvider(new PatientLabelProvider());
		//设置input
		patientViewer.setInput(inpatient);
		
		this.getSite().setSelectionProvider(patientViewer);
	}

	@Override
	public void setFocus() {
		// TODO 自动生成的方法存根

	}

}
