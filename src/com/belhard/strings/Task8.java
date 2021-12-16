package com.belhard.strings;

public class Task8 {
    public static void main(String[] args) {
        String[] words = {"madam", "level", "abcbba"};
        for (String word : words) {
            String result = isPalindrome(word) ? " - palindrome" : " - not palindrome";
            System.out.println(word + result);
        }
    }

    public static boolean isPalindrome(String word) {
        int n = word.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

