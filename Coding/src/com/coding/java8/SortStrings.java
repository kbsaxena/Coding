package com.coding.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStrings {
	
	public static void main(String[] args) {
		System.out.println("Sorting by old method");
		sortingOld(new String[] {"d","b","a","c"});
		
		System.out.println("Sorting by lambda");
		sorting(new String[] {"d","b","a","c"});
	}
	
	//Java 8
	public static void sorting(String [] arr) {
		Arrays.sort(arr,(o1,o2)-> o2.compareTo(o1));
		
		/*
		 * Different variations to do the same 
		 * 
		 * Arrays.sort(arr,(o1,o2)-> { return o2.compareTo(o1);});
		 * 
		 * 
		 * Arrays.sort(arr,(String o1,String o2)-> o2.compareTo(o1));
		 * 
		 */
		System.out.println(Arrays.toString(arr));
		
		
		//Using collections sort
		System.out.println("Using collections");
		List<String> list = Arrays.asList(arr);
		Collections.sort(list, (o1,o2) -> o2.compareTo(o1));
		System.out.println(list);
	}
	
	//Anonymous Class
	public static void sortingOld(String [] arr) {
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);  //desc order
			}
		});
		System.out.println(Arrays.toString(arr));
	}
}


