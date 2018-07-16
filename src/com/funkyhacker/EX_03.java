package com.funkyhacker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class EX_03 {
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
        if ("evict".equals(input)) {
            //Do evict task
            testClass.evict();
            return;
        }

        String[] inputs = input.split(" ");
        switch (inputs[0]) {
            case "add":
                if (inputs.length != 3) { // add 5 3
                    //Invalid param do nothing
                    return;
                }
                testClass.add(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2]));
                break;
            case "get":
                if (inputs.length != 2) { // get 1
                    //Invalid param do nothing
                    return;
                }
                System.out.println(testClass.get(Integer.parseInt(inputs[1])));
                break;
            case "remove":
                if (inputs.length != 2) { // remove 1
                    //Invalid param do nothing
                    return;
                }
                System.out.println(testClass.remove(Integer.parseInt(inputs[1])));
                break;
                default:
                    //do nothing
                    break;
        }
    }

    private static class TestClass {

        private Map<Integer, Integer> data = new HashMap<>();
        private Map<Integer, Long> dataTime = new HashMap<>();//経過時間用

        /**
         * data structureに、key、valueからなる要素を追加する。
         * @param key
         * @param value
         */
        private void add(int key, int value) {
            data.put(key, value);
            dataTime.put(key, System.currentTimeMillis());
        }

        /**
         * keyに該当する要素を探してそのvalueを返す。要素がない場合Exception (-1 を返す)
         * @param key
         * @return
         */
        private int get(int key) {
            if (data.get(key) == null) {
                return -1;
            }
            dataTime.put(key, System.currentTimeMillis());
            return data.get(key);
        }

        /**
         * keyに該当する要素を探してそのvalueを返し、要素を削除する。要素がない場合Exception (-1 を返す)
         * @param key
         * @return
         */
        private int remove(int key) {
            if (data.get(key) == null) {
                return -1;
            }
            int value = data.get(key);
            data.remove(key);
            dataTime.remove(key);
            return value;
        }

        /**
         * 全要素のうちaddやgetされてからの経過時間が最も長い要素を削除
         */
        private void evict() {
            List<Map.Entry<Integer, Long>> list_entries = new ArrayList<>(dataTime.entrySet());
            Collections.sort(list_entries, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
            int removeKey = list_entries.get(0).getKey();
            remove(removeKey);
        }
    }
}
