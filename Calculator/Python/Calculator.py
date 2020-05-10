import sys


class Calculator():
    counters = {
        'addition': 0,
        'subtraction': 0,
        'multiplication': 0,
        'division': 0,
        'modulo': 0,
    }

    @staticmethod
    def print_intro():
        print(f'''
        Welcome to CalcPy a Python Calculator program.
        This program will enable users to solve basic maths problems.
        ''')

    def print_results(self):
        print('Calculator Program Stats:\n')
        total_solved_count = sum(self.counters.values())
        for operation in self.counters.keys():
            print(
                f'{operation.title()} problems solved: {self.counters[operation]}')

        print('Total problems solved: ', total_solved_count)

    @staticmethod
    def solve(operation: str, x: int, y: int) -> int:
        return {
            'ADDITION': (lambda x, y: x + y),
            'SUBTRACTION': (lambda x, y: x - y),
            'MULTIPLICATION': (lambda x, y: x * y),
            'DIVISION': (lambda x, y: x / y),
            'MODULO': (lambda x, y: x % y),
        }[operation.upper()](x, y)

    def run(self):
        operation_choice = ""
        operation_choices = ["addition", "subtraction",
                             "multiplication", "division", "modulo"]
        operand_one, operand_two = None, None

        using = True
        while using:
            print("What operation would you like to perform? ")
            for i, choice in enumerate(operation_choices):
                print(f'({i+1}) {choice}')

            print('(0) exit program')
            operation_choice = input('operation choice: ')

            if operation_choice == '0':
                using = False
            elif int(operation_choice) > 5:
                print('Please double check your selection.')
            else:
                operation_choice = operation_choices[int(operation_choice) - 1]
                print(f'You chose: {operation_choice}')

                operand_one = int(input('Give me a number: '))
                operand_two = int(input('Give me another number: '))

                result = self.solve(
                    operation_choice, operand_one, operand_two)
                self.counters[operation_choice] += 1
                print(
                    f'The {operation_choice} result of {operand_one} and {operand_two} is {result}\n')


calculator = Calculator()

calculator.print_intro()
calculator.run()
calculator.print_results()
