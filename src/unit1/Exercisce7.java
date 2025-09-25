package unit1;

import java.util.Scanner;

public class Exercisce7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String Nombre;
		String Dirección;
		String Teléfono;
		System.out.println("Introduzca su nombre");
		Nombre = scanner.nextLine();
		System.out.println("Introduzca su dirección");
		Dirección = scanner.nextLine();
		System.out.println("Introduzca su teléfono");
		Teléfono = scanner.nextLine();
		System.out.println("Su Nombre es " + Nombre);
		System.out.println("Su Dirección es  " + Dirección);
		System.out.println("Su teléfono es " + Teléfono);
		scanner.close();

	}

}
