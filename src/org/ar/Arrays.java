package org.ar;

public class Arrays {

	public static void main(String[] args) {

		String[] arrays = new String[10];

		String[] arrays2 = new String[] { "ABC", "DEF" };
		
		
		System.out.println(arrays2[1]);

		for (int i = 0; i < arrays2.length; i++) {
			System.out.println(arrays2[i]);

		}

		for (String string : arrays2) {
			System.out.println(string);
		}

	}

}
