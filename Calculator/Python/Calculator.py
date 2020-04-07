import sys


class Calculator():
    total_solved_count = 0
    addition_solve_counter = 0
    subtraction_solve_counter = 0
    multiplication_solve_counter = 0
    division_solve_counter = 0
    modulo_solver_counter = 0

    @classmethod
    def print_intro(cls):
        print(f'''
        Welcome to CalcPy a Python Calculator program.
        This program will enable users to solve basic maths problems.
        ''')

    @classmethod
    def print_results(cls):
        pass

    @classmethod
    def run(cls):
        operation_choice = ""
        operation_choices = ["addition", "subtraction",
                             "multiplication", "division", "modulo"]
        while True:
            print("What operation would you like to perform? ")
            for i, choice in enumerate(operation_choices):
                print(f'({i+1}) {choice}')

            print('(0) exit program')
            operation_choice = input('operation choice: ')

            if operation_choice == '0':
                sys.exit()
            elif int(operation_choice) > 5:
                print('Please double check your selection.')
            else:
                operation_choice = operation_choices[int(operation_choice) - 1]
                print(operation_choice)


calculator = Calculator()
calculator.print_intro()
calculator.run()
calculator.print_results()
