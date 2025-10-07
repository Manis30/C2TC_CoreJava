package com.tnsif.daythree.Scanner;

public class Person {
	private String name;
	private int age;
	private int income;
	private int tax;
	private String gender;
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public void setTax(int tax) {
		this.tax=tax;
	}
	public void setIncome(int income) {
		this.income=income;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getIncome() {
		return income;
	}
	public String getGender() {
		return gender;
	}
	public int getTax() {
		return tax;
	}
	@Override 
	public String toString() {
		return "Person [Name: "+name+" ,Income: "+income+" ,Gender: "+gender+" ,Age:"+age+" ,Tax:"+tax+" ]";
	}
}
