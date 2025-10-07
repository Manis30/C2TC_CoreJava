package com.tnsif.daytwo;

public class operatorsDemo {

	public static void main(String[] args) {
		int a=5,b=6;
		a=++a+b++;
		System.out.println(a);
		a--;
		System.out.println(a+" "+b);
		int c=(a>b)?a:b;
		System.out.println("Max number: "+c);
	}

}
