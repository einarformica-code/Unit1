package parte1;

import java.util.Scanner;

public class Exercisce7 {

	public static void main(String[] args) {
		//Creamos un scanner
		Scanner scanner = new Scanner(System.in);
		//Creamos una cadena donde se almacenará lo que el usuario introduzca como nommbre
		String Nombre;
		//Creamos una cadena donde se almacenará lo que el usuario introduzca como dirección
		String Dirección;
		//Creamos una cadena donde se almacenará lo que el usuario introduzca teléfono
		String Teléfono;
		//Le pedimos  al usuario que introduzca el nombre
		System.out.println("Introduzca su nombre");
		//Lo que el usuario diga será almacenado como "Nombre"
		Nombre = scanner.nextLine();
		//Le pedimos  al usuario que introduzca su dirección
		System.out.println("Introduzca su dirección");
		//Lo que el usuario diga será almacenado como "Nombre"
		Dirección = scanner.nextLine();
		//Peticion a usuario de teléfono
		System.out.println("Introduzca su teléfono");
		//Lo que sea escrito a continuación será almacenado como telefono
		Teléfono = scanner.nextLine();
		//Impresión consecutiva de todos los valores de las variables almacenadas
		System.out.println("Su Nombre es " + Nombre);
		System.out.println("Su Dirección es  " + Dirección);
		System.out.println("Su teléfono es " + Teléfono);
		scanner.close();

	}

}
