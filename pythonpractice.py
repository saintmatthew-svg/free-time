import random

count = 0
while count < 5:
    print("hello")
    count += 1

sum = 0
numbers = 0
while numbers < 5:
    sum += numbers
    numbers += 1
print("sum of numbers is = ",sum)

number1 = random.randint(0,50)
number2 = random.randint(0,50)
answer = int(input(f"{number1} + {number2}? = "))
if number1 + number2 == answer:
    print("correct well done")
while number1 + number2 != answer:
    print("incorrect answer input the correct answer")
    answer = int(input(f"{number1} + {number2}? = "))
    if number1 + number2 == answer:
        print("correct well done")

input1 = int(input("enter a number "))
input2 = int(input("enter a number "))
expected = int(input(f"{input1} * {input2} = "))
if expected == input1 * input2:
    print("correct well done")
while expected != input1 * input2:
    print("incorect answer")
    expected = int(input(f"{input1} * {input2} = "))
    if expected == input1 * input2:
        print("correct well done")
        

