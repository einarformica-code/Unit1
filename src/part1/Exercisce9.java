package part1;

import java.util.Scanner;

public class Exercisce9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean mayorQue;
		int edad ;
		System.out.println("Introduzca su edad");
		edad = scanner.nextInt();
		mayorQue = edad >= 18 ;
		System.out.println( "¿Mayor de edad? " + mayorQue);

	}

}
