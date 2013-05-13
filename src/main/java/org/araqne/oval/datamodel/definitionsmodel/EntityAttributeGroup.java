package org.araqne.oval.datamodel.definitionsmodel;

import org.araqne.oval.datamodel.commonmodel.CheckEnumeration;
import org.araqne.oval.datamodel.commonmodel.DatatypeEnumeration;
import org.araqne.oval.datamodel.commonmodel.OperationEnumeration;
import org.araqne.oval.datamodel.commonmodel.VariableIDPattern;

public class EntityAttributeGroup {

	private DatatypeEnumeration datatype;
	private OperationEnumeration operation;
	private boolean mask;
	private VariableIDPattern varRef;
	private CheckEnumeration varCheck;

	public DatatypeEnumeration getDatatype() {
		return datatype;
	}

	public void setDatatype(DatatypeEnumeration datatype) {
		this.datatype = datatype;
	}

	public OperationEnumeration getOperation() {
		return operation;
	}

	public void setOperation(OperationEnumeration operation) {
		this.operation = operation;
	}

	public boolean isMask() {
		return mask;
	}

	public void setMask(boolean mask) {
		this.mask = mask;
	}

	public VariableIDPattern getVarRef() {
		return varRef;
	}

	public void setVarRef(VariableIDPattern varRef) {
		this.varRef = varRef;
	}

	public CheckEnumeration getVarCheck() {
		return varCheck;
	}

	public void setVarCheck(CheckEnumeration varCheck) {
		this.varCheck = varCheck;
	}

}
