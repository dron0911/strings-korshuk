package com.belhard.strings;

public class Task14 {
    public static void main(String[] args) {
        String line = "ab=c +cde d.\\ef    abzcc!";
        System.out.println(removeCharacters(line));
    }

    private static String removeCharacters(String line) {
        StringBuilder stringBuilder = new StringBuilder(line);
        for (int i = 0; i < stringBuilder.length(); i++) {
            char[] marks = {'=', '!', '+', ' ', '.', '\\'};
            for (char mark : marks) {
                if (stringBuilder.charAt(i) == mark) {
                    stringBuilder.deleteCharAt(i);
                    i--;
                }
            }
            for (int j = i + 1; j < stringBuilder.length(); j++) {
                if (stringBuilder.charAt(j) == stringBuilder.charAt(i)) {
                    stringBuilder.deleteCharAt(j);
                }
            }
        }
        return stringBuilder.toString();
    }
}
