package org.araqne.oval.datamodel.definitionsmodel;

import java.util.ArrayList;

import org.araqne.oval.datamodel.commonmodel.Any;

public class MetadataType {

	String title;
	ArrayList<AffectedType> affected;
	ArrayList<ReferenceType> reference;
	String description;
	ArrayList<Any> extension_point;
}
