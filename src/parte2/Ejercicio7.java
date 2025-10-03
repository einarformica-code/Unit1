package parte2;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//definimos dos constantes que se iicializarán después.
		final double entradaNiño;
		final double entradaAdulto;
		//definimos un doble donde incluiremos el precio antes del descuento
		double precioInical;
		//definimos un doble que utilizaremos como expresión para determinar si se reaiza el descuento o no.
		double mas100;
		//doble que almacenará el precio final.
		double precioFinal;
		System.out.println("Cuantas entradas de niño quieres");
		entradaNiño = sc.nextDouble();
		System.out.println("Cuantas entradas de adulto?");
		entradaAdulto = sc.nextDouble();
		//la entrada de niños son 15,50 eur y la de adultos 20
		precioInical = entradaNiño * 15.50 + entradaAdulto * 20;
		//si el precio incial SUPERA 100: le restamos un 5%, si el precio inicial NO lo supera, se mantiene el valor inicial.
		mas100 = precioInical >= 100 ? (precioInical -(precioInical * 0.05)) : (precioInical);
		System.out.println(precioInical);
		
	}

}
