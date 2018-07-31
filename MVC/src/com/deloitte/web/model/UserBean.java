package com.deloitte.web.model;

import java.io.Serializable;

public class UserBean implements Serializable {
	private String firstName;
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String lastName;

	public Boolean authenticate(String username, String password) {
		if (username != null && password != null) {
			if (username.equalsIgnoreCase("Akshatha") && (password.equals("password123"))) {
				firstName="Akshatha";
				lastName="Etagi";
				
				return true;
			} else {
				return false;

			}

		}
		return false;

	}
}
