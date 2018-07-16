package com.funkyhacker;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EX_02 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int size = Integer.parseInt(br.readLine());

        boolean[][] graph = new boolean[size][size]; // xのサイズに明記は無いのでsizeと同じとする

        List<Point> pointList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            String[] inputArray = br.readLine().split("");
            boolean[] booleans = getBoolArray(inputArray, size);
            for (int j = 0; j < size; j++) {// y の大きさははsize
                graph[i][j] = booleans[j];
                if (booleans[j]) {
                    pointList.add(new Point(i, j));//Trueの座標のみを保持しておく
                }
            }
        }
        final int length = Integer.parseInt(br.readLine());


        findCycle(graph, pointList, length);

    }

    private static boolean[] getBoolArray(String[] array, final int size) {
        boolean[] booleans = new boolean[size];
        for (int i = 0; i < size; i++) {
            switch (array[i]) {
                case "0":
                    booleans[i] = false;
                    break;
                case "1":
                    booleans[i] = true;
                    break;
                    default:
                        //In case
                        booleans[i] = false;
                        break;
            }
        }
        return booleans;
    }

    private static void findCycle(boolean[][] graph, List<Point> points, int m) {
        //1. 双方向のノードを削除する
        boolean isExistBiDirectNote = true;

        while (isExistBiDirectNote) {
//            int removeIdex
            for (int i = 0; i < points.size(); i++) {
                int x = points.get(i).x;
                int y = points.get(i).y;
                Point reverse = new Point(y, x);
                for (int j = 0; j < points.size(); j++) {

                }
            }
        }


    }

}
