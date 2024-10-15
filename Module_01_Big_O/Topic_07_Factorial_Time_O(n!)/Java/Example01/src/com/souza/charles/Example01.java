package com.souza.charles;
/**
 Course title: AlgoMania
 Instructor: Thiago Brito - Universo DEV
 Example adapted by: Charles Fernandes de Souza
 Date: October 15, 2024
 */
public class Example01 {
    public static void factorial(int maxNumber) {
        // Initiates a loop that will traverse from 0 up to maxNumber-1
        for (int each = 0; each < maxNumber; each++) {
            System.out.println(each);
            // Recursively calls the factorial function, decreasing the maxNumber by 1 each time
            // This recursive call generates factorial growth (O(n!)) due to the nature
            // of multiple recursive invocations
            factorial(maxNumber - 1);
        }
    }

    public static void main(String[] args) {
        factorial(3);
    }
}
