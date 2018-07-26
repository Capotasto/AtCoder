package com.funkyhacker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ABC_087_C_Candies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int N = Integer.parseInt(scanner.next());
        final String A1 = scanner.next();
        final String A2 = scanner.next();

        String[] A1Array = A1.split(" ");
        String[] A2Array = A2.split(" ");

        int[][] AIJ = new int[2][N];

        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == 1) {
                    AIJ[1][j] = Integer.parseInt(A1Array[j]);
                } else {
                    AIJ[2][j] = Integer.parseInt(A1Array[j]);
                }
            }
        }

        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= N; j++) {
//                if ()
            }
        }

    }

    private static boolean isRightBiggerThanDown(final int[][] AIJ, final int N, int j) {
        if (N <= j) {
            return false;
        }
        if (AIJ[1][j+1] > AIJ[2][j]) {

        }
        return true;
    }

    private static boolean isRightBiggerThanUp() {
        return false;
    }
}
