package parte1;

import java.util.Scanner;

public class Exercisce8 {

	public static void main(String[] args) {
		
	//  “Hola Juanito, tienes 21 años, ¡qué mayor eres!”. 
			//Declaramos un scanner
			Scanner scanner= new Scanner(System.in);
			
			//Declaramos una variable de tipo cadena donde almacenaremos el nombre
			
			String Nombre;
			
			//Declaramos una cadena donde almacenaremos la edad
			
			String Edad;
			
			//Pedimos nombre a usuario
			
			System.out.println("Cómo te llamas");
			
			//Nombre tomará el valor que se escriba en la consola posterior al mensaje
			Nombre = scanner.nextLine();
			
			//Pedimos edad al usuario
			
			System.out.println("Cúantos años tienes");
			//Edad tomará el valor que se escriba a continuación
			
			Edad = scanner.nextLine();
			
			//Imprimimos las variables asignadas acompañados de texto
			
			System.out.println("Hola " + Nombre + ", tienes " + Edad + " años, ¡que mayor eres!" );
		
		
	}

}
