package com.xkland.examples.rcp.minihis.views;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import com.xkland.examples.rcp.minihis.jface.DepartmentContentProvider;
import com.xkland.examples.rcp.minihis.jface.DepartmentDetailLabelProvider;
import com.xkland.examples.rcp.minihis.models.Department;

public class DepartmentDetailView extends ViewPart implements ISelectionListener {
	private TableViewer departmentDetail;
	@Override
	public void createPartControl(Composite parent) {
		departmentDetail = new TableViewer(parent,SWT.BORDER | SWT.V_SCROLL);
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(this);
		departmentDetail.getTable().setLinesVisible(true);
		departmentDetail.getTable().setHeaderVisible(true);
		TableViewerColumn col1 = new TableViewerColumn(departmentDetail,SWT.NONE);
		col1.getColumn().setWidth(100);
		col1.getColumn().setText("床号");
		TableViewerColumn col2 = new TableViewerColumn(departmentDetail,SWT.NONE);
		col2.getColumn().setWidth(100);
		col2.getColumn().setText("姓名");
		TableViewerColumn col3 = new TableViewerColumn(departmentDetail,SWT.NONE);
		col3.getColumn().setWidth(100);
		col3.getColumn().setText("性别");
		TableViewerColumn col4 = new TableViewerColumn(departmentDetail,SWT.NONE);
		col4.getColumn().setWidth(100);
		col4.getColumn().setText("年龄");
		departmentDetail.setContentProvider(new DepartmentContentProvider());
		departmentDetail.setLabelProvider(new DepartmentDetailLabelProvider());
	}
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		//只对选项中的第一项进行操作，如果选择的是Department才需要显示其中的所有病人
		if(selection instanceof IStructuredSelection){
			Object firstSelection = ((IStructuredSelection)selection).getFirstElement();
			if(firstSelection instanceof Department){
				departmentDetail.setInput(firstSelection);
			}else{
				departmentDetail.setInput(null);
			}
		}
	}
	
	@Override
	public void setFocus() {
		// TODO 自动生成的方法存根

	}


}
