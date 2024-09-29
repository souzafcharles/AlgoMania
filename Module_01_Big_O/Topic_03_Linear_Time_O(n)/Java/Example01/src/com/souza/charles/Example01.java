package com.souza.charles;
/**
 Course title: AlgoMania
 Instructor: Thiago Brito - Universo DEV
 Example adapted by: Charles Fernandes de Souza
 Date: September 28, 2024
 */
public class Example01 {

    private static void printItem(int[] myArray) {
        for (int item : myArray){     // Since it iterates through all elements once, the loop runs 'n' times,
            System.out.println(item); // where 'n' is the size of the array.
        }
    }

    public static void main(String[] args) {
        int [] myArray = {10, 20, 30, 40};
        printItem(myArray);
    }
}
