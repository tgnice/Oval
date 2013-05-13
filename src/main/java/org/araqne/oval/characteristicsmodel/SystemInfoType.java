package org.araqne.oval.characteristicsmodel;

import java.util.ArrayList;

import org.araqne.oval.datamodel.commonmodel.Any;

public class SystemInfoType {

	String osName;
	String osVersion;
	String architecture;
	String primaryHostName;
	ArrayList<InterfaceType> interfaces;
	ArrayList<Any> extensionPoint;
}
