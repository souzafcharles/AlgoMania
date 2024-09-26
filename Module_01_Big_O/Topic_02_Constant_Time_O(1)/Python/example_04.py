"""
Course title: AlgoMania
Instructor: Thiago Brito - Universo DEV
Example adapted by: Charles Fernandes de Souza
Date: September 26, 2024
"""
import queue
def example_04():
    my_queue = queue.Queue()
    my_queue.put(1)
    my_queue.put(2)
    my_queue.put(3)
    # The size() method is O(1) (constant time) because it returns
    # the number of elements in the queue without needing to
    # traverse the entire data structure.
    print("Size of the queue:", my_queue.qsize())
example_04()
