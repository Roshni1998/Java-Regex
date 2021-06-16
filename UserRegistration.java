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
	 * First name starts with Cap and has minimum 3 characters
	 */
	public static boolean isValidFirstName(String firstName) {
		return Pattern.matches("^[A-Z][a-z]{3,15}$", firstName);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the First Name : ");
		Scanner in = new Scanner(System.in);
		String firstName = in.nextLine();
		System.out.println("Is First Name Valid ? : "+isValidFirstName(firstName));
	}

}
