package com.belhard.strings;

public class Task9 {
    public static void main(String[] args) {
        String line = "ara rar arr";
        char findCharacter = 'a';
        System.out.println(countCharacter(line, findCharacter));
    }

    private static int countCharacter(String line, char character) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == character) {
                counter++;
            }
        }
        return counter;
    }
}
