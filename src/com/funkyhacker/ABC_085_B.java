package com.funkyhacker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ABC_085_B {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> dList = new ArrayList<>();
        int answer = 0;
        while (true) {
            try {
                final String line = bufferedReader.readLine();
                if (line == null || line.length() == 0) {
                    break;
                }
                dList.add(Integer.parseInt(line));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        int n = dList.get(0);
        dList.remove(0);
        dList.sort(Collections.reverseOrder());

        int old = 101;// di <= 100
        for (Integer d : dList) {
            if (d < old) {
                old = d;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
