package org.araqne.oval.datamodel.definitionsmodel;

import java.util.ArrayList;

import org.araqne.oval.datamodel.commonmodel.ObjectIDPattern;

public class Set {

	SetOperatorEnumeration setOperator;
	ArrayList<Set> set;
	ArrayList<ObjectIDPattern> objectReference;
	ArrayList<Filter> filter;
}
