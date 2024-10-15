"""
Course title: AlgoMania
Instructor: Thiago Brito - Universo DEV
Example adapted by: Charles Fernandes de Souza
Date: October 15, 2024
"""
def factorial(max_number):
    # Initiates a loop that will traverse from 0 up to max_number-1
    for each in range(max_number):
        print(each)
        # Recursively calls the factorial function, decreasing the max_number by 1 each time
        # This recursive call generates factorial growth (O(n!)) due to the nature of multiple recursive invocations
        factorial(max_number - 1)

factorial(3)
