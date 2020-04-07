def compare_first_and_last(word: str) -> str:
    return "first and last characters are the same" if \
        word[0] == word[-1] else \
        "first and last characters are not the same"


print(compare_first_and_last('abracadabra'))
print(compare_first_and_last('alakazam'))
