package Assignment_2;

import java.util.Scanner;

public class CalculateCommision {

	public static void main(String[] args) {
		Commission obj=new Commission();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println("Enter your sales amount");
		int sales=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your phone number");
		int phone=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your address");
		String address=sc.nextLine();
		obj.setName(name);
		obj.setPhone(phone);	
		obj.setAddress(address);
		obj.setSales_amount(sales);
		System.out.println(obj.toString()+"");
		obj.calculateCalculation(obj);
	}

}
