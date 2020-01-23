package com.coding.java8;

public class VariablesInLambda {
	public int i=0;
	public static String a = "KB";
	
	public static void main(String[] args) {
		double b = 1.0;
		VariablesInLambda v = new VariablesInLambda();
		PrintInterface p = ()-> {
			v.i=1;
			a="j";
			System.out.println(v.i + "-" + a + "-" + b);
		};
		
		p.print();
	}
}

@FunctionalInterface
interface PrintInterface {
    void print();
}
