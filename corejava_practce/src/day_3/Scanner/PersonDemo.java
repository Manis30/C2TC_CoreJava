package day_3.Scanner;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=sc.nextLine();
		System.out.println("Enter age:");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter gender:");
		String gender=sc.nextLine();
		System.out.println("Enter income:");
		int income=sc.nextInt();
		Person obj=new Person();
		obj.setName(name);
		obj.setGender(gender);
		obj.setAge(age);
		obj.setIncome(income);
		TaxCalculation tobj=new TaxCalculation();
		tobj.calculateTax(obj);
		System.out.println("After calculating tax");
		System.out.println(obj.toString());
	}

}
