package com.tnsif.daythree.Encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		EncapsulationConcept obj=new EncapsulationConcept();
		obj.setstudentId(1);
		obj.setstudentName("Siva");
		obj.setstudentCity("Dharmapuri");
		System.out.println(obj.toString());
	}

}
