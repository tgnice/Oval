package org.araqne.oval.datamodel.definitionsmodel;

import org.araqne.oval.datamodel.commonmodel.NonEmptyStringType;
import org.araqne.oval.datamodel.commonmodel.ObjectIDPattern;
import org.araqne.oval.datamodel.commonmodel.Signature;

public class ObjectType {

	private ObjectIDPattern id;
	private int version;
	private NonEmptyStringType comment;
	private boolean deprecated;
	private NotesType notes;
	private Signature signature;

	public ObjectIDPattern getId() {
		return id;
	}

	public void setId(ObjectIDPattern id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public NonEmptyStringType getComment() {
		return comment;
	}

	public void setComment(NonEmptyStringType comment) {
		this.comment = comment;
	}

	public boolean isDeprecated() {
		return deprecated;
	}

	public void setDeprecated(boolean deprecated) {
		this.deprecated = deprecated;
	}

	public NotesType getNotes() {
		return notes;
	}

	public void setNotes(NotesType notes) {
		this.notes = notes;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}

}
