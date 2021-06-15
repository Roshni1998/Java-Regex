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
		return Pattern.matches("([1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}", pincode);
	}
}
