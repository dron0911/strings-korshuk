package com.belhard.strings;

public class Task6 {
    public static void main(String[] args) {
        String shakespeareLine = "  Be    (4)or     (5)not to  be - that is  the   question. ";
        System.out.println(findMoreSpaces(shakespeareLine));
    }

    private static int findMoreSpaces(String line) {
        int counter = 0;
        int maxCount = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                counter++;
            } else {
                if (maxCount < counter) {
                    maxCount = counter;
                }
                counter = 0;
            }
        }
        return maxCount;
    }
}
