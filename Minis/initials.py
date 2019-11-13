"""

	Program: Initials;
	Author: Badr Choubai;
	Date: 2019-08-30;
    Description: A program that takes a user's full first, middle (if they have one) and, last name. It will return the user's initials;

    Input: User's full name;
    Output: User's initials;

"""


def get_name_input(name_part: str) -> str:
	name_part = input(str(f"What is your {name_part} name?: "))
	return name_part


def make_initials(full_name: list) -> str:
	for i, name_part in enumerate(full_name):
		name_part = name_part.strip()
		if (name_part):
			full_name[i] = name_part[:1] + '.'
		
	return full_name

def main():
	first_name = get_name_input("first")
	middle_name = get_name_input("middle")
	last_name = get_name_input("last")

	full_name = [first_name, middle_name, last_name]
	initials = ''.join(make_initials(full_name))
	print(initials)

main()
