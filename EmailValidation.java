package com.bridgelabz.regularexpression;

import java.util.regex.Pattern;

/**
 * 
 * @author ROSHNI 
 * Program for Validation of Email Id
 */

public class EmailValidation {
	/**
	 * 
	 * @param email id
	 * @return boolean 
	 * validating for an email id
	 */

	public boolean isValidEmailId(String emailId) {
		// Regex to check valid Email Id
		return Pattern.matches("^([a-zA-Z0-9.]+)([0-9a-zA-Z]{0,1}@([a-zA-Z0-9.]+([a-zA-Z]{2,3}))+([a-z]{0,2}))$",emailId);
	}

}