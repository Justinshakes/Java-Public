def main():
    amount_due = 50
    while amount_due > 0:
        print("Amount Due:", amount_due)
        amount_due -= get_change(amount_due)
    print("Change Owed:", abs(amount_due))


def get_change(amount_due):
    while True:
        n = int(input("Insert Coin: "))
        if n == 5 or n == 10 or n == 25:
            return n
        else:
            print("Amount Due:", amount_due)


main()
