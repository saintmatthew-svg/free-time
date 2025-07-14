print("input 10 scores")
number1 = int(input('Enter first score: '))
number2 = int(input('Enter second score: '))
number3 = int(input('Enter third score: '))
number4 = int(input('Enter fourth score: '))
number5 = int(input('Enter fifth score: '))
number6 = int(input('Enter six score: '))
number7 = int(input('Enter seven score: '))
number8 = int(input('Enter eighth score: '))
number9 = int(input('Enter ninth score: '))
number10 = int(input('Enter ten score: '))

sum = number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + number10

average = sum / 10

if number1 < number2 or number1 < number3 or number1 < number4 or number1 < number5 or number1 < number6 or number1 < number7 or number1 < number8 or number1 < number9 or number1 < number10:
	lowest = number1

if number2 < number1 or number2 < number3 or number2 < number4 or number2 < number5 or number2 < number6 or number2 < number7 or number2 < number8 or number2 < number9 or number2 < number10:
	lowest = number2

if number3 < number1 or number3 < number2 or number3 < number4 or number3 < number5 or number3 < number6 or number3 < number7 or number3 < number8 or number3 < number9 or number3 < number10:
	lowest = number3

if number4 < number1 or number4 < number2 or number4 < number3 or number4 < number5 or number4 < number6 or number4 < number7 or number4 < number8 or number4 < number9 or number4 < number10:
	lowest = number4

if number5 < number1 or number5 < number2 or number5 < number3 or number5 < number4 or number5 < number6 or number5 < number7 or number5 < number8 or number5 < number9 or number5 < number10:
	lowest = number5

if number6 < number1 or number6 < number2 or number6 < number3 or number6 < number4 or number6 < number5 or number6 < number7 or number6 < number8 or number6 < number9 or number6 < number10:
	lowest = number6

if number7 < number1 or number7 < number2 or number7 < number3 or number7 < number4 or number7 < number5 or number7 < number6 or number7 < number8 or number7 < number9 or number7 < number10:
	lowest = number7

if number8 < number1 or number8 < number2 or number8 < number3 or number8 < number4 or number8 < number5 or number8 < number6 or number8 < number7 or number8 < number9 or number8 < number10:
	lowest = number8

if number9 < number1 or number9 < number2 or number9 < number3 or number9 < number4 or number9 < number5 or number9 < number6 or number9 < number7 or number9 < number8 or number9 < number10:
	lowest = number9

if number10 < number1 or number10 < number2 or number10 < number3 or number10 < number4 or number10 < number5 or number10 < number6 or number10 < number7 or number10 < number8 or number10 < number9:
	lowest = number10



if number1 > number2 or number1 > number3 or number1 > number4 or number1 > number5 or number1 > number6 or number1 > number7 or number1 > number8 or number1 > number9 or number1 > number10:
	largest = number1

if number2 > number1 or number2 > number3 or number2 > number4 or number2 > number5 or number2 > number6 or number2 > number7 or number2 > number8 or number2 > number9 or number2 > number10:
	largest = number2

if number3 > number1 or number3 > number2 or number3 > number4 or number3 > number5 or number3 > number6 or number3 > number7 or number3 > number8 or number3 > number9 or number3 > number10:
	largest = number3

if number4 > number1 or number4 > number2 or number4 > number3 or number4 > number5 or number4 > number6 or number4 > number7 or number4 > number8 or number4 > number9 or number4 > number10:
	largest = number4

if number5 > number1 or number5 > number2 or number5 > number3 or number5 > number4 or number5 > number6 or number5 > number7 or number5 > number8 or number5 > number9 or number5 > number10:
	largest = number5

if number6 > number1 or number6 > number2 or number6 > number3 or number6 > number4 or number6 > number5 or number6 > number7 or number6 > number8 or number6 > number9 or number6 > number10:
	largest = number6

if number7 > number1 or number7 > number2 or number7 > number3 or number7 > number4 or number7 > number5 or number7 > number6 or number7 > number8 or number7 > number9 or number7 > number10:x
	largest = number7

if number8 > number1 or number8 > number2 or number8 > number3 or number8 > number4 or number8 > number5 or number8 > number6 or number8 > number7 or number8 > number9 or number8 > number10:
	largest = number8

if number9 > number1 or number9 > number2 or number9 > number3 or number9 > number4 or number9 > number5 or number9 > number6 or number9 > number7 or number9 > number8 or number9 > number10:
	largest = number9

if number10 > number1 or number10 > number2 or number10 > number3 or number10 > number4 or number10 > number5 or number10 > number6 or number10 > number7 or number10 > number8 or number10 > number9:
	largest = number10




print('average', average)
print('sum', sum)
print('lesser', lowest)
print('largest', largest)