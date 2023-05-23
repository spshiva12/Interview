package com.sdr.firstprogram;

public class DynamicApproach {

	public static void main(String[] args) {

		int minLength = 1;
		int maxLength = 3;
		for (int i = minLength; i <= maxLength; i++) {
			generateCombinations("", i);
		}

	}

	public static void generateCombinations(String prefix, int length) {
		if (length == 0) {
			System.out.println(prefix);
			return;

		}
		for (char c = 'a'; c <= 'z'; c++) {
			generateCombinations(prefix + c, length - 1);
		}
	}

}
