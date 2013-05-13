package org.araqne.oval.datamodel.definitionsmodel;

import java.util.ArrayList;

public class ComponentGroup {

	private ArrayList<ObjectComponentType> objectComponent;
	private ArrayList<VariableComponentType> variableComponent;
	private ArrayList<LiteralComponentType> literalComponent;
	private ArrayList<FunctionGroup> functions;

	public ArrayList<ObjectComponentType> getObjectComponent() {
		return objectComponent;
	}

	public void setObjectComponent(
			ArrayList<ObjectComponentType> objectComponent) {
		this.objectComponent = objectComponent;
	}

	public ArrayList<VariableComponentType> getVariableComponent() {
		return variableComponent;
	}

	public void setVariableComponent(
			ArrayList<VariableComponentType> variableComponent) {
		this.variableComponent = variableComponent;
	}

	public ArrayList<LiteralComponentType> getLiteralComponent() {
		return literalComponent;
	}

	public void setLiteralComponent(
			ArrayList<LiteralComponentType> literalComponent) {
		this.literalComponent = literalComponent;
	}

	public ArrayList<FunctionGroup> getFunctions() {
		return functions;
	}

	public void setFunctions(ArrayList<FunctionGroup> functions) {
		this.functions = functions;
	}

}
