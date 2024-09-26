package com.souza.charles;
/**
 Course title: AlgoMania
 Instructor: Thiago Brito - Universo DEV
 Example adapted by: Charles Fernandes de Souza
 Date: September 26, 2024
 */
public class Example03 {
    public static int example03(int[] data) {
        return data[0];
        // Returns the first element of the array, which takes constant time O(1)
        // since it directly accesses the element by index.
    }
    /*
    Accessing an element in an array by its index (in this case, data[0]) is a constant-time operation
    because it does not depend on the size of the array. The time it takes to perform this operation
    remains the same regardless of how many elements are in the array, which is why it is considered O(1).
    */
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40};
        int result = example03(data);
        System.out.println(result); // Prints the result
    }
}