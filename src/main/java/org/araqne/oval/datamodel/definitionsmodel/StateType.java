package org.araqne.oval.datamodel.definitionsmodel;

import org.araqne.oval.datamodel.commonmodel.NonEmptyStringType;
import org.araqne.oval.datamodel.commonmodel.Signature;
import org.araqne.oval.datamodel.commonmodel.StateIDPattern;
import org.araqne.oval.datamodel.commonmodel.operatorEnumeration;

public class StateType {

	StateIDPattern id;
	int version;
	operatorEnumeration operator;
	NonEmptyStringType comment;
	boolean deprecated;
	NotesType notes;
	Signature signature;
}
