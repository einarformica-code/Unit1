package parte2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int año; 
		int sigloTeorico;
		int sigloReal;
		System.out.println("Introduzca un año");
		año = teclado.nextInt();
		sigloTeorico = año / 100;
		sigloReal = sigloTeorico +1;
		System.out.println("Su año se encuentra en el siglo : "  + sigloReal );

	}

}
