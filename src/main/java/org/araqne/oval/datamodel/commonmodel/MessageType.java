package org.araqne.oval.datamodel.commonmodel;

import org.araqne.oval.datamodel.OvalCommonModel;
import org.araqne.oval.enumeration.MessageLevelEnumeration;

public class MessageType implements OvalCommonModel{

	private MessageLevelEnumeration level; // default "info"
	private String message;
	
	public MessageLevelEnumeration getLevel() {
		return level;
	}
	public void setLevel(MessageLevelEnumeration level) {
		this.level = level;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
