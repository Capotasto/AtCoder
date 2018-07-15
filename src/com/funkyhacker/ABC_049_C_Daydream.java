package com.funkyhacker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC_049_C_Daydream {
    public static void main(String[] args) {
        String[] words = {"dream", "dreamer", "erase", "eraser"};

        for (int i = 0; i < 4; i++) {
            words[i] = reverseString(words[i]);
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String S = null;
        try {
            S = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        S = reverseString(S);

        String answer = "YES";
        boolean isMatch;
        for (int i = 0; i < S.length();) {
            isMatch = false;
            for (String word : words) {
                if (isStartWith(i, S, word)) {
                    isMatch = true;
                    //S =  S.substring(word.length());
                    i += word.length();
                    break;
                }
            }
            if (!isMatch) {
                answer = "NO";
                break;
            }
        }
        System.out.format(answer);
    }

    private static boolean isStartWith(int index, String s, String word) {
        if (s.length() < word.length()) {
            return false;
        }
        boolean reslut = false;
        try {
            reslut = s.substring(index, index + word.length()).equals(word);
        } catch (Exception e) {
            return false;
        }
        return reslut;
    }

    private static String reverseString(String input) {
        StringBuilder builder = new StringBuilder();
        builder.append(input);
        return builder.reverse().toString();
    }
}
