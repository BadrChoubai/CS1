"""
	Program: Restaurant Bill
    Description: A program that prompts the user to enter a bill subtotal,
    and calculates the total with included taxes and tip amount.
"""


def select_tip_amount() -> float:
    tip_percentages = [
        ('No Tip', 0),
        ('10% Tip', 0.10),
        ('15% Tip', 0.15),
        ('20% Tip', 0.20),
    ]
    for i, (prompt, percentage) in enumerate(tip_percentages):
        print(f'({i})', prompt)

    selection = input('Select a tip amount: ')
    return tip_percentages[int(selection)]


def main():
    bill_amount = float(input("How much was your bill?: "))
    TAX_PERCENTAGE = 0.07
    tip_percentage = select_tip_amount()

    bill_total = bill_amount + \
        (bill_amount * tip_percentage[1]) + (bill_amount * TAX_PERCENTAGE)

    print(f'Subtotal: ${bill_amount:.2f}')
    print(f'Tip: {tip_percentage[0]}')
    print(f'Tax: {TAX_PERCENTAGE}%')
    print(f'Total w/ tax and tip: ${bill_total:.2f}')


if __name__ == "__main__":
    main()
