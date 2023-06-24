def main():
    name = input("What's your name? ")
    hello(name)


# Defualt value = "world"
def hello(to="world"):
    print("Hello,", to)

main()