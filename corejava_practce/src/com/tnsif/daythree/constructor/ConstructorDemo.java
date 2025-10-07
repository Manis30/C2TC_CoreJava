package com.tnsif.daythree.constructor;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name,city;
		int id;
		System.out.println("Enter client id:");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter client name:");
		name=sc.nextLine();
		System.out.println("Enter client city:");
		city=sc.nextLine();
		Constructor obj=new Constructor();
		obj.setClientId(id);
		obj.setClientName(name);
		obj.setClientCity(city);
		System.out.println(obj.toString());
		System.out.println("Enter client id:");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter client name:");
		name=sc.nextLine();
		System.out.println("Enter client city:");
		city=sc.nextLine();
		Constructor obg=new Constructor(name,id,city);
		System.out.println(obg.toString());
	}

}
