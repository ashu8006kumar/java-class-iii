package org.loop;

public class DoWhileLoop {
	public static void main(String agr[]) {

		int n = 1100000000;
		int maxLoops = 10;

		do {
			System.out.println("Hello -------" + n);
			n++; 
		} while (n <= maxLoops);
	}
}
