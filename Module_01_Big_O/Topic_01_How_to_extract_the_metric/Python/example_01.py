"""
Course title: AlgoMania
Instructor: Thiago Brito - Universo DEV
Example adapted by: Charles Fernandes de Souza
Date: September 23, 2024
"""
def find_sum(my_array):
    total_sum = 0
    for item in my_array:
        total_sum += item
    return total_sum

def main():
    my_array = [10, 20, 30, 40]
    result = find_sum(my_array)
    print(f"The sum of the array elements is: {result}")
main()
