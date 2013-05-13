package org.araqne.oval.datamodel.definitionsmodel;

import java.util.ArrayList;

import org.araqne.oval.datamodel.commonmodel.ObjectIDPattern;

public class Set {

	private SetOperatorEnumeration setOperator;
	private ArrayList<Set> set;
	private ArrayList<ObjectIDPattern> objectReference;
	private ArrayList<Filter> filter;

	public SetOperatorEnumeration getSetOperator() {
		return setOperator;
	}

	public void setSetOperator(SetOperatorEnumeration setOperator) {
		this.setOperator = setOperator;
	}

	public ArrayList<Set> getSet() {
		return set;
	}

	public void setSet(ArrayList<Set> set) {
		this.set = set;
	}

	public ArrayList<ObjectIDPattern> getObjectReference() {
		return objectReference;
	}

	public void setObjectReference(ArrayList<ObjectIDPattern> objectReference) {
		this.objectReference = objectReference;
	}

	public ArrayList<Filter> getFilter() {
		return filter;
	}

	public void setFilter(ArrayList<Filter> filter) {
		this.filter = filter;
	}

}
