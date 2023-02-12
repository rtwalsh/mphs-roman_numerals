// Copyright(c)2023 Excalibur Solutions, Inc. - All Rights Reserved

/*
 * Name: 	RomanNumeral.java
 * Author: 	Robert Walsh
 * Date:	February 12, 2023
 * 
 * Description:
 * 
 * 	This program takes a number and converts it to Roman numerals.
 * 	Input may be given as the first argument on the command line,
 * 	or the program will prompt the user for an entry. 
 * 
 *	Conversions are correct only up to 3999.
 */

package com.excalibursolutions.RomanNumerials;

import java.util.Scanner;

public class RomanNumeral {

	public static void main(String[] args) {
		String input;
		if (args.length > 0) {
			input = args[0];
		} else {
			System.out.println("Please enter a number to convert to Roman numerals: ");
			Scanner scanner = new Scanner(System.in);
			input = scanner.next();
		}
		
		try {
			int number = Integer.parseInt(input);
			
		} catch (NumberFormatException e) {
			System.out.println("Unable to convert '" + input + "' to Roman numerals.");
		}
	}

}
