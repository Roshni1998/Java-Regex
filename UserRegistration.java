package com.bridgelabz.regularexpression;

import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * 
 * @author ROSHNI
 * User Registration Problem
 */

public class UserRegistration {
	/**
	 * 
	 * @param firstName
	 * @return boolean
	 */
	
	/*UC-1*/
	//First name starts with Cap and has minimum 3 characters
	
	public static boolean isValidFirstName(String firstName) {
		return Pattern.matches("^[A-Z]{1}[a-z_-]{3,15}$", firstName);
	}
	
	/*UC-2*/
	// Last name starts with Cap and has minimum 3 characters
	
	public static boolean isValidLastName(String lastName) {
		return Pattern.matches("^[A-Z]{1}[a-z_-]{3,15}$", lastName);
	}
	
	/*UC-3*/
	//Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
	public static boolean isValidEmailId(String emailId) {
		return Pattern.matches("^([a-zA-Z0-9.]+)([0-9a-zA-Z]{0,1}@([a-zA-Z0-9.]+([a-zA-Z]{2,3}))+([a-z]{0,2}))$", emailId);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the First Name : ");
		Scanner in = new Scanner(System.in);
		String firstName = in.nextLine();
		System.out.println("Enter the Last Name : ");
		String lastName = in.nextLine();
		System.out.println("Enter Your Email ID : ");
		String emailId = in.nextLine();
		System.out.println("Is First Name valid ? : "+isValidFirstName(firstName));
		System.out.println("Is Last Name valid : "+isValidLastName(lastName));
		System.out.println("Is Email ID valid : "+isValidEmailId(emailId));
	}

}
