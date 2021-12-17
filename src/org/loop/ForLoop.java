package org.loop;

import java.util.Arrays;
import java.util.List;

public class ForLoop {
	public static void main(String[] agr) {
		int maxLoops = 10;
		int table = 13;
		for (int n = 1; n <= maxLoops; n++) {
			int result = table * n;
			System.out.println(table + " x " + n + "= " + result);
		}

		for (int n = maxLoops; n >= 1; n--) {
			int result = table * n;
			System.out.println(table + " x " + n + "= " + result);
		}
		
		// 
		List<String> list = Arrays.asList("Ashish", "Ship", "Earth");
		for (String value : list) {
			System.out.println("********");
			System.out.println(value);
		}

	}
}
