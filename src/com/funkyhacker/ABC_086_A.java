package com.funkyhacker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC_086_A {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = new String[2];
        try {
            inputs = bufferedReader.readLine().split(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        int multi = Integer.parseInt(inputs[0]) * Integer.parseInt(inputs[1]);
        if (multi % 2 == 0) {
            System.out.println("Even");
            return;
        }
        System.out.println("Odd");
    }
}
