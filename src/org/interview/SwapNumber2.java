package org.interview;

public class SwapNumber2 {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		a = a + b;
		b = a - b;
		a = a- b;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
}
