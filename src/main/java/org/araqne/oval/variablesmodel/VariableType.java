package org.araqne.oval.variablesmodel;

import org.araqne.oval.datamodel.commonmodel.SimpleDatatypeEnumeration;
import org.araqne.oval.datamodel.commonmodel.VariableIDPattern;

public class VariableType {

	private VariableIDPattern id;
	private SimpleDatatypeEnumeration datatype;
	private String comment;
	private String value;
	
	public VariableIDPattern getId() {
		return id;
	}
	public void setId(VariableIDPattern id) {
		this.id = id;
	}
	public SimpleDatatypeEnumeration getDatatype() {
		return datatype;
	}
	public void setDatatype(SimpleDatatypeEnumeration datatype) {
		this.datatype = datatype;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
