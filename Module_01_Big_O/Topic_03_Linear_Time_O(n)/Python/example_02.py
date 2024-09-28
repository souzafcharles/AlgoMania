# -*- coding: utf-8 -*-
"""
Course title: AlgoMania
Instructor: Thiago Brito - Universo DEV
Example adapted by: Charles Fernandes de Souza
Date: September 27, 2024
"""
def find_max(my_array):
  max = 0  
  for item in my_array:  # O(n) linear time, iterates over each element in the array
    if item > max:  
      max = item  
  return max  
  
def main():
  my_array = [10,20,30,40]  
  result = find_max(my_array)  # O(n) linear time due to the find_max function
  print(result)  
main() 
