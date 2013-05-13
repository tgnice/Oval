package org.araqne.oval.datamodel.commonmodel;

public class EmptyStringType {

	private String value;
	EmptyStringType(){
		value = new String();
	}
	@Override
	public String toString() {
		
		return value;
	}
}
