package com.belhard.strings;

public class Task7 {
    public static void main(String[] args) {
        String line = "My nbme is Bndrew.";
        System.out.println(changeSymbol(line));
    }

    private static String changeSymbol(String line) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'b') {
                stringBuilder.append("a");
            } else if (line.charAt(i) == 'B') {
                stringBuilder.append("A");
            } else
                stringBuilder.append(line.charAt(i));
        }
        return stringBuilder.toString();
    }
}
