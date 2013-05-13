package org.araqne.oval.datamodel.definitionsmodel;

import java.util.ArrayList;

public class ExternalVariable {

	private ArrayList<PossibleValueType> possibleValue;
	private ArrayList<PossibleRestrictionType> possibleRestrictions;

	public ArrayList<PossibleValueType> getPossibleValue() {
		return possibleValue;
	}

	public void setPossibleValue(ArrayList<PossibleValueType> possibleValue) {
		this.possibleValue = possibleValue;
	}

	public ArrayList<PossibleRestrictionType> getPossibleRestrictions() {
		return possibleRestrictions;
	}

	public void setPossibleRestrictions(
			ArrayList<PossibleRestrictionType> possibleRestrictions) {
		this.possibleRestrictions = possibleRestrictions;
	}

}
