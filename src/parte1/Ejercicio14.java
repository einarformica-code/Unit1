package parte1;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos un scanner
		Scanner teclado = new Scanner(System.in);
		//Declaramos nuestras variables de tipo enteras.
		int nota1;
		int nota2;
		int nota3;
		//Creamos una variable donde almacenaremos un entero correspondiente a una expresión que usará las variables anteriores
		int notaEntera;
		//Creamos una variable que almacenará como un doble la expresión anteriór
		double notaDecimales;
		System.out.println("Escriba nota 1");
		nota1 = teclado.nextInt();
		System.out.println("Escriba nota 2");
		nota2= teclado.nextInt();
		System.out.println("Escriba nota 3");
		nota3=teclado.nextInt();
		//Definición de media de 3
		notaEntera = (nota1 + nota2 + nota3) /3;
		System.out.println("Su nota entera es " + notaEntera);
		//Dividimos entre 3.0 para que el resultado se devuelva con decimales.
		notaDecimales = (nota1 +nota2 + nota3) /3.0;
		System.out.println("Su nota co decimales es "  + notaDecimales);
		
	}

}
