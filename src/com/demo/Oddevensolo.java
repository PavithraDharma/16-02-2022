//Print odd numbers first and then even numbers between 1-100
package com.demo;
class Oddevensolo {
	public static void main(String[] args) {
		int i=2;int j=1;
		System.out.println("Even numbers are");
		do{
			if(i%2==0)
			{
				System.out.println(i);
				i=i+2;
			}
		}while(i<=100);
		System.out.println("Odd numbers are");
		do{
			if(j%2!=0)
			{
				System.out.println(j);
				j=j+2;
			}
		}while(j<=100);
	}
}
