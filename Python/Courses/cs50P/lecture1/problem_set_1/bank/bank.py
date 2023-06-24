def main():
    string = input("Greating: ")
    print(greetings(string.lower()))

def greetings(string):
    if "hello" in string:
        return "$0"
    elif string.startswith('h'):
        return "$20"
    else:
        return "$100"

main()