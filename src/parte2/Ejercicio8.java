package parte2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double  metros;
		double  cmDecimales;
		int cmEnteros;
		System.out.println("Diga la cantidad en metros, con tantos decimales como usted desee");
		metros = teclado.nextDouble();
		cmDecimales= metros * 100;
		cmEnteros = (int) (cmDecimales);
		System.out.println("Su distancia en cm es " + cmEnteros  + " centímetros");
		teclado.close();
		

	}

}
