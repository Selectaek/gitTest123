package com.git.model.vo;

public class Person {
	
	private String  name;
	private int age;
	private String addres;
	
	
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Person(String name, int age, String addres) {
		super();
		this.name = name;
		this.age = age;
		this.addres = addres;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getAddres() {
		return addres;
	}




	public void setAddres(String addres) {
		this.addres = addres;
	}
	
	
	
	
	
	
	
}
