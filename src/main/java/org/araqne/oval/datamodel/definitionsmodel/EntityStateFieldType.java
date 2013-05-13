package org.araqne.oval.datamodel.definitionsmodel;

import org.araqne.oval.datamodel.commonmodel.CheckEnumeration;

public class EntityStateFieldType {

	private EntityAttributeGroup attributes;
	private String Name;
	private CheckEnumeration entityCheck;
	private String value;

	public EntityAttributeGroup getAttributes() {
		return attributes;
	}

	public void setAttributes(EntityAttributeGroup attributes) {
		this.attributes = attributes;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

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
