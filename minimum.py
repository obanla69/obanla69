number1 = int(input("Enter first integer: "))
number2 = int(input("Enter second integer: "))
number3 = int(input("Enter third integer: "))

minimum = number1
largest = 0

if number1 > largest:
	largest = number1

if number2 > largest:
	largest = number2
if number3 > largest:
	largest = number3

if number2 < minimum:
	minimum = number2


if number3 < minimum:
	minimum = number3


print('largest value is', largest)


print('Minimum value is', minimum)

