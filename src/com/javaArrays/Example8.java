package com.javaArrays;

public class Example8 {

	public static void main(String[] args) 
	{		
		
		int customersAge[] = {20, 35, 28, 45, 39};//5 and 2
		
		for(int i = 0; i < customersAge.length; i++)
		{
			System.out.println(customersAge[i]);
		}
		
		System.out.println("------------------------");
		
		for(int i = 0; i < customersAge.length; i++)
		{
			if(customersAge[i]%5 == 0 && customersAge[i]%2 == 0)
			{
				System.out.println(customersAge[i]);
			}
		}
		
	}

}
