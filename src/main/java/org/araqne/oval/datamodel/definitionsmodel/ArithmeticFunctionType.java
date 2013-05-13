package org.araqne.oval.datamodel.definitionsmodel;

import java.util.ArrayList;

public class ArithmeticFunctionType {

	private ArithmeticEnumeration arithmeticOperation;
	private ArrayList<ComponentGroup> values; // more than at least two

	public ArithmeticEnumeration getArithmeticOperation() {
		return arithmeticOperation;
	}

	public void setArithmeticOperation(ArithmeticEnumeration arithmeticOperation) {
		this.arithmeticOperation = arithmeticOperation;
	}

	public ArrayList<ComponentGroup> getValues() {
		return values;
	}

	public void setValues(ArrayList<ComponentGroup> values) {
		this.values = values;
	}

}
