package com.souza.charles;
/**
 Course title: AlgoMania
 Instructor: Thiago Brito - Universo DEV
 Example adapted by: Charles Fernandes de Souza
 Date: October 07, 2024
 */
import java.util.ArrayList;

public class Example01 {

    private static int[] findCommonElements(int[] myArray01, int[] myArray02) {
        ArrayList<Integer> commonList = new ArrayList<>();
        
        // The nested loop structure here incurs O(n²) complexity.
        // The outer loop runs O(n) times (where n is the length of myArray01).
        for (int item01 : myArray01) {
            // The inner loop runs O(m) times for each iteration of the outer loop,
            // where m is the length of myArray02, leading to a combined complexity of O(n * m).
            // In the worst-case scenario where n ≈ m, this results in O(n²).
            for (int item02 : myArray02) {
                if (item01 == item02) {
                    commonList.add(item01);  // Constant time operation (O(1)), negligible compared to the nested loops.
                }
            }
        }

        int[] result = new int[commonList.size()];
        for (int i = 0; i < commonList.size(); i++) {
            result[i] = commonList.get(i);  // This loop runs O(k) times, where k is the size of common elements, which is generally ≤ n.
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
