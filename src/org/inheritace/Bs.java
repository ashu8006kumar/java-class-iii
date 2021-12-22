package org.inheritace;

public class Bs extends As {

	private String name = "I am from Bs class";

	@Override
	public void sayYourName() {
		System.out.println(name);
	}
	 
	public Bs() {
	}

	public Bs(String name) {
		this.name = name;
	}

}
