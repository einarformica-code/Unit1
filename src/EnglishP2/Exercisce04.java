package EnglishP2;

import java.util.Scanner;

public class Exercisce04 {
			public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			
			//We will create two double type variable to store the value of kilograms and pounds
			double kg;
			double pound;
			
			//Ask user for value of pounds
			System.out.println("Introduce a weight in pounds");
			pound = keyboard.nextDouble();
			//1 kg equals 2.2 pounds; 1/
			kg = pound / 2.2;
			//display of the answer 
			System.out.println(pound + " pounds equal " + kg + " kg"  );
			
			}
}
