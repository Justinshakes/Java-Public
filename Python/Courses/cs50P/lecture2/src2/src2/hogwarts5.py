# Demonstrates iterating over a list of dict objects

students = [
    {"name": "Hermione", "house": "Gryffindor", "patronus": "Otter"},
    {"name": "Harry", "house": "Gryffindor", "patronus": "Stag"},
    {"name": "Ron", "house": "Gryffindor", "patronus": "Jack Russell terrier"},
    {"name": "Draco", "house": "Slytherin", "patronus": None},
]

for student in students:
    print( student + 1, student["name"], student["house"], student["patronus"], sep=", ")


    #   for i, student in enumerate(students, start=1):
    #   print(i, student["name"], student["house"], student["patronus"], sep=", ")
