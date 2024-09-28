"""
Course title: AlgoMania
Instructor: Thiago Brito - Universo DEV
Example adapted by: Charles Fernandes de Souza
Date: September 27, 2024
"""
def print_items(my_array):
  for item in my_array:
        # Since it iterates through all elements once, the loop runs 'n' times,
        # where 'n' is the size of the array.
    print(item)

def main():
  print_items(my_array = [10,20,30,40])
main()
