//Program to print brand,price,os using creation of object
package com.demo;
public class Laptop{
	String brand;
	int price;
	String os;
	public Laptop()
	{
		brand="Dell";
		price=50000;
		os="Windows10";
	}
	public void getLaptopDetails()
	{
		System.out.println("Brand= "+brand);
		System.out.println("Price= "+price);
		System.out.println("Os= "+os);
	}
	public static void main(String args[]){
		Laptop obj1=new Laptop();
		obj1.getLaptopDetails();
	}
}
