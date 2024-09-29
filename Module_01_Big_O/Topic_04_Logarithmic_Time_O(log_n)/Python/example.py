"""
Course title: AlgoMania
Instructor: Thiago Brito - Universo DEV
Example adapted by: Charles Fernandes de Souza
Date: September 28, 2024
"""
def binary_search(my_array, item):
    lower_bound = 0
    upper_bound = len(my_array) - 1

    while lower_bound <= upper_bound:
        middle_index = (lower_bound + upper_bound) // 2 # It divides the search space in half with each iteration, effectively reducing the search time logarithmically O(log n)
        guess = my_array[middle_index]

        if guess == item:
            return middle_index
        elif guess > item:
            upper_bound = middle_index - 1
        else:
            lower_bound = middle_index + 1

    return None  #

my_array = [10, 20, 30, 40]
print(binary_search(my_array, 30))
