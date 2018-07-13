package com.funkyhacker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ABC_088_B {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        String aInput = "";

        try {
            n = Integer.parseInt(bufferedReader.readLine());
            aInput = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] aArray = aInput.split(" ");
        List<Integer> aList = new ArrayList<>();
        for (String aString : aArray) {
            aList.add(Integer.parseInt(aString));
        }
        int alice = 0;
        int bob = 0;
        int i = 0;
        while (aList.size() > 0) {
            int max =  getMaxValue(aList);
            if (i % 2 == 0) {
                alice += max;
            } else {
                bob += max;
            }
            aList.remove(Integer.valueOf(max));
            i++;
        }

        System.out.println(alice - bob);
    }

    private static int getMaxValue(List<Integer> list) {
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        return max.get();
    }
}
