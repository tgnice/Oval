package org.araqne.oval.datamodel.definitionsmodel;

import org.araqne.oval.datamodel.commonmodel.DefinitionIDPattern;
import org.araqne.oval.datamodel.commonmodel.NonEmptyStringType;

public class ExtendDefinitionType {

	DefinitionIDPattern definitionRef;
	boolean negate;
	NonEmptyStringType comment;
	boolean applicabilityCheck;
}
