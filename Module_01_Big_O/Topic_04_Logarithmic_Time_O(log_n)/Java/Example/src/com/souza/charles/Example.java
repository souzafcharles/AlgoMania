package com.souza.charles;
/**
 Course title: AlgoMania
 Instructor: Thiago Brito - Universo DEV
 Example adapted by: Charles Fernandes de Souza
 Date: September 8, 2024
 */
public class Example {
    public static Integer binarySearch(int[] myArray, int item) {
        int lower = 0;
        int upper = myArray.length - 1;
        while (lower <= upper) {
            int middle = (lower + upper) / 2;  // This division step is part of O(log n) complexity, narrowing down the search space.
            int guess = myArray[middle];

            if (guess == item) {
                return middle;
            } else if (guess > item) {
                upper = middle - 1;  // Reducing the upper bound, this step is O(log n) as it halves the search space.
            } else {
                lower = middle + 1;  // Increasing the lower bound, also O(log n) as it halves the search space.
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40};
        System.out.println(binarySearch(myArray, 30)); //
    }
}
