package com.javaArrays;

import java.util.ArrayList;
import java.util.Collections;

public class Example5 {

	public static void main(String[] args) 
	{		


		int customersAge[] = {20, 35, 28, 45, 39};

		for(int i = 0; i < customersAge.length; i++)
		{
			System.out.println(customersAge[i]);
		}


		ArrayList list = new ArrayList();

		System.out.println("====================sorted collections====================");
		list.add(20);
		list.add(35);
		list.add(28);
		list.add(45);
		list.add(39);

		//System.out.println(list);
		
		Collections.sort(list);

		for(Object value: list)
		{
			System.out.println(value);
		}

		System.out.println("======================remove values from collections==================");

		list.remove(2);//28

		for(Object value: list)
		{
			System.out.println(value);
		}

		System.out.println("======================add values to collections==================");

		list.add(2, 67);//28

		for(Object value: list)
		{
			System.out.println(value);
		}

		System.out.println("======================add dissimilar values to collections==================");

		list.add(67.90);
		list.add("Hello");
		list.add(false);

		for(Object value: list)
		{
			System.out.println(value);
		}

	}

}
