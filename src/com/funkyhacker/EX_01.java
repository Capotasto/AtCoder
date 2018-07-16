package com.funkyhacker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class EX_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useRadix(10);
        int arrSize  = scanner.nextInt();
        scanner.nextLine();

        byte[] bytes = new byte[arrSize];
        for(int i=0;i<arrSize;i++){
            bytes[i] = Integer.valueOf(scanner.nextInt()).byteValue();
        }
        scanner.nextLine();

        int dest = scanner.nextInt();
        int src = scanner.nextInt();
        int size = scanner.nextInt();
        scanner.close();

        try {
            memcpy(bytes, dest, src, size);
        } catch (Exception e) {
            //ignore
        }
        printBytes(bytes, System.out);
    }

    private static void memcpy(byte[] v, int dest, int src, int size) {
        if (size <= 0) {
            //do nothing
            return;
        }
        for (int i = 0; i < size; i++) {
            v[dest + i] = v[src + i];
        }
    }

    private static void printBytes(byte[] bytes, PrintStream out) {
        for (byte item : bytes) {
            out.print(Byte.toUnsignedInt(item));
            out.print(' ');
        }
    }
}
