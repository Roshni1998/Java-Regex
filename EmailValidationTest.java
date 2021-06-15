package com.bridgelabz.regularexpression;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
/**
 * 
 * @author ROSHNI
 * Test Case for validation of Email Id
 */

public class EmailValidationTest {

	@Test
	public void passTheEmailIdItShouldReturnValidOrNot() {
		EmailValidation mail = new EmailValidation();
		assertTrue(mail.isValidEmailId("roshni45692@gmail.com"));
		assertTrue(mail.isValidEmailId("abc.xyz@bridgelabz.co.in"));
		assertFalse(mail.isValidEmailId("#abcd.def92@3452.abcd"));
		assertFalse(mail.isValidEmailId("ab$c92@.yahoo.com.ina"));
		assertFalse(mail.isValidEmailId("abc*xyz@bridgelabz.co.in"));
	}

}
