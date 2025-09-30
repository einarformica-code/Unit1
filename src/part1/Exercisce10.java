package part1;

import java.util.Scanner;

public class Exercisce10 {

	public static void main(String[] args) {
		//esPar = numero%2 == 0
		Scanner scanner = new Scanner(System.in);
		int numero; 
		boolean esPar;
		System.out.println("Introduzca numero");
		numero = scanner.nextInt();
		esPar = numero%2 == 0;
		System.out.println("Su numero es par?" + esPar);
		
		
		

	}

}
