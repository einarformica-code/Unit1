package parte2;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//definimos todos los enteros que serán usados en la fórmula
		int y;
		int a;
		int b;
		int c;
		int x;
		//Solicitamos las variables
		System.out.println("Introduzca a");
		a = sc.nextInt();
		System.out.println("Introduzca b");
		b = sc.nextInt();
		System.out.println("Introduzca c");
		c = sc.nextInt();
		System.out.println("Introduzca x");
		x = sc.nextInt();
		//Math.pow funciona con dobles, así que tenemos que transformar la expresión en un entero de vuelta
		y = (int) (a * Math.pow(x,2) + b * x + c) ;
		 
		System.out.println("El valor de y para y = a * (x)^2 + b * x + c es: " + y);

	}

}
