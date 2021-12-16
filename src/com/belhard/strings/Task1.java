package com.belhard.strings;

import com.belhard.util.ResultPrinter;

public class Task1 {
    public static void main(String[] args) {
        String[] camelCase = {"getFirstName", "setLastName", "addStudent",
                "removeStudent"};
        String[] snakeCase = toSnakeCase(camelCase);
        ResultPrinter.printArray(snakeCase);
    }

    public static String[] toSnakeCase(String[] camelCase) {
        String[] snakeCase = new String[camelCase.length];
        for (int i = 0; i < snakeCase.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < camelCase[i].length(); j++) {
                char letter = camelCase[i].toCharArray()[j];
                if (Character.isLowerCase(letter)) {
                    stringBuilder.append(letter);
                } else {
                    stringBuilder.append("_");
                    stringBuilder.append(Character.toLowerCase(letter));
                }
            }
            snakeCase[i] = stringBuilder.toString();
        }
        return snakeCase;
    }
}
