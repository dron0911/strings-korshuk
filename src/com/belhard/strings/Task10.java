package com.belhard.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        System.out.println(findLongestWord(line));
    }

    private static String findLongestWord(String line) {
        String longestWord = "";
        int maxLength = 0;
        String[] words = line.split(" ");
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                longestWord = words[i];
            }
        }
        return longestWord;
    }
}
