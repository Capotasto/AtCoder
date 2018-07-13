package com.funkyhacker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC_081_A {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input =  "";
        try {
            input = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if ('1' == input.charAt(i)){
                count++;
            }
        }

        System.out.println(count);
    }
}
