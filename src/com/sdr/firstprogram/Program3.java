package com.sdr.firstprogram;

public class Program3 {

	public static void printCharacters() {
		for (char c1 = 'a'; c1 <= 'z'; c1++) {
			for (char c2 = 'a'; c2 <= 'z'; c2++) {
				for (char c3 = 'a'; c3 <= 'z'; c3++) {
					System.out.println(""+c1 + c2 + c3);
				}
			}
		}
	}

	public static void main(String[] args) {
		printCharacters();
	}

}
