def convert(str):
    str = str.replace(":)", "🙂")
    str = str.replace(":(", "🙁")
    return str

def main():
    str_input = input("Enter String: ")
    result = convert(str_input)
    print(result)

main()
