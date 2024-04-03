import java.util.Scanner;

	public class Strength{

	public static void main(String[]  args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a name: ");

	String random = input.nextLine();

	int length = random.length();

	System.out.println("The length of the string: " + length);

	}


}