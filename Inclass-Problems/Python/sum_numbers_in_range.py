def sum_numbers_in_range(start: int, end: int, skip=0) -> int:
    r = [i for i in range(start, end+1)]
    sum_result = 0
    for d in r:
        sum_result += d

    return sum_result


print(sum_numbers_in_range(2, 20))
