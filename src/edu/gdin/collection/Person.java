package edu.gdin.collection;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable {
	private String id;
	private String name;
	private String sex;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public Person() {
	}
	public Person(String id, String name, String sex) {
		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	
}
