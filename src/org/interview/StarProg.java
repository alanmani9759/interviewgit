package org.interview;

public class StarProg {

	public static void main(String[] args) {

		// new line
		for (int i = 1; i <= 5; i++) {
			// for space
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");

			}
			// for star
			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
