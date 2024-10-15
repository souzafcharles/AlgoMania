package com.souza.charles;

import java.util.ArrayList;
import java.util.List;

public class Example02 {

    public static List < List < Integer >> generatePermutations(List < Integer > myArray) {
        if (myArray.isEmpty()) {
            return List.of(List.of()); // Base case: returns an empty list when the input list is empty.
        } else {
            List < List < Integer >> permutations = new ArrayList < > ();
            for (int i = 0; i < myArray.size(); i++) {
                Integer element = myArray.get(i); // Selects an element from the list.
                List < Integer > rest = new ArrayList < > (myArray.subList(0, i));
                rest.addAll(myArray.subList(i + 1, myArray.size())); // Creates a sublist excluding the selected element.

                // The recursive call below generates all permutations of the sublist.
                // This is where factorial time complexity O(n!) occurs.
                // For each element in the list, the function recursively generates all permutations
                // of the remaining elements, leading to n * (n-1) * (n-2) * ... * 1 permutations.
                for (List < Integer > p: generatePermutations(rest)) {
                    List < Integer > newPermutation = new ArrayList < > ();
                    newPermutation.add(element); // Adds the selected element to each permutation of the sublist.
                    newPermutation.addAll(p);
                    permutations.add(newPermutation);
                }
            }
            return permutations;
        }
    }

    public static void main(String[] args) {
        // Example list
        List < Integer > myArray = List.of(10, 20, 30, 40);

        // Generates all permutations of the list.
        // This call leads to factorial time complexity O(n!) as it computes all possible permutations of the list.
        List < List < Integer >> allPermutations = generatePermutations(myArray);

        // Prints all permutations of the list.
        System.out.println(allPermutations);
    }
}