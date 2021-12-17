package org.ex;

public class UnChecked {

	public static void main(String[] agr) {
		try {
			int number1 = 10;
			int number2 = 20;

			System.out.println(number2 / number1);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("In finally ");
		}
		System.out.println("End of program");
	}
}
