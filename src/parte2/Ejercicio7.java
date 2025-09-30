package parte2;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double entradaNiño;
		final double entradaAdulto;
		double precioInical;
		double mas100;
		double precioFinal;
		System.out.println("Cuantas entradas de niño quieres");
		entradaNiño = sc.nextDouble();
		System.out.println("Cuantas entradas de adulto?");
		entradaAdulto = sc.nextDouble();
		precioInical = entradaNiño * 15.50 + entradaAdulto * 20;
		mas100 = precioInical >= 100 ? (precioInical -(precioInical * 0.05)) : (precioInical);
		System.out.println(precioInical);
		
	}

}
