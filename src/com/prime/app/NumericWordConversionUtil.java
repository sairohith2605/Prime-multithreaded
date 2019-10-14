package com.prime.app;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumericWordConversionUtil {

	
	public String getWordForNumber(int number) {
		String numberText = "";
		if(number<10) {
			numberText = getDigitWord(number);
		}
		else if(number >= 10 && number <20) {
			numberText = onesNameArray[number%10];
		}
		else {
			numberText = tensPlaceNameArray[(number/10)%10 - 1] + getDigitWord(number%10);
		}
		return numberText;
	}

	private String getDigitWord(int digit) {

		switch (digit) {
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6: 
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9: 
			return "nine";
		}
		return "";
	}
	
	public Map<Integer, String> checkPrime(int range1, int range2) {
		int count = 0;
		Map<Integer, String> primeNumMap = new LinkedHashMap<Integer, String>();
		for(int x=range1; x<=range2;x++) {
			count = 0;
			for(int i=1;i<=x;i++) {
				if(x%i==0) {
					count += 1;
				}
			}
			if(count == 2)
				primeNumMap.put(x, getWordForNumber(x));
		}
		return primeNumMap;
	}
	
	String[] onesNameArray = new String[] {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	String[] tensPlaceNameArray = new String[] {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
}
