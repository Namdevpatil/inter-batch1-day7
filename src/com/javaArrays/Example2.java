package com.javaArrays;

public class Example2 {

	public static void main(String[] args) 
	{		
		//array declaration and initialization
		int customersAge[] = {20, 35, 28, 45, 39};

		System.out.println(customersAge[0]);
		System.out.println(customersAge[customersAge.length-1]);
		
		System.out.println("------------------");
		
		for(int i = 0; i < customersAge.length; i++)
		{
			System.out.println(customersAge[i]);
		}
		
	}

}
