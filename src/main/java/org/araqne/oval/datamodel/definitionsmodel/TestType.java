package org.araqne.oval.datamodel.definitionsmodel;

import org.araqne.oval.datamodel.commonmodel.CheckEnumeration;
import org.araqne.oval.datamodel.commonmodel.ExistenceEnumeration;
import org.araqne.oval.datamodel.commonmodel.NonEmptyStringType;
import org.araqne.oval.datamodel.commonmodel.Signature;
import org.araqne.oval.datamodel.commonmodel.TestIDPattern;
import org.araqne.oval.datamodel.commonmodel.operatorEnumeration;

public class TestType {

	TestIDPattern id;
	int version;
	ExistenceEnumeration checkExistence;
	CheckEnumeration check;
	operatorEnumeration stateOperator;
	NonEmptyStringType comment;
	boolean deprecated;
	NotesType notes;
	Signature signature;
	
}
