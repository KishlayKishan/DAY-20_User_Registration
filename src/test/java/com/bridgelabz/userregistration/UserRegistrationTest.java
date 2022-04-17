package com.bridgelabz.userregistration;

import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.validateFirstName("Kishlay");
	}
}