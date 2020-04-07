def compare_halves(word_one: str, word_two: str) -> str:
    return "word halves are equal" if \
        word_one[0:2] == word_two[0:2] else \
        "word halves are not equal"


print(compare_halves('badr', 'brad'))
print(compare_halves('than', 'then'))
