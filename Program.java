import java.util.Scanner;


		public class Program{
			public static void main(String[]args){

		Scanner input = new Scanner(System.in);

			int counter = 0;

		System.out.println("Enter a display number: ");
		int display = input.nextInt();
		
		while(counter <= display){
		
		System.out.println("Enter a number either -1 or 0: ");
		int number = input.nextInt();
		
		if(number == 1){
		System.out.println(0);
		}
		if(number == 0){
		System.out.println(1);
		}

}
		counter = counter+1;

}

}