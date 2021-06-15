package com.bridgelabz.regularexpression;

import java.util.regex.Matcher;
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

	public static boolean isValidEmailId(String emailId) {
		// Regex to check valid Email Id
		String regex = "^@([a-zA-Z0-9.]+)$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(emailId);
		return m.matches();
	}

	public static void main(String[] args) {
		String id = "@bridgelabz.";
		System.out.println("Email Id : " + isValidEmailId(id));

	}

}
