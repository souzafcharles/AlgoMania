package com.souza.charles;

import java.util.ArrayList;

public class Example01 {

    private static int[] findCommonElements(int[] myArray01, int[] myArray02) {
        ArrayList<Integer> commonList = new ArrayList<>();
        for (int item01 : myArray01) {
            for (int item02 : myArray02) {
                if (item01 == item02) {
                    commonList.add(item01);
                }
            }
        }

        int[] result = new int[commonList.size()];
        for (int i = 0; i < commonList.size(); i++) {
            result[i] = commonList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] myArray01 = {10, 20, 30, 40};
        int[] myArray02 = {50, 20, 30, 80};
        int[] commonElements = findCommonElements(myArray01, myArray02);
        for (int element : commonElements) {
            System.out.print(element + " ");
        }
    }
}
