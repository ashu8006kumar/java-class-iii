package org.loop;

public class WhileLoop {
	public static void main(String agr[]) {
		int n = 1;
		int maxLoops = 100;
		int table = 13;
		while (n <= maxLoops) {
			int result = table * n;
			System.out.println(table + " x " + n + "= " + result);
			n++; 
		}
	}
}
