package com.javaArrays;

public class Example3 {

	public static void main(String[] args) 
	{		
		//array declaration
		int customersAge[] = new int[5];
		
		customersAge[0] = 30;
		customersAge[1] = 10;
		customersAge[2] = 90;
		customersAge[3] = 50;
		customersAge[4] = 99;

		System.out.println(customersAge[0]);
		System.out.println(customersAge[customersAge.length-1]);
		
		System.out.println("------------------");
		
		for(int i = 0; i < customersAge.length; i++)
		{
			System.out.println(customersAge[i]);
		}
		
	}

}
