package com.bridgelabz.regularexpression;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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
		assertTrue(code.validPinCode("400088"));
		assertTrue(code.validPinCode("056432"));
		assertFalse(code.validPinCode("40rt88"));
		assertFalse(code.validPinCode("40008823"));
		assertFalse(code.validPinCode("A400088"));
	}
}
