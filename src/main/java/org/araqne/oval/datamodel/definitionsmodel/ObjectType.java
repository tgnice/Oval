package org.araqne.oval.datamodel.definitionsmodel;

import org.araqne.oval.datamodel.commonmodel.NonEmptyStringType;
import org.araqne.oval.datamodel.commonmodel.ObjectIDPattern;
import org.araqne.oval.datamodel.commonmodel.Signature;

public class ObjectType {

	ObjectIDPattern id;
	int version;
	NonEmptyStringType comment;
	boolean deprecated;
	NotesType notes;
	Signature signature;
	
}
