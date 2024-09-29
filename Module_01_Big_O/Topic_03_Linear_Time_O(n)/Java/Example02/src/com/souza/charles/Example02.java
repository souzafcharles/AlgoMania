package com.souza.charles;
/**
 Course title: AlgoMania
 Instructor: Thiago Brito - Universo DEV
 Example adapted by: Charles Fernandes de Souza
 Date: September 28, 2024
 */
public class Example02 {

    public static void main(String[] args) {

        int[] myArray = {10, 20, 30, 40};
        int result = findMax(myArray); // O(n) linear time due to the findMax function
        System.out.println(result);
    }

    private static int findMax(int[] myArray) {
        int max = 0;
        for (int item: myArray) { // O(n) linear time, iterates over each element in the array
            if (item > max) {
                max = item;
            }
        }
        return max;
    }
}