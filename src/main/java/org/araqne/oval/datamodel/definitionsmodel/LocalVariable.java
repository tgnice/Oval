package org.araqne.oval.datamodel.definitionsmodel;

import java.util.ArrayList;

public class LocalVariable extends VariableType {

	private ArrayList<ComponentGroup> components;

	public ArrayList<ComponentGroup> getComponents() {
		return components;
	}

	public void setComponents(ArrayList<ComponentGroup> components) {
		this.components = components;
	}

}
