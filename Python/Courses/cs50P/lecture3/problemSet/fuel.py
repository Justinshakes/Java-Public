def main():
    fraction = get_fraction()          # Get the fraction input from the user
    percentage = get_percentage(fraction)   # Calculate the percentage based on the fraction
    remaining_fuel(percentage)        # Determine the fuel status based on the percentage


def get_fraction():
    while True:
        fraction = input("Fraction: ")   # Prompt the user to enter a fraction
        try:
            x, y = map(int, fraction.split("/"))   # Split the fraction by "/" and convert the parts to integers
            result = round(eval(fraction), 2)      # Evaluate the fraction and round the result to 2 decimal places
            if 0 <= result <= 1:                   # Check if the result is between 0 and 1 (inclusive)
                return result                      # Return the result if it meets the condition
        except (NameError, ZeroDivisionError, SyntaxError, ValueError):
            pass                                  # Ignore exceptions and continue to the next iteration


def get_percentage(fraction):
    return round(float(fraction) * 100)      # Convert the fraction to a percentage and round it to the nearest integer


def remaining_fuel(percentage):
    if percentage <= 1:
        print("E")                           # If the percentage is less than or equal to 1, print "E"
    elif percentage >= 99:
        print("F")                           # If the percentage is greater than or equal to 99, print "F"
    else:
        print(f"{percentage}%", end="")      # Otherwise, print the percentage followed by "%"


main()   # Start the program execution by calling the main function
