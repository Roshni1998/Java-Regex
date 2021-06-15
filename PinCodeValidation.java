package com.bridgelabz.regularexpression;

import java.util.regex.Pattern;

/**
 * 
 * @author ROSHNI
 * Regex validation for PIN Code
 */

public class PinCodeValidation {

	/**
	 * 
	 * @param PinCode
	 * @return boolean validating for a PIN Code
	 */

	public boolean validPinCode(String pincode) {
		return Pattern.matches("^[0-9]{6}$", pincode);
	}
}
