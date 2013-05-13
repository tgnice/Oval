package org.araqne.oval.datamodel.definitionsmodel;

import java.util.ArrayList;

import org.araqne.oval.datamodel.commonmodel.operatorEnumeration;

public class CriteriaType {

	operatorEnumeration operator;
	boolean negate;
	String comment; // this string must be non Empty
	ArrayList<CriteriaType> criteria;
	ArrayList<CriterionType> criterion;
	ArrayList<ExtendDefinitionType> extendDefinition;
	boolean applicabilityCheck;
	
}
