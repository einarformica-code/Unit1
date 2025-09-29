package unit1;

import java.util.Scanner;

public class Exercisce14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos un scanner de nombre scanner para permtir a usuario escribir por consola
		Scanner scanner = new Scanner(System.in);
		//Creamos una variable de tipo entera para la primera nota
		int nota1;
		//Creamos una variable de tipo entera para la segunda nota
		int nota2;
		//Creamos una variable de tipo entera para la tercera  nota
		int nota3;
		//Creamos una variable de tipo entera para el boletín de calificaciones
		int notaBole;
		//creamos un double donde almacenaremos las calificaciones con decimales
		double notaExp;
		//Le pedimos al usuario la primera nota
		System.out.println("Introduzca primera calificación");
		//La respuesta será nota 1, next int porque será un valor entero.
		nota1 = scanner.nextInt();
		//Le pedimos al usuario la segunda  nota
		System.out.println("Introduzca segunda calificación");
		//La respuesta será n2
		nota2= scanner.nextInt();
		//Pedimos tercera nota
		System.out.println("Introduczca su tercera calificación");
		nota3 = scanner.nextInt();
		//Con los 3 valores podemos realizar las operaciones necesarias. La nota del boletín será un número entero;
		notaBole = (nota1 + nota2 + nota3) / 3;
		//Empleamos la misma fórmula para la nota del expediente pero dividimos entre 3.0 para que actue como un numero real y no un entero
		notaExp = (nota1 + nota2 + nota3) / 3.0;
		System.out.println("La nota que aparecerá en su boletín será " + notaBole );
		System.out.println("La nota que aparecerá en su expediente será" + notaExp);
	
		
	

	}

}
