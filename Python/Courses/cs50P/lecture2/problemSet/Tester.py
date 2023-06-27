def main():
    user_string = input("Input: ")

    vowels = ['A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u']

    result_string = ''

    for char in user_string:
        if char not in vowels:
            result_string += char

    print(result_string)


main()
