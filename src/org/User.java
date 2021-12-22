package org;

public class User {
	private String email;// mobile
	private String name;
	private String password;
	private String accountStatus;

	private String basicInfo() {
		return name + " - " + accountStatus;
	}
	
	
}
