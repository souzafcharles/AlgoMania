package com.souza.charles;
/**
 Course title: AlgoMania
 Instructor: Thiago Brito - Universo DEV
 Example adapted by: Charles Fernandes de Souza
 Date: October 8, 2024
 */
public class Example02 {
    public static int[] bubbleSort(int[] myArray) {
        int n = myArray.length;
        // First iteration over the array (O(n))
        for (int i = 0; i < n; i++) {
            // Second iteration for comparisons (O(n - i - 1)) ≈ O(n)
            for (int j = 0; j < n - i - 1; j++) {
                // Comparison and swapping elements if needed
                if (myArray[j] > myArray[j + 1]) {
                    // Swap elements
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
        return myArray;
    }

    public static void main(String[] args) {
        int[] myArray = {30, 40, 20, 10};
        int[] sortedArray = bubbleSort(myArray);
        for (int item: sortedArray) {
            System.out.print(item + " ");
        }
    }
}