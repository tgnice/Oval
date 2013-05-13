package org.araqne.oval.datamodel.definitionsmodel;

import java.util.ArrayList;

public class ConstantVariable extends VariableType {

	private ArrayList<ValueType> value;

	public ArrayList<ValueType> getValue() {
		return value;
	}

	public void setValue(ArrayList<ValueType> value) {
		this.value = value;
	}

}
