package com.java;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MyCustomer {
	
	private List<String> list = null;
	private Set<String> set;
	private Map<String,Object> map;
	private Properties properties;
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "MyCustomer [list=" + list + ", set=" + set + ", map=" + map + ", properties=" + properties + "]";
	}



}
