package com.funkyhacker;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        String s = scanner.next();

        System.out.format("%d %s\n", a+b+c, s);
    }
}
