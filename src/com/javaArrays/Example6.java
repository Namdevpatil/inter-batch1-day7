package com.javaArrays;

import java.util.ArrayList;
import java.util.Collections;

public class Example6 {

	public static void main(String[] args) 
	{		


		int customersAge[] = {20, 35, 28, 45, 39};

		for(int i = 0; i < customersAge.length; i++)
		{
			System.out.println(customersAge[i]);
		}


		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.println("====================sorted collections====================");
		list.add(20);
		list.add(35);
		list.add(28);
		list.add(45);
		list.add(39);
		//list.add(false);

		//System.out.println(list);
		
		Collections.sort(list);

		for(Object value: list)
		{
			System.out.println(value);
		}



	}

}
