package org.araqne.oval.datamodel.definitionsmodel;

import org.araqne.oval.datamodel.commonmodel.ClassEnumeration;
import org.araqne.oval.datamodel.commonmodel.DefinitionIDPattern;
import org.araqne.oval.datamodel.commonmodel.Signature;

public class DefinitionType {

	private DefinitionIDPattern id;
	private int version;
	private ClassEnumeration ovalClass;
	private boolean deprecated;
	private MetadataType metadata;
	private NotesType notes;
	private CriteriaType criteria;
	private Signature signature;
}
