package org.araqne.oval.datamodel.definitionsmodel;

import org.araqne.oval.datamodel.commonmodel.NonEmptyStringType;
import org.araqne.oval.datamodel.commonmodel.TestIDPattern;

public class CriterionType {

	private TestIDPattern testRef;
	private boolean negate;
	private NonEmptyStringType comment;
	private boolean applicabilityCheck;

	public TestIDPattern getTestRef() {
		return testRef;
	}

	public void setTestRef(TestIDPattern testRef) {
		this.testRef = testRef;
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
