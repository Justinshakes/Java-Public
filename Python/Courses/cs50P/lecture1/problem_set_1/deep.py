user_input = input("What is the Answer to the Great Question of Life, the Universe, and Everything? ")

user_input = user_input.strip().casefold()

if user_input == "42" or user_input == "forty-two" or user_input == "forty two":
    print("Yes")
else:
    print("No")