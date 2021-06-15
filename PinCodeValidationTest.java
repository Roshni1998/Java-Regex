package com.bridgelabz.regularexpression;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
/**
 * 
 * @author ROSHNI
 * Test Case for Pin Code validation
 *
 */

public class PinCodeValidationTest {

	@Test
	public void passThePinCodeValidationItShouldReturnValidOrNot() {
		PinCodeValidation code = new PinCodeValidation();
		assertFalse(code.validPinCode("056432"));
		assertFalse(code.validPinCode("40rt88"));
		assertFalse(code.validPinCode("A400088"));
		assertFalse(code.validPinCode("T000882"));
		assertFalse(code.validPinCode("e00088"));
		assertFalse(code.validPinCode("70088b"));
	}
}
