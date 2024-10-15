"""
Course title: AlgoMania
Instructor: Thiago Brito - Universo DEV
Example adapted by: Charles Fernandes de Souza
Date: October 15, 2024
"""
def factorial(max_number):
    if max_number == 0:
        return 1
    else:
        # Recursive case: calls itself with (max_number - 1)
        # This results in O(n!) time complexity because
        # for each value of max_number, we need to calculate
        # the factorial of all smaller numbers down to 1,
        # leading to n! total operations for the recursive calls.
        return max_number * factorial(max_number - 1)

result = factorial(5)
print(result)
