def main():
    userInput = input("What time is it? ")
    converted = convert(userInput)

    if 7.0 <= converted <= 8.0:
        print("Breakfast time")
    elif 12.0 <= converted <= 13.0:
        print("Lunch time")
    elif 18.0 <= converted <= 19.0:
        print("Dinner time")


def convert(time):
    hours, minutes = time.split(":")
    return float(hours) + float(minutes) / 60


if __name__ == "__main__":
    main()