userInput = input("Expression: ")
x, operator, y = userInput.split(' ')

result = float(eval(x + operator + y))

print(result)

"""
userInput = input("Expression: ")
x, operator, y = userInput.split(' ')

result = match operator:
    case '+':
        float(x) + float(y)
    case '-':
        float(x) - float(y)
    case '*':
        float(x) * float(y)
    case '/':
        float(x) / float(y)
    case _:
        print("Invalid operator")

print(result)

"""