import java.util.Scanner;
   public class Kata{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
	Kata kata = new Kata();
	
        System.out.println("even number");
	kata.isEven();
	System.out.println();
	
	System.out.println("prime number");
	kata.isPrimeNumber();
	System.out.println();
	
	System.out.println(" positive difference");
	Kata.subtractNumber();
	System.out.println();

	System.out.println("quotient");
	Kata.divideNumber();
	System.out.println();

	System.out.println("factor");
	Kata.factorNumber();
	System.out.println();
	
	System.out.println("square");
	Kata.isSquareNumber();
	System.out.println();
	}

	public static boolean isEven(){
	
	System.out.print("Enter a number ");
	int number = input.nextInt();

		if (number % 2 == 0){
		System.out.println(number + " is an even number");
	 	return true;
		}
		else{
		System.out.println(number + " is not an even number");
		return false;
		}
	}
		

	
      public static boolean isPrimeNumber(){
	System.out.print("Enter a number ");
	int number = input.nextInt();

         int counter = 0;
         for(int count = 1; count <= number; count++){
           if(number % count == 0) counter++; 
     	}
           if(counter == 2) {
		System.out.println(number + " is a prime number");
		return true;
	}else {
		System.out.println(number + " is not a prime number");
		return false;
	}
     }


	public static int subtractNumber(){
	System.out.print("Enter a number ");
	int numOne = input.nextInt();
	System.out.print("Enter another number ");
	int numTwo = input.nextInt();
	int difference = 0;
	if(numOne == numTwo){
	difference = 0;
	}
	else if(numOne > numTwo){
	difference = numOne - numTwo;
	}
	else if(numOne < numTwo){

	difference = numTwo - numOne;
	}
	System.out.println("Difference = "+ difference);
	return difference; 
         } 

     

	public static float divideNumber(){
	System.out.println("Enter a number ");
	int numOne = input.nextInt();
	System.out.print("Enter another number ");
	int numTwo = input.nextInt();
	float quotient = 0;
	if(numTwo == 0){
		System.out.printf("quotient = %.2f%n", quotient);
	}else{
		 quotient = numOne / numTwo;
		System.out.printf("quotient = %.2f%n", quotient );
			
	}

 	return quotient;
	}
	public static int factorNumbe(){
	System.out.println("Enter a number");
	int number = input.nextInt();
	int factor = 0;
        int counter =1;
        while(counter <= number){
        if(number % counter == 0) {
        factor++;
        }
        counter++;
        }
    System.out.println("factor = "+ factor);
    return factor;
}
	public static boolean isSquareNumberCheck(){
	System.out.println("Enter a number");
	int number = input.nextInt();
	if (number < 0){
	return false;
	}
	int sqrt = 0;
	while(sqrt * sqrt <= number){
	   if(sqrt * sqrt == number){
	System.out.println(number + "is a square");
		return true;
	    }
	    sqrt++;
	}
	System.out.println(number + "is not a square");
	   return false;
	
	}



















     }