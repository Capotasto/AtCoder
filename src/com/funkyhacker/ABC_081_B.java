package com.funkyhacker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC_081_B {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n;
        String aLine = "";
        try {
            n = Integer.parseInt(bufferedReader.readLine());
            aLine = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] aStringArray = aLine.split(" ");
        int[] aIntArray = convertStringArray(aStringArray);

        int divided = 0;
        while (!isInCludedOddNumber(aIntArray)) {
            for (int i = 0; i < aIntArray.length; i++) {
                aIntArray[i] /= 2;
            }
            divided++;
        }

        System.out.println(divided);
    }

    private static boolean isInCludedOddNumber(int[] array) {
        for (int i : array) {
            if (i % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    private static int[] convertStringArray(String[] array) {
        int[] aIntArray = new int[array.length];
        for (int i = 0; i < aIntArray.length; i++) {
            aIntArray[i] = Integer.parseInt(array[i]);
        }
        return aIntArray;
    }
}
