package org.araqne.oval.datamodel.definitionsmodel;

import java.util.ArrayList;

import org.araqne.oval.datamodel.commonmodel.Any;

public class MetadataType {

	private String title;
	private ArrayList<AffectedType> affected;
	private ArrayList<ReferenceType> reference;
	private String description;
	private ArrayList<Any> extension_point;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ArrayList<AffectedType> getAffected() {
		return affected;
	}
	public void setAffected(ArrayList<AffectedType> affected) {
		this.affected = affected;
	}
	public ArrayList<ReferenceType> getReference() {
		return reference;
	}
	public void setReference(ArrayList<ReferenceType> reference) {
		this.reference = reference;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ArrayList<Any> getExtension_point() {
		return extension_point;
	}
	public void setExtension_point(ArrayList<Any> extension_point) {
		this.extension_point = extension_point;
	}
	
	
}
