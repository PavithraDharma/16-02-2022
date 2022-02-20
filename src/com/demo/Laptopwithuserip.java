//Print Laptop details using user input
package com.demo;
import  java.util.Scanner;
public class Laptopwithuserip {
	String brand;
	int price;
	String os;
	public Laptopwithuserip()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter laptop brand= ");
		brand=scanner.next();
		System.out.println("Enter laptop price= ");
		price=scanner.nextInt();
		System.out.println("Enter laptop os= ");
		os=scanner.next();
		scanner.close();
	}
	public void getLaptopDetails()
	{
		System.out.println("--Value you entered is--");
		System.out.println("Brand= "+brand);
		System.out.println("Price= "+price);
		System.out.println("Os= "+os);
	}
	public static void main(String args[]){
		Laptopwithuserip obj1=new Laptopwithuserip();
		obj1.getLaptopDetails();
	}
}
