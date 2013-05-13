package org.araqne.oval.datamodel.definitionsmodel;

import java.util.ArrayList;

import org.araqne.oval.datamodel.commonmodel.operatorEnumeration;

public class CriteriaType {

	private operatorEnumeration operator;
	private boolean negate;
	private String comment; // this string must be non Empty
	private ArrayList<CriteriaType> criteria;
	private ArrayList<CriterionType> criterion;
	private ArrayList<ExtendDefinitionType> extendDefinition;
	private boolean applicabilityCheck;

	public operatorEnumeration getOperator() {
		return operator;
	}

	public void setOperator(operatorEnumeration operator) {
		this.operator = operator;
	}

	public boolean isNegate() {
		return negate;
	}

	public void setNegate(boolean negate) {
		this.negate = negate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public ArrayList<CriteriaType> getCriteria() {
		return criteria;
	}

	public void setCriteria(ArrayList<CriteriaType> criteria) {
		this.criteria = criteria;
	}

	public ArrayList<CriterionType> getCriterion() {
		return criterion;
	}

	public void setCriterion(ArrayList<CriterionType> criterion) {
		this.criterion = criterion;
	}

	public ArrayList<ExtendDefinitionType> getExtendDefinition() {
		return extendDefinition;
	}

	public void setExtendDefinition(
			ArrayList<ExtendDefinitionType> extendDefinition) {
		this.extendDefinition = extendDefinition;
	}

	public boolean isApplicabilityCheck() {
		return applicabilityCheck;
	}

	public void setApplicabilityCheck(boolean applicabilityCheck) {
		this.applicabilityCheck = applicabilityCheck;
	}

}
