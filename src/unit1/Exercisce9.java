package unit1;

import java.util.Scanner;

public class Exercisce9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos un scanner
		Scanner scanner = new Scanner(System.in);
		//Creamos una variable booleana (verdadero/falso) que posteriormente determinará la mayoria de edad
		boolean mayorQue;
		//Creamos una variable entera donde se almacenará edad
		int edad ;
		//Solicitamos la edad
		System.out.println("Introduzca su edad");
		//El valor que se introduzca será la edad
		edad = scanner.nextInt();
		//La variable mayorQue será verdadera si el número introducido anteriormente (edad) es mayor o igual a 18
		mayorQue = edad >= 18 ;
		//Imprimimos el valor de la variable mayorQue acompañada de texto
		System.out.println( "¿Mayor de edad? " + mayorQue);

	}

}
