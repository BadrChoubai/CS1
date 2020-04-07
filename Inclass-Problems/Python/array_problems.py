from random import sample, randint


def all_to_zero(numbers: list) -> list:
    '''
    Args:
        numbers: list of numbers to iterate through
    Returns:
        numbers: list of numbers with all values as '0'
    '''
    for i, num in enumerate(numbers):
        if num != 0:
            numbers[i] = 0

    return numbers


def count_zeros(numbers: list) -> int:
    '''
    Args:
        numbers: list of numbers to iterate through
    Returns:
        zeros: amount of zeroes in list
    '''
    counter = 0
    for num in numbers:
        if num == 0:
            counter += 1

    return counter


def subtract_each_by(numbers: list, subtractor: int) -> list:
    '''
    Args:
        numbers: list of numbers to iterate through
        subtractor: number to subtract each number in iteration by
    Returns:
        numbers: original list passed in with values subtracted by subtractor
    '''
    for i, _ in enumerate(numbers):
        numbers[i] = numbers[i] - subtractor

    return numbers


def sum_list(numbers: int) -> int:
    '''
    Args:
        numbers: a list of numbers to iterate through
    Returns:
        sum_result: the sum of all values in numbers list
    '''
    sum_result = 0
    for num in numbers:
        sum_result += num

    return sum_result


# Generate 10 random numbers between 0 and 100
numbers: list = sample(range(0, 101), 10)

print(f'''
Original Numbers List -> { numbers }

all_to_zero() -> { all_to_zero(numbers.copy()) }
count_zeros() -> { count_zeros(numbers.copy()) }
subtract_each_by() -> { subtract_each_by(numbers.copy(), randint(1, 21))}
sum_list() -> { sum_list(numbers.copy()) }
''')
