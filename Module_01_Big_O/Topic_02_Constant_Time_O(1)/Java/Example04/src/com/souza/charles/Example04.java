package com.souza.charles;
/**
 Course title: AlgoMania
 Instructor: Thiago Brito - Universo DEV
 Example adapted by: Charles Fernandes de Souza
 Date: September 26, 2024
 */
import java.util.Queue;
import java.util.LinkedList;
public class Example04 {

    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        // The size() method is O(1) (constant time) because it returns
        // the number of elements in the queue without needing to
        // traverse the entire data structure.
        System.out.println("Size of the queue: " + myQueue.size());
    }
}