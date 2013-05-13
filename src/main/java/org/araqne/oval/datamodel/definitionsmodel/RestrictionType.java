package org.araqne.oval.datamodel.definitionsmodel;

import org.araqne.oval.datamodel.commonmodel.OperationEnumeration;

public class RestrictionType {

	private OperationEnumeration operation;
	private String value;

	public OperationEnumeration getOperation() {
		return operation;
	}

	public void setOperation(OperationEnumeration operation) {
		this.operation = operation;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
