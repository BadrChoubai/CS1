"""
    Program: Numbers
    Description: A program that asks a user for two integers and runs a set of basic mathematical equations over them.
"""


def main():

    num_one = int(input("Give me a number: "))
    num_two = int(input("Give me another number: "))

    results = {
        'sum': (num_one + num_two),
        'difference': (num_one - num_two),
        'product': (num_one * num_two),
        'quotient': round(num_one / num_two, 2),
    }

    for result in results.keys():
        print('%s: %d' % (result, results[result]))


if __name__ == "__main__":
    main()
