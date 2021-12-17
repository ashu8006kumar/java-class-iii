package org.ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checked {
	public static void main(String[] a) {
		File file = new File("xyz");
		try {
			FileInputStream fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			System.out.println("************");
			System.out.println(e.getMessage());
		}

		System.out.println("End of program");
	}
}
