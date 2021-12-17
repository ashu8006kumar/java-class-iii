package org;

public class Student {
	int rollNumber;
	String name;

	public Student(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}

	void printData() {
		System.out.println(rollNumber);
		System.out.println(name);
	}

	void evenOdd() {
		if (rollNumber % 2 == 0) {
			System.out.println("Roll number is even");
		} else {
			System.out.println("Roll number is odd");
		}
	}
}
