package com.funkyhacker;

import java.util.Scanner;

public class ABC_096_C_Grid_Repainting_2 {
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

        boolean isPossible = true;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if ("#".equals(S[j][i]) && !isExistingPound(S, j, i)) {
                    isPossible = false;
                    break;
                }
            }
        }
        if (isPossible) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    private static boolean isExistingPound(String[][] S, int i, int j) {
        return isEquals(S, i, j - 1)
                || isEquals(S, i - 1, j)
                || isEquals(S, i + 1, j)
                || isEquals(S, i, j + 1);
    }

    private static boolean isEquals(String[][] S, int i, int j) {
        try {
            return "#".equals(S[i][j]);
        } catch (Exception e) {
            return false;
        }
    }
}
