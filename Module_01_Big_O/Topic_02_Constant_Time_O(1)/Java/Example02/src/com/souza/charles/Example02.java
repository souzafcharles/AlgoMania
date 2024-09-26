package com.souza.charles;
/**
 Course title: AlgoMania
 Instructor: Thiago Brito - Universo DEV
 Example adapted by: Charles Fernandes de Souza
 Date: September 26, 2024
 */
public class Example02 {
    // This method takes an integer n and returns it.
    // The time complexity is O(1) because the method performs a single operation,
    // regardless of the size or value of n. It always takes the same amount of time to execute.
    public static int example02(int n) {
        return n;
    }

    public static void main(String[] args) {
        int result = example02(1); // Calls the example02 method with a constant value 1
        System.out.println(result); // Prints the result
    }
}
