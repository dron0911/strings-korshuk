package com.belhard.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task13 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line = reader.readLine();
        System.out.println(repeatCharacter(line));
    }

    private static String repeatCharacter(String line) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
                stringBuilder.append(line.charAt(i));
                stringBuilder.append(line.charAt(i));
            }
        return stringBuilder.toString();
    }
}
