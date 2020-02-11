"""

    Program: Numbers
    Description: A program that asks a user for two integers and runs a set of basic mathematical equations over them.
    Input: Two integers
    Output: The sum, difference, product and quotient of the two integers
    
"""
from functools import reduce


def reduce_array(array: [int], operator: str) -> int:
    return {
        '+': reduce(lambda x, y: x + y, array),
        '-': reduce(lambda x, y: x - y, array),
        '*': reduce(lambda x, y: x * y, array),
        '/': reduce(lambda x, y: x / y, array),
    }[operator]


def main():

    num_one = int(input("Give me a number: "))
    num_two = int(input("Give me another number: "))

    sum_result = reduce_array([num_one, num_two], '+')
    difference_result = reduce_array([num_one, num_two], '-')
    product_result = reduce_array([num_one, num_two], '*')
    quotient_result = reduce_array([num_one, num_two], '/')

    quotient_result = round(quotient_result, 2)

    print(sum_result)
    print(difference_result)
    print(product_result)
    print(quotient_result)


if __name__ == "__main__":
    main()
