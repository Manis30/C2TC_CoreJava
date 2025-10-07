package com.tnsif.daythree.Encapsulation;

public class EncapsulationConcept {
	private String studentName;
	private int studentId;
	private String studentCity;
	public void setstudentName(String name) {
		studentName=name;
	}
	public void setstudentId(int id) {
		studentId=id;
	}
	public void setstudentCity(String city) {
		studentCity=city;
	}
	public String getstudentName() {
		return studentName;
	}
	public int getstudentId() {
		return studentId;
	}
	public String getstudentCity() {
		return studentCity;
	}
	@Override 
	public String toString() {
		return "student [studentName: "+studentName+" ,studentId: "+studentId+" ,studentCity: "+studentCity+" ]";
	}
}
