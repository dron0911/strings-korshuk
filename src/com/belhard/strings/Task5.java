package com.belhard.strings;

public class Task5 {
    public static void main(String[] args) {
        String shakespeareLine = "  Be   or not to  be - that is  the   question. ";
        System.out.println(removeExtraSpaces(shakespeareLine));

        System.out.println(shakespeareLine.replaceAll("( )+", " ").trim());
    }

    private static String removeExtraSpaces(String shakespeareLine) {
        StringBuilder stringBuilder = new StringBuilder();
        String line = shakespeareLine.trim();
        boolean isSpace = false;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                if (!isSpace) {
                    stringBuilder.append(" ");
                }
                isSpace = true;
            } else {
                stringBuilder.append(line.charAt(i));
                isSpace = false;
            }
        }
        return stringBuilder.toString();
    }
}