package org.araqne.oval.datamodel.definitionsmodel;

import org.araqne.oval.datamodel.commonmodel.SimpleDatatypeEnumeration;

public class LiteralComponentType {

	private SimpleDatatypeEnumeration datatype;
	private String value;

	public SimpleDatatypeEnumeration getDatatype() {
		return datatype;
	}

	public void setDatatype(SimpleDatatypeEnumeration datatype) {
		this.datatype = datatype;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
