package com.funkyhacker;

import java.util.Scanner;

public class ABC_087_C_Candies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int N = Integer.parseInt(scanner.next());
        scanner.nextLine();// To get rid of new line
        final String A1 = scanner.nextLine();
        final String A2 = scanner.nextLine();

        String[] A1Array = A1.split(" ");
        String[] A2Array = A2.split(" ");

        int[][] AIJ = new int[2][N];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0) {
                    AIJ[0][j] = Integer.parseInt(A1Array[j]);
                } else {
                    AIJ[1][j] = Integer.parseInt(A2Array[j]);
                }
            }
        }

        int result = 0;

        for (int i = 0; i < N; i++) {
            int I = 0;
            int sum = 0;
            for (int j = 0; j < N; j++) {
                if (j == i) {
                    sum += AIJ[0][j];
                    I = 1;
                }
                sum += AIJ[I][j];

            }
            if (result < sum) {
                result = sum;
            }
        }
        System.out.println(result);
    }
}
