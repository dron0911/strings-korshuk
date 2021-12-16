package com.belhard.strings;

public class Task12 {
    public static void main(String[] args) {
        String line = """
                Today is wonderful day.
                And would like test this program.
                I think that's all be right.""";
        System.out.println("Number of sentences per line is: " + countSentences(line));
    }

    private static int countSentences(String line) {
        int counter = 1;
        char[] marks = {'.', '!', '?'};
        for (int i = 0; i < line.length() - 1; i++) {
            char character = line.charAt(i);
            for (char mark : marks) {
                if (character == mark && (line.charAt(i + 1) == ' ' || line.charAt(i + 1) == 10)) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
