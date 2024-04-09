import java.util.Scanner;

	public class FinalDiscount {

	public static void main(String[]  args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter price: ");
	
	double price = input.nextInt();

	System.out.print("Enter discount percentage: ");

	double discount = input.nextInt();

	double discountPrice = (price * discount )/100;

	double finalPrice = price - discountPrice;

	System.out.println("The final price after discount is: " + finalPrice);

	





	}



}