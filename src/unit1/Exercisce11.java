package unit1;

import java.util.Scanner;

public class Exercisce11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double peseta ;
		double euro ; 
		System.out.println("¿Cuantas pesetas tienes?");
		peseta = scanner.nextDouble();
		euro = peseta / 166;
		System.out.println("Tienes " + euro + " euros");
		
	}

}
