package com.prime.app;

import java.util.Map;
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) throws InterruptedException {
		NumericWordConversionUtil util = new NumericWordConversionUtil();
		System.out.println("Enter the range of Numbers.");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int range1 = Integer.parseInt(s.split(" ")[0]);
		int range2 = Integer.parseInt(s.split(" ")[1]);
		
		// String s = util.getWordForNumber(10);
		Map<Integer, String> primeMap = util.checkPrime(range1, range2);
		System.out.println("Identified Primes: ");
		for(int pn: primeMap.keySet()) {
			System.out.println(pn);
		}
		System.out.println("Enter a number to create Threads.");
		int x = sc.nextInt();
		sc.close();
		if(primeMap.containsKey(x)) {
			for(int i = 0;i<primeMap.get(x).length();i++) {
				char t = primeMap.get(x).charAt(i);
				Thread thread = new Thread(new NumeralConverterService(t+""));
				//NumeralConverterService service = 
				thread.start();
				thread.join();
			}		
		}
		else {
			System.out.println("There's no prime number as that in the above range.");
		}
		
	}
}
