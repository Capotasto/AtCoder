package com.funkyhacker;

import java.util.Scanner;

public class ABC_083_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nString = scanner.next();
        int n = Integer.parseInt(nString);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int answer = 0;

        for (int i = 1 ; i <= n ; i++) {
            int digitSum = getDigitSum(String.valueOf(i));
            if (a <= digitSum && digitSum <= b) {
                answer += i;
            }
        }
        System.out.println(answer);
    }

    private static int getDigitSum(String input) {
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            result += Character.getNumericValue(input.charAt(i));
        }
        return result;
    }
}
