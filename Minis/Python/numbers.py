"""
    Program: Numbers
    Description: A program that asks a user for two integers and runs a set of basic mathematical equations over them.
"""


def main():

    num_one = int(input("Give me a number: "))
    num_two = int(input("Give me another number: "))

    sum_result = (num_one + num_two)
    difference_result = (num_one - num_two)
    product_result = (num_one * num_two)
    quotient_result = round(num_one / num_two, 2)

    print(sum_result)
    print(difference_result)
    print(product_result)
    print(quotient_result)


if __name__ == "__main__":
    main()
