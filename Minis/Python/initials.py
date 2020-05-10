"""
    Program: Initials 
    Description: A program that asks a user for their first, middle? and, last name. Print the user's initials 
"""


def main():
    name_parts = ['first', 'middle', 'last']
    for i, part in enumerate(name_parts):
        name_parts[i] = input(f'Give me your {part} name: ')

    print(''.join(f'{part[0].upper()}.'
                  for part in name_parts if len(part) > 0))


if __name__ == "__main__":
    main()
