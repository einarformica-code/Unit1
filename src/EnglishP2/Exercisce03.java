package EnglishP2;

import java.util.Scanner;

public class Exercisce03 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//These variables will get their value from the users input
		double length;
		double height;
		//The values of these variables will be determined by arythmetic operations done on the previous variables
		double perimeter;
		double area;
		System.out.println("Please introduce LENGTH" );
		length = keyboard.nextDouble();
		System.out.println("Please introduce HEIGHT" );
		height = keyboard.nextDouble();
		perimeter = 2 * length + 2 * height;
		area = length * height;
		System.out.println("Your area is " + area);
		System.out.println("Your perimeter is " + perimeter);
		

		
	}

}
