package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
	private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

	public boolean validateFirstName(String fname) {
		Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
		return Pattern.matches(FIRST_NAME_PATTERN, fname);
	}
}