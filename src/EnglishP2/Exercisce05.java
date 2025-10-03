package EnglishP2;

import java.util.Scanner;

public class Exercisce05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		int weight;
		double height;
		double bmi;
		int nonDecimalBMI;
		
		System.out.println("Introduce your weight in kilograms");
		weight = keyboard.nextInt();
		
		System.out.println("Introduce your height in meters");
		height = keyboard.nextDouble();
		bmi = weight / Math.pow(height, 2);
		nonDecimalBMI = (int) (bmi);
		
		System.out.println("Your current BMI is: " + nonDecimalBMI);
		
		

	}

}
