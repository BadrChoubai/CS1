"""

    Program: Initials 
    Description: A program that takes a user's full first, middle (if they have one) and, last name. It will return the user's initials.
    Input: User's full name 
    Output: User's initials 

"""


def get_user_input(prompts: list) -> list:
    prompt_answers: list = []

    for prompt_message in prompts:
        answer = input(f"{ prompt_message }: ")
        prompt_answers.append(answer.strip())

    return prompt_answers


def main():
    prompts: list = ["What is your first name?",
                     "What is your middle name?", "What is your last name?"]

    [first_name, middle_name, last_name] = get_user_input(prompts)

    print(f"{ last_name.title() }, { first_name.title() } { middle_name or  '' }")
    print(
        f"{ first_name[0].upper() }{ middle_name[0].upper() if middle_name else '' }{ last_name[0].upper() }")


if __name__ == "__main__":
    main()
