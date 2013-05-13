package org.araqne.oval.datamodel.definitionsmodel;

import org.araqne.oval.datamodel.commonmodel.NonEmptyStringType;
import org.araqne.oval.datamodel.commonmodel.TestIDPattern;

public class CriterionType {

	TestIDPattern testRef;
	boolean negate;
	NonEmptyStringType comment;
	boolean applicabilityCheck;
}
