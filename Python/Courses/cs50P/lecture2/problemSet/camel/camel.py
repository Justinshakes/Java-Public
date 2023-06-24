def main():
    # Prompt the user to enter a camelCase string
    camelCase = input("camelCase: ")

    # Convert the camelCase string to snake_case
    snake_case = convert_to_snake_case(camelCase)

    print(snake_case)


def convert_to_snake_case(string):
    # Initialize an empty string to store the snake_case result
    result = ""

    # Iterate over each character in the input string
    for char in string:
        # Check if the current character is uppercase
        if char.isupper():
            # If the character is uppercase, add an underscore before it and convert it to lowercase
            result += "_" + char.lower()
        else:
            # If the character is not uppercase, simply add it to the result string
            result += char

    # Return the snake_case string
    return result


# Call the main function to start the program
main()
