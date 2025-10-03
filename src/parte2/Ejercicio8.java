package parte2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		//declaramos un doble donde almacenaremos los metros.
		double  metros;
		//declaramos un doble donse se almacenarán los cm con decimales
		double  cmDecimales;
		//declaramos ENTERO que será resultado de convertir un doble en un entero.
		int cmEnteros;
		System.out.println("Diga la cantidad en metros, con tantos decimales como usted desee");
		metros = teclado.nextDouble();
		//un metro tiene 100 cm
		cmDecimales= metros * 100;
		//Convertimos de doble a entero
		cmEnteros = (int) (cmDecimales);
		System.out.println("Su distancia en cm es " + cmEnteros  + " centímetros");
		teclado.close();
		

	}

}
