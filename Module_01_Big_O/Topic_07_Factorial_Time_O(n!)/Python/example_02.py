"""
Course title: AlgoMania
Instructor: Thiago Brito - Universo DEV
Example adapted by: Charles Fernandes de Souza
Date: October 15, 2024
"""
def generate_permutations(my_array):
  if len(my_array) == 0:
    return [[]]
  else:
    permutations = []
    for item in range(len(my_array)):
      element = my_array[item]
      rest = my_array[:item] + my_array[item+1:]
      # The recursive call below generates all permutations of the subarray.
      # This is where factorial time complexity O(n!) occurs.
      # For each element in the array, the function recursively generates all permutations of the remaining elements,
      # leading to n * (n-1) * (n-2) * ... * 1 permutations.
      for p in generate_permutations(rest):
        permutations.append([element] + p)  # Adds the selected element to each permutation of the subarray.
    return permutations

my_array = [10, 20, 30, 40]
# Generates all permutations of the array.
# This call leads to factorial time complexity O(n!) as it computes all possible permutations of the array.
all_permutations = generate_permutations(my_array)
print(all_permutations)
