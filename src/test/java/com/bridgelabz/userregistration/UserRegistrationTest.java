package com.bridgelabz.userregistration;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean firstName = userRegistration.validateFirstName("Kishlay");
		Assertions.assertTrue(firstName);
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean lastName = userRegistration.validateLastName("Kishan");
		Assertions.assertTrue(lastName);
	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean email = userRegistration.validateEmail("kishan.kishlay20@gmail.com");
		Assertions.assertTrue(email);
	}

	@Test
	public void givenPhoneNumber_WhenProperWithSpace_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean phoneNumber = userRegistration.validatePhoneNumber("91 7979034653");
		Assertions.assertTrue(phoneNumber);
	}

	@Test
	public void givenPhoneNumber_WhenProperWithOutSpace_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean phoneNumber = userRegistration.validatePhoneNumber("917979034653");
		Assertions.assertTrue(phoneNumber);
	}

	@Test
	public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean phoneNumber = userRegistration.validatePhoneNumber("9179");
		Assertions.assertTrue(phoneNumber);
	}

	@Test
	public void givenPassword_WhenMinEightChar_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean password = userRegistration.validatePassword("Kishan@123");
		Assertions.assertTrue(password);
	}

	@Test
	public void givenPassword_WhenAtleastOne_Caps_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean password = userRegistration.validatePassword("Kishan@123");
		Assertions.assertTrue(password);
	}

	@Test
	public void givenPassword_WhenAtleastOne_Numerics_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean password = userRegistration.validatePassword("Kishan@1");
		Assertions.assertTrue(password);
	}

	@Test
	public void givenPassword_HasExactlyOneSpecialCharacter_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean password = userRegistration.validatePassword("Kishan@1");
		Assertions.assertTrue(password);
	}

	@Test
	public void givenEmail1_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.addEmail();
		boolean email = userRegistration.validateEmail(userRegistration.emailArrayList.get(0));
		Assertions.assertTrue(email);
	}

	@Test
	public void givenEmail2_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.addEmail();
		boolean email = userRegistration.validateEmail(userRegistration.emailArrayList.get(1));
		Assertions.assertTrue(email);
	}

	@Test
	public void givenEmail3_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.addEmail();
		boolean email = userRegistration.validateEmail(userRegistration.emailArrayList.get(2));
		Assertions.assertTrue(email);
	}

	@Test
	public void givenEmail4_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.addEmail();
		boolean email = userRegistration.validateEmail(userRegistration.emailArrayList.get(3));
		Assertions.assertTrue(email);
	}

	@Test
	public void givenEmail5_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.addEmail();
		boolean email = userRegistration.validateEmail(userRegistration.emailArrayList.get(4));
		Assertions.assertTrue(email);
	}

	@Test
	public void givenEmail6_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.addEmail();
		boolean email = userRegistration.validateEmail(userRegistration.emailArrayList.get(5));
		Assertions.assertTrue(email);
	}

	@Test
	public void givenEmail7_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.addEmail();
		boolean email = userRegistration.validateEmail(userRegistration.emailArrayList.get(6));
		Assertions.assertTrue(email);
	}

	@Test
	public void givenEmail8_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.addEmail();
		boolean email = userRegistration.validateEmail(userRegistration.emailArrayList.get(7));
		Assertions.assertTrue(email);
	}

}