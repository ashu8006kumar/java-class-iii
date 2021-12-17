package org;

public class HelloWord {

	public static void main(String agr[]) {
		int a = 5;
		int b= 1;
		System.out.println(a|b);
		String abc = "RUN-SLOW";

		switch (abc) {
		case "RUN":
			System.out.println("RUN");
			break;

		case "RUN-SLOW":
			System.out.println("RUN-SLOW");
			break;

		case "RUN-FAST":
			System.out.println("RUN-FAST");
			break;

		default:
			System.out.println("default");
			break;
		}
		System.out.println("Out from switch");
	}
}
