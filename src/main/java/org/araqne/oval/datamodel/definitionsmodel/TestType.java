package org.araqne.oval.datamodel.definitionsmodel;

import org.araqne.oval.datamodel.commonmodel.CheckEnumeration;
import org.araqne.oval.datamodel.commonmodel.ExistenceEnumeration;
import org.araqne.oval.datamodel.commonmodel.NonEmptyStringType;
import org.araqne.oval.datamodel.commonmodel.Signature;
import org.araqne.oval.datamodel.commonmodel.TestIDPattern;
import org.araqne.oval.datamodel.commonmodel.operatorEnumeration;

public class TestType {

	private TestIDPattern id;
	private int version;
	private ExistenceEnumeration checkExistence;
	private CheckEnumeration check;
	private operatorEnumeration stateOperator;
	private NonEmptyStringType comment;
	private boolean deprecated;
	private NotesType notes;
	private Signature signature;

	public TestIDPattern getId() {
		return id;
	}

	public void setId(TestIDPattern id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public ExistenceEnumeration getCheckExistence() {
		return checkExistence;
	}

	public void setCheckExistence(ExistenceEnumeration checkExistence) {
		this.checkExistence = checkExistence;
	}

	public CheckEnumeration getCheck() {
		return check;
	}

	public void setCheck(CheckEnumeration check) {
		this.check = check;
	}

	public operatorEnumeration getStateOperator() {
		return stateOperator;
	}

	public void setStateOperator(operatorEnumeration stateOperator) {
		this.stateOperator = stateOperator;
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
