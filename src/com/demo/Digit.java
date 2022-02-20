//Program to check whether the user input is digit,alphabet or special character
package com.demo;
import  java.util.Scanner; 
public class Digit{
	public static void main(String args[]){
		int choice;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter character= ");
		if(scanner.hasNextInt())
		{
			choice=1;
		}
		else
		{
			char ch=scanner.next().charAt(0);
			if(ch>='a' && ch<='z')
			{
				choice=2;
			}
			else
			{
				choice=3;
			}
		}
		switch(choice)
		{
		case 1:
		{
			System.out.println("Its a digit");
			break;
		}	
		case 2:
		{
			System.out.println("Its an Alphabet");
			break;
		}
		case 3:
		{
			System.out.println("Its a special character");
			break;
		}
		default:
			System.out.println("Invalid");
		}
		scanner.close();
	}
}

