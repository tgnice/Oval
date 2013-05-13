package org.araqne.oval.datamodel.definitionsmodel;

import org.araqne.oval.datamodel.commonmodel.CheckEnumeration;

public class EntityStateSimpleBaseType {

	private CheckEnumeration entityCheck;
	private String value;

	public CheckEnumeration getEntityCheck() {
		return entityCheck;
	}

	public void setEntityCheck(CheckEnumeration entityCheck) {
		this.entityCheck = entityCheck;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
