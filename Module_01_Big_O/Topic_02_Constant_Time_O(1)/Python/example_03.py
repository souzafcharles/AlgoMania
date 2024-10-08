"""
Course title: AlgoMania
Instructor: Thiago Brito - Universo DEV
Example adapted by: Charles Fernandes de Souza
Date: September 26, 2024
"""
def example_3(data):
    # Accessing the first element of the array is O(1) (constant time)
    # because it directly retrieves the value at a specific index without
    # any iteration or additional operations.
    return data[0]

result = example_3([10, 20, 30, 40])
print(result)
