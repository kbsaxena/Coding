package com.coding.java8;

import java.util.stream.IntStream;

public class Even {
	public static void main(String[] args) {
		IntStream intStream = IntStream.range(1, 10);
		intStream.filter(i -> (i%2 == 0) ).forEach(System.out::println);
	}
}
