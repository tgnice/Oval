package org.araqne.oval.datamodel.definitionsmodel;

import org.araqne.oval.datamodel.commonmodel.DefinitionIDPattern;
import org.araqne.oval.datamodel.commonmodel.NonEmptyStringType;

public class ExtendDefinitionType {

	private DefinitionIDPattern definitionRef;
	private boolean negate;
	private NonEmptyStringType comment;
	private boolean applicabilityCheck;

	public DefinitionIDPattern getDefinitionRef() {
		return definitionRef;
	}

	public void setDefinitionRef(DefinitionIDPattern definitionRef) {
		this.definitionRef = definitionRef;
	}

	public boolean isNegate() {
		return negate;
	}

	public void setNegate(boolean negate) {
		this.negate = negate;
	}

	public NonEmptyStringType getComment() {
		return comment;
	}

	public void setComment(NonEmptyStringType comment) {
		this.comment = comment;
	}

	public boolean isApplicabilityCheck() {
		return applicabilityCheck;
	}

	public void setApplicabilityCheck(boolean applicabilityCheck) {
		this.applicabilityCheck = applicabilityCheck;
	}

}
