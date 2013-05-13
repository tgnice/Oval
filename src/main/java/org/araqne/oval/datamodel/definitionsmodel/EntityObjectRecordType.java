package org.araqne.oval.datamodel.definitionsmodel;

import org.araqne.oval.datamodel.commonmodel.CheckEnumeration;
import org.araqne.oval.datamodel.commonmodel.ComplexDatatypeEnumeration;
import org.araqne.oval.datamodel.commonmodel.OperationEnumeration;
import org.araqne.oval.datamodel.commonmodel.VariableIDPattern;

public class EntityObjectRecordType extends EntityComplexBaseType{

	ComplexDatatypeEnumeration datatype;
	OperationEnumeration operation;
	boolean mask;
	VariableIDPattern varRef;
	CheckEnumeration varCheck;
}
