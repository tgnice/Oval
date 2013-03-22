package org.araqne.oval.datamodel.definitionsmodel;

import org.araqne.oval.datamodel.commonmodel.NonEmptyStringType;
import org.araqne.oval.datamodel.commonmodel.Signature;
import org.araqne.oval.datamodel.commonmodel.SimpleDatatypeEnumeration;
import org.araqne.oval.datamodel.commonmodel.VariableIDPattern;

public class VariableType {

	VariableIDPattern id;
	int version;
	SimpleDatatypeEnumeration datatype;
	NonEmptyStringType comment;
	boolean deprecated;
	Signature signature;
}
