"""
    Program: Initials 
    Description: A program that asks a user for their first, middle? and, last name. Print the user's initials 
"""


def main():
    first_name = input("Give me your first name: ")
    middle_name = input("Give me your middle name: ") or ''
    last_name = input("Give me your last name: ")

    initials = f'{ first_name[0] }.{ ( middle_name[0] + "." ) if middle_name else "" }{ last_name[0] }.'
    print(initials.upper())


if __name__ == "__main__":
    main()
