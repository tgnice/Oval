package org.araqne.oval.datamodel.definitionsmodel;

import java.util.ArrayList;

import org.araqne.oval.datamodel.commonmodel.FamilyEnumeration;

public class AffectedType {

	private FamilyEnumeration family;
	private ArrayList<String> platform;
	private ArrayList<String> product;
	
	public FamilyEnumeration getFamily() {
		return family;
	}
	public void setFamily(FamilyEnumeration family) {
		this.family = family;
	}
	public ArrayList<String> getPlatform() {
		return platform;
	}
	public void setPlatform(ArrayList<String> platform) {
		this.platform = platform;
	}
	public ArrayList<String> getProduct() {
		return product;
	}
	public void setProduct(ArrayList<String> product) {
		this.product = product;
	}
	
	
}
