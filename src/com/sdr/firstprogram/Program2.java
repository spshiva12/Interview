package com.sdr.firstprogram;

public class Program2 {

	public static void printCharacters() {
		for (char c1 = 'a'; c1 <= 'z'; c1++) {
			for (char c2 = 'a'; c2 <= 'z'; c2++) {
				System.out.print(" " + c1 + c2);
			}
		}
	}

	public static void main(String[] args) {
		printCharacters();
	}

}
