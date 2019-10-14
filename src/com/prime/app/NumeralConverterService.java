package com.prime.app;

public class NumeralConverterService implements Runnable {

	public NumeralConverterService(String text) {
		this.text = text;
	}
	
	@Override
	public void run() {
		displayIndividualLetters(text);
		
	}
	
	
	public synchronized void displayIndividualLetters(String letter) {
		System.out.println(letter);
		
	}

	String text;
}
