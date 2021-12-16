package com.belhard.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task11 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line = reader.readLine();
        System.out.printf("Lower case letter: %d%n", countLowerCase(line));
        System.out.printf("Upper case letter: %d%n", countUpperCase(line));
    }

    private static int countLowerCase(String line) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            char letter = line.charAt(i);
            if (letter >= 'a' && letter <= 'z') {
                counter++;
            }
        }
        return counter;
    }

    private static int countUpperCase(String line) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            char letter = line.charAt(i);
            if (letter >= 'A' && letter <= 'Z') {
                counter++;
            }
        }
        return counter;
    }
}
