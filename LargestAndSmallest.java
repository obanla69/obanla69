import java.util.Scanner;


	public class LargestAndSmallest{

		public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("How many time do you want to input your numbers: ");
int time = input.nextInt();
System.out.println("Enter number: ");
int number = input.nextInt();
int smallest = number;
int largest = 0;
time = time- 1;
	for(int count = 0; count <= time; count++){
	System.out.println("Enter number: ");
	number = input.nextInt(); 
		if(number > largest){
			largest = number;
		}  
		if(number < smallest){
			smallest = number;	
		}
	}
	System.out.println("The largest is "+ largest);

	System.out.println("The smallest is "+ smallest);




}
}