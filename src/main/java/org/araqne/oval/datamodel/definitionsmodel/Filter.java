package org.araqne.oval.datamodel.definitionsmodel;

import org.araqne.oval.datamodel.commonmodel.StateIDPattern;

public class Filter {

	private FilterActionEnumeration action;
	private StateIDPattern value;

	public FilterActionEnumeration getAction() {
		return action;
	}

	public void setAction(FilterActionEnumeration action) {
		this.action = action;
	}

	public StateIDPattern getValue() {
		return value;
	}

	public void setValue(StateIDPattern value) {
		this.value = value;
	}

}
