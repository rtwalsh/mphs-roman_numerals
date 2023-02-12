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
 *	Conversions can be done only on numbers up to 3999.
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
			RomanNumeral romanNumeral = new RomanNumeral(Integer.parseInt(input));
			
		} catch (NumberFormatException e) {
			System.out.println("Error: Unable to convert '" + input + "' to Roman numerals.");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	private int thousandsDigit;
	private int hundredsDigit;
	private int tensDigit;
	private int onesDigit;
	
	public RomanNumeral(int number) throws Exception {
		parseIntoDigits(number);
	}
	
	private void parseIntoDigits(int number) throws Exception {
		if (number < 4000) {
			thousandsDigit = number / 1000;			// this is integer division, so fractional part will be discarded
			if (thousandsDigit > 0) {
				number -= thousandsDigit * 1000;	// strip the thousands digit from the number to convert
			}
			
			hundredsDigit = number / 100;
			if (hundredsDigit > 0) {
				number -= hundredsDigit * 100;		// strip the hundreds digit from the number to convert
			}
			
			tensDigit = number / 10;
			if (tensDigit > 0) {
				number -= tensDigit * 10;			// strip the tens digit from the number to convert
			}
			
			onesDigit = number;						// what's left is the ones digit
		} else {
			throw new Exception("Number to convert must be less than 4000");
		}
	}
}
