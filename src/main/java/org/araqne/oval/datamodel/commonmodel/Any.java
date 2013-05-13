package org.araqne.oval.datamodel.commonmodel;

public class Any {

	/*
	 * The Any datatype represents an abstraction that serves as the basis for other user defined datatypes.
	 * This Any datatype does not constrain its data in anyway.
	 * This Any datatype does not constrain its data in anyway. 
	 * This type is used to allow for extension with the OVAL Language
	 */
	private String value;
	@Override
	public String toString() {
		
		return value;
	}
}
