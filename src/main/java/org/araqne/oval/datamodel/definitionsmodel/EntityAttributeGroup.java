package org.araqne.oval.datamodel.definitionsmodel;

import org.araqne.oval.datamodel.commonmodel.CheckEnumeration;
import org.araqne.oval.datamodel.commonmodel.DatatypeEnumeration;
import org.araqne.oval.datamodel.commonmodel.OperationEnumeration;
import org.araqne.oval.datamodel.commonmodel.VariableIDPattern;

public class EntityAttributeGroup {

	DatatypeEnumeration datatype;
	OperationEnumeration operation;
	boolean mask;
	VariableIDPattern varRef;
	CheckEnumeration varCheck;
}
