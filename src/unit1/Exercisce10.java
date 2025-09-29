package unit1;

import java.util.Scanner;

public class Exercisce10 {

	public static void main(String[] args) {
		//creamos scanner
		Scanner scanner = new Scanner(System.in);
		//Introducimos numero, que será un número entero.
		int numero; 
		//Creamops booleana esPar, que podrá adoptar de valor true o false
		boolean esPar;
		//Solicitamos a usuario número
		System.out.println("Introduzca numero");
		//número será el numero entero que escriba el usuario en la consola a continuación
		numero = scanner.nextInt();
		//esPar será verdadero si el resto de la división entre dos es 0, y falso si es cualquier otro valor
		esPar = numero%2 == 0;
		//Imprimimos el resultado de esPar acompañado de texto
		System.out.println("Su numero es par?" + esPar);
		
		
		

	}

}
