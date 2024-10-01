"""
Course title: AlgoMania
Instructor: Thiago Brito - Universo DEV
Example adapted by: Charles Fernandes de Souza
Date: October 01, 2024
"""
def bubble_sort(my_array):
    n = len(my_array)
    # First iteration over the list (O(n))
    for i in range(n):
        # Second iteration for comparisons (O(n - i - 1)) ≈ O(n)
        for j in range(0, n - i - 1):
            # Comparison and swapping elements if needed
            if my_array[j] > my_array[j + 1]:
                my_array[j], my_array[j + 1] = my_array[j + 1], my_array[j]  # Swap elements
    return my_array

my_array = [30, 40, 20, 10]
sorted_array = bubble_sort(my_array)
sorted_array
