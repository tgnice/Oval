package org.araqne.oval.characteristicsmodel;

import java.util.ArrayList;

import org.araqne.oval.datamodel.commonmodel.MessageType;
import org.araqne.oval.datamodel.commonmodel.ObjectIDPattern;
import org.araqne.oval.datamodel.definitionsmodel.ReferenceType;

public class ObjectType {

	ObjectIDPattern id;
	int version;
	int variableInstance;
	String comment;
	//FlagEnumeration flag;
	ArrayList<MessageType> message;
	ArrayList<VariableValueType> varuableValue;
	ArrayList<ReferenceType> reference;
	
}
