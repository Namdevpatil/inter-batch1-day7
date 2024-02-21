package com.javaArrays;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) 
	{		
		
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of the array: ");
		int size = scanner.nextInt();
		
		//declared an array with length
		int customersAge[] = new int[size];
		customersAge[0]=90;
		
		System.out.println("enter array values: ");
		for(int i = 0; i<customersAge.length; i++)
		{
			//initialing the array
			customersAge[i] = scanner.nextInt();
		}
			
		scanner.close();
		
		System.out.println("------------------");
		
		for(int i = 0; i < customersAge.length; i++)
		{
			System.out.println(customersAge[i]);
		}
		
	}

}
