package com.javaArrays;

import java.util.Arrays;

public class Example7 {

	public static void main(String[] args) {
		
		
		
		int customersAge[] = {20, 35, 28, 45, 39};

		for(int i = 0; i < customersAge.length; i++)
		{
			System.out.println(customersAge[i]);
		}
		
		System.out.println("==============================");
		
		Arrays.asList(customersAge);
		
	}

}
