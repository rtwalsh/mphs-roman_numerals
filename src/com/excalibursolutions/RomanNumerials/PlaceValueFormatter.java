// Copyright(c)2023 Excalibur Solutions, Inc. - All Rights Reserved

/*
 * Name: 	PlaceValueFormatter.java
 * Author: 	Robert Walsh
 * Date:	February 12, 2023
 * 
 * Description:
 * 
 * 	This class formats a single place value section for a Roman numeral
 */

package com.excalibursolutions.RomanNumerials;

public class PlaceValueFormatter {

	private String tensSymbol;
	private String fiveSymbol;
	private String onesSymbol;
	private int digit;
	
	public PlaceValueFormatter(String theTensSymbol, String theFiveSymbol, String theOnesSymbol, int theDigit) {
		tensSymbol = theTensSymbol;
		fiveSymbol = theFiveSymbol;
		onesSymbol = theOnesSymbol;
		digit = theDigit;
	}
	
	public String toString() {
		String output = "";
		if (digit == 9) {
			output += onesSymbol + tensSymbol;
		} else if (digit == 4) {
			output += onesSymbol + fiveSymbol;
		} else if (digit > 4) {
			output += fiveSymbol;
			for (int i = 0; i < digit - 5; ++i) {
				output += onesSymbol;
			}
		} else {
			for (int i = 0; i < digit; ++i) {
				output += onesSymbol;
			}
		}
		return output;
	}
}
