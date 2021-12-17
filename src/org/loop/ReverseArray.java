package org.loop;

public class ReverseArray {

	public static void main(String[] args) {
		int[] numbers = { 2, 7, 9, 3, 1, 0, -1, 3 };

		int findNUmber = 0;

		for (int index = 0; index < numbers.length; index--) {
			int number = numbers[index];
			if (findNUmber == number) {
				System.out.print("Number found at index: ");
				System.out.println(index);
				break;
			}
		}
	}

}
