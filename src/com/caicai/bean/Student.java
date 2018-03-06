package com.caicai.bean;

public class Student {

	private Integer num;
	private String name;
	private String pass;
	private Integer age;
	
	public Student(){
		
	}
	public Student(Integer num, String name, String pass, Integer age) {
		
		this.num = num;
		this.name = name;
		this.pass = pass;
		this.age = age;
	}

	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
