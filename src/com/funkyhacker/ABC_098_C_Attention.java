package com.funkyhacker;

import java.util.Scanner;

public class ABC_098_C_Attention {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int N = Integer.parseInt(scanner.next());
        scanner.nextLine();// To get rid of new line
        final String S = scanner.nextLine();
        final String[] SArray = S.split("");

        int result = N;
        for (int i = 0; i < SArray.length; i++) {
            int total = 0;
            for (int j = 0; j < SArray.length; j++) {
                if (i == j) {
                    continue;
                }
                if(i < j) {
                    //Case: SArray[i] < Srray[j]
                    if ("E".equals(SArray[j])) {
                        total++;
                    }
                } else {
                    //Case: SArray[i] > Srray[j]
                    if ("W".equals(SArray[j])) {
                        total++;
                    }
                }
            }
            if (total < result) {
                result = total;
            }
        }

        System.out.println(result);
    }
}
