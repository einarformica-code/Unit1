package parte2;

import java.util.Scanner;

public class Ejercicio9 {
public static void main(String[] args) {
						//Declaramos entero para el volumen
						int volumen;
						Scanner teclado = new Scanner(System.in);
						//Declaramos entero que corresponderá al número del ejercicio
	
						int ejercicio;
						boolean menorQ100;
	
						System.out.println("Diga el número dej ejercicio");
	
						ejercicio = teclado.nextInt();
						//Cada 100 capitulos son un volumen, empezando por el 100.
	
	
	
						volumen = ejercicio <=100 ? (0) : (ejercicio / 100);
	
	
	
						System.out.println("Su ejercicio se encuentra en el volumen: "  + volumen);

	}
}
