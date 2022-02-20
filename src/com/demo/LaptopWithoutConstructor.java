//Print without using constructor
package com.demo;
import  java.util.Scanner;
public  class LaptopWithoutConstructor{
	String brand;
	int price;
	String os;
	public void getLaptopDetails()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter laptop brand= ");
		brand=scanner.next();
		System.out.println("Enter laptop price= ");
		price=scanner.nextInt();
		System.out.println("Enter laptop os= ");
		os=scanner.next();
		System.out.println("--Value you entered is--");
		System.out.println("Brand= "+brand);
		System.out.println("Price= "+price);
		System.out.println("Os= "+os);
		scanner.close();
	}
	public static void main(String args[]){
		LaptopWithoutConstructor obj1=new LaptopWithoutConstructor();
		obj1.getLaptopDetails();
	}
}

