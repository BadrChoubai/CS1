"""

	Program: Numbers;
	Author: Badr Choubai;
	Date: 2019-08-30;
    Description: A program that asks a user for two integers and runs a set of basic mathematical equations over them.

    Input: Two integers;
    Output: The sum, product and, quotient of the two integers;
    
"""


def get_user_input() -> int:
	return input("Give me a number: ")


def reduce_array(array: [int], operator: str) -> int:
	def _sum(array: [int]) -> int:
		i = 0
		result = 0
		while i < len(array):
			result += array[i]
			i += 1

		return result

	def _difference(array: [int]) -> int:
		i = 0
		result = 0
		while i < len(array):
			result -= array[i]
			i += 1

		return result

	def _product(array: [int]) -> int:
		i = 0
		result = 1
		while i < len(array):
			result *= array[i]
			i += 1

		return result

	def _quotient(array: [int]) -> int:
		i = 0
		result = 1
		while i < len(array):
			result /= array[i]
			i += 1

		return result

	def output(operator: str) -> int:
		return {
			'+': _sum(array),
			'-': _difference(array),
			'*': _product(array),
			'/': _quotient(array)
		}[operator]

	return output(operator)


def main():
	num_one = int(get_user_input())
	num_two = int(get_user_input())

	sum_result = reduce_array([num_one, num_two], '+')
	difference_result = reduce_array([num_one, num_two], '-')
	product_result = reduce_array([num_one, num_two], '*')
	quotient_result = reduce_array([num_one, num_two], '/')

	print(sum_result)
	print(difference_result)
	print(product_result)
	print(quotient_result)


if __name__ == "__main__":
	main()
