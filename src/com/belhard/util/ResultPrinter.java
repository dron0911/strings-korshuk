package com.belhard.util;

public class ResultPrinter {

	public static void printArray(int[] array, String prompt) {
		System.out.print(prompt);
		for (int mass : array) {
			System.out.print("(" + mass + ") ");
		}
		System.out.println();
	}
	public static void printArray(String[] array) {
		for (String mass : array) {
			System.out.print( mass + ", ");
		}
		System.out.println();
	}

	public static void printArray(double[] array, String prompt) {
		System.out.print(prompt);
		for (double mass : array) {
			System.out.printf("(%.2f) ", mass);
		}
		System.out.println();
	}

	public static void printArrOfArr(int[][] array, String prompt) {
		System.out.print(prompt);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%7d", array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

}
