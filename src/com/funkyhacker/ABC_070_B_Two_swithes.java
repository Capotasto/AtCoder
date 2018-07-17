package com.funkyhacker;

import java.util.Scanner;

public class ABC_070_B_Two_swithes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        //Not merged case
        if (B <= C || D <= A) {
            System.out.print(0);
            return;
        }

        //One range is in the other range
        if (A <= C && D <= B) {
            System.out.print(D - C);
            return;
        }
        if (C <= A && B <= D) {
            System.out.print(B - A);
        }

        //Merged two range
        if (A < C && B < D) {
            System.out.print(B - C);
            return;
        }

        if (C < A && D < B){
            System.out.print(D - A);
        }
    }
}
