package com.funkyhacker;

import java.util.Scanner;

public class ABC_055_B_Training_Camp {
    public static void main(String[] args) {

        final double MOD = 1000000007;

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //1 <= N <= 100000

        double power = 1;
        for (int i = 1; i <= N; i++) {
           power = i * power % MOD;
        }
        System.out.printf("%.0f\n", power);
    }
}
