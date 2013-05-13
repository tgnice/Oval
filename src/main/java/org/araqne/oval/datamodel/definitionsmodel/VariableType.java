package org.araqne.oval.datamodel.definitionsmodel;

import org.araqne.oval.datamodel.commonmodel.NonEmptyStringType;
import org.araqne.oval.datamodel.commonmodel.Signature;
import org.araqne.oval.datamodel.commonmodel.SimpleDatatypeEnumeration;
import org.araqne.oval.datamodel.commonmodel.VariableIDPattern;

public class VariableType {

	private VariableIDPattern id;
	private int version;
	private SimpleDatatypeEnumeration datatype;
	private NonEmptyStringType comment;
	private boolean deprecated;
	private Signature signature;

	public VariableIDPattern getId() {
		return id;
	}

	public void setId(VariableIDPattern id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public SimpleDatatypeEnumeration getDatatype() {
		return datatype;
	}

	public void setDatatype(SimpleDatatypeEnumeration datatype) {
		this.datatype = datatype;
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

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}

}
