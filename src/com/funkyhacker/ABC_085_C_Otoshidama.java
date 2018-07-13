package com.funkyhacker;

import java.util.Scanner;

public class ABC_085_C_Otoshidama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int yen = scanner.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;

        loop: for (int i = 0; i <= n; i++) {
            for (int j = 0; i + j <= n; j++) {
                int c = n - i - j;
                int total = 10000 * i + 5000 * j + 1000 * c;
                if (total == yen && i + j + c == n) {
                    x = i;
                    y = j;
                    z = c;
                    break loop;
                }

            }
        }
        if (x == 0 && y == 0 && z == 0) {
           System.out.format("%d %d %d", -1, -1, -1);
           return;
        }
        System.out.format("%d %d %d", x, y, z);
    }
}
