package unit1;

import java.util.Scanner;

public class Exercisce7 {

	public static void main(String[] args) {
		//Definimos un scanner después de importarlo
		Scanner scanner = new Scanner(System.in);
		//Creamos una variable de tipo string donde almacenaremos el nombre
		String Nombre;
		//Creamos una variable de tipo string donde almacenaremos la dirección
		String Dirección;
		//Creamos una variable de tipo string donde almacenaremos el teléfono
		String Teléfono;
		//Imprimimos texto que solicita el nombre
		System.out.println("Introduzca su nombre");
		//El nombre adoptará el valor que se escriba posterior a este mensaje
		Nombre = scanner.nextLine();
		//Imprimimos texto que solicita la dirección
		System.out.println("Introduzca su dirección");
		//Dirección adoptará el valor que se escriba posterior a este mensaje
		Dirección = scanner.nextLine();
		//Imprimimos texto que solicita el teléfono
		System.out.println("Introduzca su teléfono");
		//Teléfono adoptará el valor que se escriba posterior a este mensaje
		Teléfono = scanner.nextLine();
		//Imprimimos las variables acompañadas de texto
		System.out.println("Su Nombre es " + Nombre);
		System.out.println("Su Dirección es  " + Dirección);
		System.out.println("Su teléfono es " + Teléfono);
		scanner.close();

	}

}
