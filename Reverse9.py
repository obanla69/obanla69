allCounter = 1;
multiple1 = 4;
totalCount = 1;
multiple2 = 8;
sumCounter= 0;
sumCount = 0;
sumTotal = 0;
squareofsum = 0



for number in range(5):

	allCounter = allCounter * multiple1
	sumCounter = sumCounter + allCounter

for number2 in range(5):
	
	totalCount = totalCount * multiple2;
	sumCount = sumCount + totalCount
sumTotal = sumCounter + sumCount
squareofsum = sumTotal * sumTotal
print(squareofsum, end= ' ')		
			
			

