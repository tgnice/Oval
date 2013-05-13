package org.araqne.oval.datamodel.definitionsmodel;

import org.araqne.oval.datamodel.commonmodel.NonEmptyStringType;
import org.araqne.oval.datamodel.commonmodel.ObjectIDPattern;

public class ObjectComponentType {

	private ObjectIDPattern objectRef;
	private NonEmptyStringType itemField;
	private NonEmptyStringType recordField;

	public ObjectIDPattern getObjectRef() {
		return objectRef;
	}

	public void setObjectRef(ObjectIDPattern objectRef) {
		this.objectRef = objectRef;
	}

	public NonEmptyStringType getItemField() {
		return itemField;
	}

	public void setItemField(NonEmptyStringType itemField) {
		this.itemField = itemField;
	}

	public NonEmptyStringType getRecordField() {
		return recordField;
	}

	public void setRecordField(NonEmptyStringType recordField) {
		this.recordField = recordField;
	}

}
