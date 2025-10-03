package EnglishP2;

import java.util.Scanner;

public class Exercisce01 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double price;
		double tax;
		//Asking user the value of "price"
		System.out.println("Please set PRICE : " );
		price = keyboard.nextDouble();
		System.out.println("Please enter TAX : ");
		tax = keyboard.nextDouble();
		price = price * (1 + tax/100.0);
		System.out.println("Your new price is : " + price);
		
	
}
}
