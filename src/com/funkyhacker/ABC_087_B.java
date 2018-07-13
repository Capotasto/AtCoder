package com.funkyhacker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC_087_B {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int aCount = 0; //0 ~ 50
        int bCount = 0 ; //0 ~ 50
        int cCount = 0; //0 ~ 50
        int x = 0; //50 <= x <= 20,000 && x % 50 == 0
        int answer = 0;

        try {
            aCount = Integer.parseInt(bufferedReader.readLine());
            bCount = Integer.parseInt(bufferedReader.readLine());
            cCount = Integer.parseInt(bufferedReader.readLine());
            x = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < aCount + 1; i++) {
            for (int j = 0; j < bCount + 1; j++) {
                for (int k = 0; k < cCount + 1; k++) {
                    int total = 500 * i + 100 * j + 50 * k;
                    if (total == x) {
                        answer++;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
