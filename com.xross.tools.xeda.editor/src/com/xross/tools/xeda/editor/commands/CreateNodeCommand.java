package com.xross.tools.xeda.editor.commands;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import com.xross.tools.xeda.editor.model.DepartmentNode;
import com.xross.tools.xeda.editor.model.BaseNode;

public class CreateNodeCommand extends Command{
    private DepartmentNode stateMachine;
    private BaseNode node;
    private Point location;
    
    public CreateNodeCommand(
    		DepartmentNode stateMachine, 
    		BaseNode node, 
    		Point location){
    	this.stateMachine = stateMachine;
    	this.node = node;
    	this.location = location;
    }
    
    public void execute() {
        node.setLocation(location);
        stateMachine.addNode(node);
    }

    public String getLabel() {
        return "Create Node";
    }

    public void redo() {
        execute();
    }

    public void undo() {
    	stateMachine.removeNode(node);
    }
}
