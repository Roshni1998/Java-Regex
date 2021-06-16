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
		return Pattern.matches("^[A-Z][a-z_-]{3,15}$", firstName);
	}
	
	/*UC-2*/
	// Last name starts with Cap and has minimum 3 characters
	
	public static boolean isValidLastName(String lastName) {
		return Pattern.matches("^[A-Z][a-z]{3,15}$", lastName);
	}
	
	/*UC-3*/
	//Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
	public static boolean isValidEmailId(String emailId) {
		return Pattern.matches("^([a-zA-Z0-9.]+)([0-9a-zA-Z]{0,1}@([a-zA-Z0-9.]+([a-zA-Z]{2,3}))+([a-z]{0,2}))$", emailId);
	}
	
	/*UC-4*/
	//Country code follow by space and 10 digit number
	public static boolean isValidMobileNo(String mobileNo) {
		return Pattern.matches("(0|91)?\s([7-9][0-9]{9})", mobileNo);
	}
	
	/*UC-5, UC-6*/
	/* Password should contain minimum 8 Characters
	 * Password should have at least 1 Upper Case
	 */
	public static boolean isValidPassword(String password) {
		return Pattern.matches("^(?=.*[A-Z]).{8,20}$", password);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the First Name : ");
		Scanner in = new Scanner(System.in);
		String firstName = in.nextLine();
		System.out.println("Enter the Last Name : ");
		String lastName = in.nextLine();
		System.out.println("Enter Your Email ID : ");
		String emailId = in.nextLine();
		System.out.println("Enter Your Mobile Number : ");
		String mobileNo = in.nextLine();
		System.out.println("Enter Your Password : ");
		String password = in.nextLine();
		
		System.out.println("Is First Name valid ? : " +isValidFirstName(firstName));
		System.out.println("Is Last Name valid ? : " +isValidLastName(lastName));
		System.out.println("Is Email ID valid ? : " +isValidEmailId(emailId));
		System.out.println("Is Mobile Number valid ? : " +isValidMobileNo(mobileNo));
		System.out.println("Is a Password valid ?: " +isValidPassword(password));


	}

}
