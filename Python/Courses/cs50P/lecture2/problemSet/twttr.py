def main():
    # Prompt the user for input and store it in user_string variable
    user_string = input("Input: ")

    # Define a list of vowels (both uppercase and lowercase)
    vowels = ['A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u']

    # Initialize an empty string to store the modified result
    result_string = ''

    # Iterate over each character in the user's input string
    for char in user_string:
        # Check if the character is not in the list of vowels
        if char not in vowels:
            # Append the character to the result_string
            result_string += char

    # Print the modified string without the vowels
    print(result_string)


# Call the main function to start the program
main()
