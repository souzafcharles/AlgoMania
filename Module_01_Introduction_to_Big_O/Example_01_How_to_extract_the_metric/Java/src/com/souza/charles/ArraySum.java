package com.souza.charles;
/**
 Course title: AlgoMania
 Instructor: Thiago Brito - Universo DEV
 Example adapted by: Charles Fernandes de Souza
 Date: September 23, 2024
 */

public class ArraySum {
    public static int findSum(int[] myArray) {
        int totalSum = 0;
        for (int item: myArray) {
            totalSum += item;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40};
        int result = findSum(myArray);
        System.out.printf("The sum of the array elements is: %d%n", result);
    }
}
