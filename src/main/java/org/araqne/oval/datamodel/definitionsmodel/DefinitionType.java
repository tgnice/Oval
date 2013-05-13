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
	public DefinitionIDPattern getId() {
		return id;
	}
	public void setId(DefinitionIDPattern id) {
		this.id = id;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public ClassEnumeration getOvalClass() {
		return ovalClass;
	}
	public void setOvalClass(ClassEnumeration ovalClass) {
		this.ovalClass = ovalClass;
	}
	public boolean isDeprecated() {
		return deprecated;
	}
	public void setDeprecated(boolean deprecated) {
		this.deprecated = deprecated;
	}
	public MetadataType getMetadata() {
		return metadata;
	}
	public void setMetadata(MetadataType metadata) {
		this.metadata = metadata;
	}
	public NotesType getNotes() {
		return notes;
	}
	public void setNotes(NotesType notes) {
		this.notes = notes;
	}
	public CriteriaType getCriteria() {
		return criteria;
	}
	public void setCriteria(CriteriaType criteria) {
		this.criteria = criteria;
	}
	public Signature getSignature() {
		return signature;
	}
	public void setSignature(Signature signature) {
		this.signature = signature;
	}
	
	
}
