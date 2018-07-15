package com.funkyhacker;

import java.util.Scanner;

public class ABC_086_C_Traveling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] t = new int[110000];
        int[] x = new int[110000];
        int[] y = new int[110000];
        t[0] = 0;
        x[0] = 0;
        y[0] = 0;
        for (int i = 0; i < N; i++) {
            t[i+1] = scanner.nextInt();
            x[i+1] = scanner.nextInt();
            y[i+1] = scanner.nextInt();
        }

        boolean result = true;

        for (int i = 0; i < N; i++) {
            int dt = t[i + 1] - t[i];
            int dist = Math.abs(x[i + 1] - x[i]) + Math.abs(y[i + 1] - y[i]);
            if (dt < dist) {
                result = false;
                break;
            }
            if (dt % 2 != dist %2) {
                result = false;
                break;
            }
        }

        if (result) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
