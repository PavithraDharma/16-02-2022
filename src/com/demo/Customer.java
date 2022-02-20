//Program to print id and name by creating object of class
package com.demo;
public class Customer{
	int id;String name;
	public Customer()
	{
		id=1;
		name="pavi";
	}
	public void getCustomerInfo()
	{
		System.out.println("Id= "+id);
		System.out.println("Name= "+name);
	}
	public static void main(String args[]){

		Customer cust=new Customer();
		cust.getCustomerInfo();
	}
}
