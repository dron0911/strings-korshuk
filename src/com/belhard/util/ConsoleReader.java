package com.belhard.util;

import java.util.Scanner;

public class ConsoleReader {

	public static int dimensionOfArray(Scanner scanner) {
		int n = getIntFromConsole(scanner, "Enter array dimension N: ");
		System.out.println();
		if (n <= 0) {
			throw new RuntimeException("N should be more than 0");
		} else {
			return n;
		}
	}

	public static int getIntFromConsole(Scanner scanner, String prompt) {
		System.out.print(prompt);
		int counter = 0;
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.print("Error! Expected (int) value. ");
			if (counter++ > 5) {
				System.exit(1);
			}
		}
		return scanner.nextInt();
	}

	public static double getDoubleFromConsole(Scanner scanner, String prompt) {
		System.out.print(prompt);
		int counter = 0;
		while (!scanner.hasNextDouble()) {
			scanner.next();
			System.out.print("Error! Expected (double) value. ");
			if (counter++ > 5) {
				System.exit(1);
			}
		}
		return scanner.nextDouble();
	}
}