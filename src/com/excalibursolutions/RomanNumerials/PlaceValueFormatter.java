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
	
	public PlaceValueFormatter(String theTensSymbol, String theFiveSymbol, String theOnesSymbol) {
		tensSymbol = theTensSymbol;
		fiveSymbol = theFiveSymbol;
		onesSymbol = theOnesSymbol;
	}
	
	public String format(int digit) {
		String output = "";
		
		if (digit == 9) {
			output += onesSymbol + tensSymbol;
		} else if (digit == 4) {
			output += onesSymbol + fiveSymbol;
		} else {
			if (digit > 4) {
				output += fiveSymbol;
				digit -= 5;
			}
			
			for (int i = 0; i < digit; ++i) {
				output += onesSymbol;
			}
		}
		return output;
	}
}
