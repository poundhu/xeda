package com.xrosstools.xeda.editor.requests;

import org.eclipse.gef.Request;

import com.xrosstools.xeda.editor.figures.DepartmentNodeFigure;
import com.xrosstools.xeda.editor.model.DepartmentNode;

public class DepartmentLayoutRequest extends Request {
	private DepartmentNode department;
	private DepartmentNodeFigure figure;
	public DepartmentLayoutRequest(DepartmentNode department, DepartmentNodeFigure figure){
		super("AutoLayout");
		this.department = department;
		this.figure = figure;
	}
	
	public DepartmentNode getDepartmentNode() {
		return department;
	}

	public DepartmentNodeFigure getFigure() {
		return figure;
	}
}
