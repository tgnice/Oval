package org.araqne.oval.datamodel.definitionsmodel;

public class SubstringFunctionType {

	private int substringStart;
	private int substringLength;
	private ComponentGroup value;

	public int getSubstringStart() {
		return substringStart;
	}

	public void setSubstringStart(int substringStart) {
		this.substringStart = substringStart;
	}

	public int getSubstringLength() {
		return substringLength;
	}

	public void setSubstringLength(int substringLength) {
		this.substringLength = substringLength;
	}

	public ComponentGroup getValue() {
		return value;
	}

	public void setValue(ComponentGroup value) {
		this.value = value;
	}

}
