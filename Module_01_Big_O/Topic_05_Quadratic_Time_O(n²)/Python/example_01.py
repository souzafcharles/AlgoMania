"""
Course title: AlgoMania
Instructor: Thiago Brito - Universo DEV
Example adapted by: Charles Fernandes de Souza
Date: October 01, 2024
"""
def find_common_elements(my_array01, my_array02):
  result = []

  for item01 in my_array01:
    for item02 in my_array02:
      if item01 == item02:
        result.append(item01)
  return result
    
my_array01 = [10, 20, 30, 40]
my_array02 = [50, 20, 30, 80]
common_elements = find_common_elements(my_array01, my_array02)
print(common_elements)
