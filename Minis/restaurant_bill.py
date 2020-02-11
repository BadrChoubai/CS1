"""

	Program: Restaurant Bill
    Description: A program that asks a user for their bill total and a tip amount, returns the billTotal calculated with tax and decided tip amout.
    Input: billTotal, tipAmount
    Output: billTotal calculated with tax (7%) and selected tip amount (0 || 0.10 || 0.15 || 0.20)
    
"""


def calculate_bill_total(bill_total: float, tax_percentage: float, tip_percentage: float) -> float:
    return bill_total + (bill_total * tip_percentage) + (bill_total * tax_percentage)


def get_bill_total() -> float:
    bill_total = input("\tHow much was your total bill? ")
    return float(bill_total)


def select_tip_amount() -> float:
    tip_amount_selection = input("""
	How much would you like to tip?
	(0) No Tip
	(1) 10% Tip
	(2) 15% Tip
	(3) 20% Tip

	Tip amount: """)

    tip_amounts = [0, 0.10, 0.15, 0.20]
    return {
        '0': tip_amounts[0],
        '1': tip_amounts[1],
        '2': tip_amounts[2],
        '3': tip_amounts[3],
    }[tip_amount_selection]


def main():
    bill_amount = get_bill_total()
    TAX_PERCENTAGE = 0.07
    tip_percentage = select_tip_amount()

    bill_total = calculate_bill_total(
        bill_amount, TAX_PERCENTAGE, tip_percentage)

    print(f"""
	Subtotal: ${bill_amount:.2f}
	Tax: { TAX_PERCENTAGE }%
	Total after theft (read: taxation): ${bill_total:.2f}
	""")


if __name__ == "__main__":
    main()
