package org.araqne.oval.datamodel.definitionsmodel;

import java.util.ArrayList;

public class TimeDifferenceFunctionType {

	private DateTimeFormatEnumeration format1; // Default Value:
												// ¡®year_month_day¡¯
	private DateTimeFormatEnumeration format2; // Default Value:
												// ¡®year_month_day¡¯
	private ArrayList<ComponentGroup> value;

	public DateTimeFormatEnumeration getFormat1() {
		return format1;
	}

	public void setFormat1(DateTimeFormatEnumeration format1) {
		this.format1 = format1;
	}

	public DateTimeFormatEnumeration getFormat2() {
		return format2;
	}

	public void setFormat2(DateTimeFormatEnumeration format2) {
		this.format2 = format2;
	}

	public ArrayList<ComponentGroup> getValue() {
		return value;
	}

	public void setValue(ArrayList<ComponentGroup> value) {
		this.value = value;
	}

}
