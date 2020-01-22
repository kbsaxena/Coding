package com.coding;

import java.util.Random;

public class ArrayGenerator {

	public ArrayGenerator() {}
	
	public static final int[] getArray(int range) {
		int[] arr = new int[10];
		Random r = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(range);
		}	
		return arr;
	}

}
