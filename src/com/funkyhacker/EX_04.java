package com.funkyhacker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class EX_04 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TestClass testClass = new TestClass();

        while (true) {
            String input = br.readLine();
            if ("exit".equals(input)) {
                break;
            }
            parseInput(input, testClass);
        }
    }

    private static void parseInput(String input, TestClass testClass) {
        if ("min".equals(input)) {
            //Do evict task
            System.out.println(testClass.min());
            return;
        } else if ("remove".equals(input)) {
            System.out.println(testClass.remove());
            return;
        }

        String[] inputs = input.split(" ");
        switch (inputs[0]) {
            case "add":
                if (inputs.length != 2) { // add 5
                    //Invalid param do nothing
                    return;
                }
                testClass.add(Integer.parseInt(inputs[1]));
                break;
                default:
                    //do nothing
                    break;
        }
    }

    private static class TestClass {

        List<Integer> data = new ArrayList<>();

        /**
         * data structureに要素を追加する。
         * add operationを実行します。パラメーターはvalueを示します。
         */
        private void add(int value) {
            data.add(value);
        }

        /**
         *  要素の中から一番最初に追加されたものを削除し、その値を返す。 削除する要素がなければException
         *  remove operationを実行します。その実行の値を出力します。結果がないか例外が発生した場合
         */
        private int remove() {
            if (data.size() == 0) {
                return -1;
            }
            int value = data.get(0);
            data.remove(0);
            return value;
        }

        /**
         * 入っている要素のうち、最も小さな値を返す。 要素がない場合Exception
         * min operationを実行します。その実行の値を出力します。結果がないか例外が発生した場合は'-1'を出力します。
         */
        private int min() {
            if (data.size() == 0) {
                return -1;
            }

            List<Integer> tmpList = new ArrayList<>(data);
            Collections.sort(tmpList, (o1, o2) -> o1.compareTo(o2));
            return tmpList.get(0);
        }
    }
}
