package org.interview;

public class FibonacciProgram {

	static int n1=0,n2=1,n3=0;
	public static void calc(int count) {
      if (count > 0) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
	}
		
	}
	
	public static void main(String[] args) {
		
		calc(10);
	}
}
