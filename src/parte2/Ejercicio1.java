package parte2;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		//creamos scanner
		Scanner teclado = new Scanner(System.in);
		//creamos un doble que almacenará números decimales
		double numDeci;
		//creamos un entero donde se almacenará el decimal redondeado
		int entero;
		//pedimos un número decimal
		System.out.println("Escriba un número con decimales");
		//el proximo doble que se escriba será guardado en nuestro doble
		numDeci = teclado.nextDouble();
		//Convertimos nuestro decimal a su entero próximo;
		entero = (int) (numDeci);
		
		System.out.println("El número entero más proximo al numero introducido es = " + entero);
	}

}
