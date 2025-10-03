package parte2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		//Declaramos entero para el año actual
		int año; 
		//entero que dividirá el año entre 100
		int sigloTeorico;
		//entero que almacenará el siglo real en el que se encuentra el año
		int sigloReal;
		System.out.println("Introduzca un año");
		año = teclado.nextInt();
		sigloTeorico = año / 100;
		//El siglo en el que se encuentra ese año será el año entre 100 +1.
		sigloReal = sigloTeorico +1;
		System.out.println("Su año se encuentra en el siglo : "  + sigloReal );

	}

}
