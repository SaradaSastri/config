package com.ilearn.resttemplate;

public class PropertyVO {
	String key;
	String value;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "PropertyVO [key=" + key + ", value=" + value + "]";
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public PropertyVO (String key, String value) {
		this.key = key;
		this.value = value;
	}

}
