package com.coding.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListToStream {
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
        stringList.add("aa");
        stringList.add("as");
        stringList.add("ac");
        stringList.add("nd");
        stringList.add("ak");
        
        List<String> startsWithA = stringList.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());
        System.out.println("Starts with a : " + startsWithA);
        
        List<String> startsWithASorted = stringList.stream().filter(s -> s.startsWith("a")).sorted().collect(Collectors.toList());
        System.out.println("Starts with a and Sorted: " + startsWithASorted);
        
        List<String> startsWithASortedDesc = stringList.stream().filter(s -> s.startsWith("a")).sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
        System.out.println("Starts with a and Sorted: " + startsWithASortedDesc);
        
        List<String> startsWithASortedUpper = stringList.stream().filter(s -> s.startsWith("a")).map(str->str.toUpperCase()).sorted().collect(Collectors.toList());
        System.out.println("Starts with a and Sorted: " + startsWithASortedUpper);
        
        long countStartsWithA = stringList.stream().filter(s -> s.startsWith("a")).count();
        System.out.println("Starts with a (count) : " + countStartsWithA);
	}
}
