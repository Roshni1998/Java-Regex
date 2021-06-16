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
		return Pattern.matches("^[A-Z][a-z]{3,15}$", firstName);
	}
	
	/*UC-2*/
	// Last name starts with Cap and has minimum 3 characters
	
	public static boolean isValidLastName(String lastName) {
		return Pattern.matches("^[A-Z][a-z]{3,15}$", lastName);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the First Name : ");
		Scanner in = new Scanner(System.in);
		String firstName = in.nextLine();
		System.out.println("Enter the Last Name : ");
		String lastName = in.nextLine();
		System.out.println("Is First Name Valid ? : "+ isValidFirstName(firstName));
		System.out.println("Is Last Name Valid ? : "+ isValidLastName(lastName));
	}

}
