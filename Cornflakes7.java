import java.util.Scanner;

	public class Cornflakes7{

		public static void main(String[]args){

		int i = 0;
		int passMark = 0;
		int failed = 0;	
		
		
		Scanner input = new Scanner(System.in);

		for(i = 0; i <= 15; i++){
                System.out.print("Enter a student score: " );
		int student = input.nextInt();
		
		if(student >= 45){
		passMark = passMark + 1;
		}
		else{
		
		failed = failed +1;
		}
}
		System.out.printf("Total student passMark:%d%n Total student that failed:%d%n", passMark,failed);
}


}	