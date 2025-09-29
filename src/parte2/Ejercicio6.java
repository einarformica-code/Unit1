package parte2;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double mm;
		double cm;
		double m;
		int suma ;
		double metrosTotales;
		System.out.println("Distancia en mm");
		mm = sc.nextDouble();
		
		System.out.println(" Distancia en cm");
		
		cm = sc.nextDouble();
		
		System.out.println("Distancia en m");
		
		m = sc.nextDouble();
		
		metrosTotales = mm / 1000 + cm /100 + m;
		System.out.println("La distancia total es de " +metrosTotales + " metros");
		
		
	}
	

}
