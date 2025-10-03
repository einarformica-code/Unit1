package parte2;

import java.util.Scanner;

public class Ejercicio9 {
public static void main(String[] args) {
						int volumen;
						Scanner teclado = new Scanner(System.in);
	
						int ejercicio;
						boolean menorQ100;
	
						System.out.println("Diga el número dej ejercicio");
	
						ejercicio = teclado.nextInt();
	
	
	
						volumen = ejercicio <=100 ? (0) : (ejercicio / 100);
	
	
	
						System.out.println("Su ejercicio se encuentra en el volumen: "  + volumen);

	}
}
