def compare_first_and_last(word: str) -> str:
    first_character, last_character = word[0], word[-1]

    return "first and last characters are the same" if \
        first_character == last_character else \
        "first and last characters are not the same"


print(compare_first_and_last('abracadabra'))
print(compare_first_and_last('alakazam'))
