package org.araqne.oval.variablesmodel;

import org.araqne.oval.datamodel.commonmodel.GeneratorType;
import org.araqne.oval.datamodel.commonmodel.Signature;

public class OvalVariables {

	private GeneratorType generator;
	private VariablesType variables;
	private Signature signature;
	
	public GeneratorType getGenerator() {
		return generator;
	}
	public void setGenerator(GeneratorType generator) {
		this.generator = generator;
	}
	public VariablesType getVariables() {
		return variables;
	}
	public void setVariables(VariablesType variables) {
		this.variables = variables;
	}
	public Signature getSignature() {
		return signature;
	}
	public void setSignature(Signature signature) {
		this.signature = signature;
	}
	
	
}
