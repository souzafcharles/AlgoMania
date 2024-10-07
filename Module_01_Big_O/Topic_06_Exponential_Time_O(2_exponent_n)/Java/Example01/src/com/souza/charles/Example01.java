package com.souza.charles;
/**
 Course title: AlgoMania
 Instructor: Thiago Brito - Universo DEV
 Example adapted by: Charles Fernandes de Souza
 Date: October 07, 2024
 */
public class Example01 {
    public static int fibonacci(int number) {
        if (number <= 1) {
            return number;
        }
        // The following two recursive calls create two subproblems
        // The combination of these recursive calls generates an exponential number of calls, leading to O(2^n) complexity
        return fibonacci(number - 2) + fibonacci(number - 1);
    }

    public static void main(String[] args) {
        int number = 10;
        System.out.println(fibonacci(number));
    }
}
/**
 fibonacci(2) = 1
 fibonacci(3) = 2
 fibonacci(4) = 3
 fibonacci(5) = 5
 fibonacci(6) = 8
 fibonacci(7) = 13
 fibonacci(8) = 21
 fibonacci(9) = 34
 fibonacci(10) = 55
 Fibonacci(10) = 55
 */