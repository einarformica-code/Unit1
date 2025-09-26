package unit1;

import java.util.Scanner;

public class Exercisce15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int IVA = 21;
		double precio;
		double precioTotal;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduzca el precio");
		precio = scanner.nextDouble();
		precioTotal = ((precio * IVA) / 100) + precio;
		System.out.println("Su precio final es " + precioTotal);
		
		scanner.close();
		

	}

}
