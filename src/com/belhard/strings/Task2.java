package com.belhard.strings;

public class Task2 {
    public static void main(String[] args) {
        String word = "black black white black";
        String changeWord = changeWords(word);
        System.out.println(changeWord);

        System.out.println(word.replace("black", "white"));
    }

    public static String changeWords(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        String changeWord;
        for (int i = 0; i < word.length(); i++) {
            if (i + 4 < word.length() && word.charAt(i) == 'b'
                    && word.charAt(i + 1) == 'l'
                    && word.charAt(i + 2) == 'a'
                    && word.charAt(i + 3) == 'c'
                    && word.charAt(i + 4) == 'k') {
                stringBuilder.append("white");
                i += 4;
            } else {
                stringBuilder.append(word.charAt(i));
            }
        }
        changeWord = stringBuilder.toString();
        return changeWord;
    }
}
