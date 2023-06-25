def main():
    # Prompt the user for a license plate input
    plate = input("Plate: ")
    if is_valid(plate):
        print("Valid")
    else:
        print("Invalid")


def is_valid(s):
    # Check if the license plate is valid by calling the individual checks
    return check_length(s) and check_first_two(s) and check_numbers_at_end(s) and check_no_punctuation(s)


def check_length(s):
    # Check if the length of the license plate is between 2 and 6 characters
    return 2 <= len(s) <= 6


def check_first_two(s):
    # Check if the first two characters of the license plate are alphabetic letters
    return s[:2].isalpha()


def check_numbers_at_end(s):
    # Check if numbers appear at the end of the license plate and not in the middle
    found_number = False

    for i in range(2, len(s)):
        if s[i].isnumeric() and not found_number and s[i] == '0':
            # Return False if the first number used is '0'
            return False
        if s[i].isalpha() and found_number:
            # Return False if a letter appears after a number
            return False
        if s[i].isnumeric() and not found_number:
            # Set found_number to True when the first number is encountered
            found_number = True

    return True


def check_no_punctuation(s):
    # Check if the license plate contains only alphabetic letters or digits
    return all(char.isalpha() or char.isdigit() for char in s)


main()
