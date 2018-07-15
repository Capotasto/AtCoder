package com.funkyhacker;

import java.util.Scanner;

public class ABC_075_B_Minesweeper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int W = scanner.nextInt();
        scanner.nextLine();//Tricky

        String[][] S = new String[W][H];

        for (int i = 0; i < H; i++) {
            String[] inputArray = scanner.nextLine().split("");
            for (int j = 0; j < W; j++) {
                S[j][i] = inputArray[j];
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if ("#".equals(S[j][i])) {
                    System.out.print(S[j][i]);
                    continue;
                }
                System.out.print(getBombCount(S, j, i));
            }
            System.out.println();
        }
    }

    private static int getBombCount(String[][] S, int i, int j) {
        int count = 0;
        if (isEuqls(S, i-1, j-1)) count++;
        if (isEuqls(S, i, j-1)) count++;
        if (isEuqls(S, i+1, j-1)) count++;
        if (isEuqls(S, i-1, j)) count++;
        if (isEuqls(S, i+1, j)) count++;
        if (isEuqls(S, i-1, j+1)) count++;
        if (isEuqls(S, i, j+1)) count++;
        if (isEuqls(S, i+1, j+1)) count++;
        return count;
    }

    private static boolean isEuqls(String[][] S, int i, int j) {
        try {
            return "#".equals(S[i][j]);
        } catch (Exception e) {
            return false;
        }
    }
}
