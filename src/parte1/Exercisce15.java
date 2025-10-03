package parte1;

import java.util.Scanner;

public class Exercisce15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos una constante de tipo entero donde se almacenará el iva, igual a 21.
		final int IVA = 21;
		//creamos un doble que almacene el valor del precio en dicimales
		double precio;
		//creamos un doble que almacenará el precio total
		double precioTotal;
		//Creamos un scanner
		Scanner scanner = new Scanner(System.in);
		//pedimos precio
		System.out.println("Introduzca el precio");
		precio = scanner.nextDouble();
		//El precio total será el iva del precio inicial (precio por iva entre 100) mas el precio inical
		precioTotal = ((precio * IVA) / 100) + precio;
		System.out.println("Su precio final es " + precioTotal);
		
		scanner.close();
		

	}

}
