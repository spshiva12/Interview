package com.sdr.firstprogram;

public class Program1 {

	public static void printCharacters() {

		char c;
		for (c = 'a'; c <= 'z'; c++) {
			System.out.print(c + " ");
		}
	}
	
	public static void main(String[] args) {
		printCharacters();
	}

}
