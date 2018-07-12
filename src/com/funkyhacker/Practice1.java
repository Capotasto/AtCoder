package com.funkyhacker;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println(args.length);
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            if (i < 3) {
                sum += Integer.parseInt(args[i]);
            } else {
                System.out.format("%s %s", String.valueOf(sum), args[i]);
            }
        }
    }
}
