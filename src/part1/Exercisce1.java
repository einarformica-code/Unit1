package part1;

import java.util.Scanner;

public class Exercisce1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos un scanner
		Scanner sc = new	Scanner(System.in);
		//Creamos una variable
		int number;
		//Ordenamos que imprima un mensaje
		
		System.out.println("Introduce a number ");
		
		number = sc.nextInt(); 
		//Programamos de forma que el resultado sea la suma de 1 a el número escrito
		System.out.println("Your number is " + number);
		sc.close();
	}

}
