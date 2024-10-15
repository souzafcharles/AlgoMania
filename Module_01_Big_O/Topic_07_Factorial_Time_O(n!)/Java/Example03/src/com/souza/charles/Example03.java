package com.souza.charles;
/**
 Course title: AlgoMania
 Instructor: Thiago Brito - Universo DEV
 Example adapted by: Charles Fernandes de Souza
 Date: October 15, 2024
 */
public class Example03 {
    public static int factorial(int maxNumber) {
        if (maxNumber == 0) {
            return 1;
        } else {
            // Recursive case: calls itself with (maxNumber - 1)
            // This results in O(n!) time complexity because
            // for each value of maxNumber, we need to calculate
            // the factorial of all smaller numbers down to 1,
            // leading to n! total operations for the recursive calls.
            return maxNumber * factorial(maxNumber - 1);
        }
    }

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println(result);
    }
}
