package org.araqne.oval.datamodel.definitionsmodel;

import org.araqne.oval.datamodel.commonmodel.GeneratorType;
import org.araqne.oval.datamodel.commonmodel.Signature;

public class OvalDefinitions {

	private GeneratorType generator;
	private DefinitionsType definitions;
	private TestType tests;
	private ObjectsType objects;
	private StatesType states;
	private VariablesType variables;
	private Signature signature;

	public GeneratorType getGenerator() {
		return generator;
	}

	public void setGenerator(GeneratorType generator) {
		this.generator = generator;
	}

	public DefinitionsType getDefinitions() {
		return definitions;
	}

	public void setDefinitions(DefinitionsType definitions) {
		this.definitions = definitions;
	}

	public TestType getTests() {
		return tests;
	}

	public void setTests(TestType tests) {
		this.tests = tests;
	}

	public ObjectsType getObjects() {
		return objects;
	}

	public void setObjects(ObjectsType objects) {
		this.objects = objects;
	}

	public StatesType getStates() {
		return states;
	}

	public void setStates(StatesType states) {
		this.states = states;
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
