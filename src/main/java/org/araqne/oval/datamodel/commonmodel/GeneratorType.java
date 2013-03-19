package org.araqne.oval.datamodel.commonmodel;

import org.araqne.oval.datamodel.OvalCommonModel;

public class GeneratorType implements OvalCommonModel{

	private String productName;
	private String productVersion;
	private double schema_version;
	private String timestamp;
	//private TODO: see Appendix A to understand extending the oval language data model
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductVersion() {
		return productVersion;
	}
	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}
	public double getSchema_version() {
		return schema_version;
	}
	public void setSchema_version(double schema_version) {
		this.schema_version = schema_version;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
