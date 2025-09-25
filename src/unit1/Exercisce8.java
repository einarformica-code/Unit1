package unit1;

import java.util.Scanner;

public class Exercisce8 {

	public static void main(String[] args) {
		//  “Hola Juanito, tienes 21 años, ¡qué mayor eres!”. 
		Scanner scanner= new Scanner(System.in);
		String Nombre;
		String Edad;
		System.out.println("Cómo te llamas");
		Nombre = scanner.nextLine();
		System.out.println("Cúantos años tienes");
		Edad = scanner.nextLine();
		System.out.println("Hola " + Nombre + ", tienes" + Edad + " años, ¡que mayor eres!" );
	
		
		
	}

}
