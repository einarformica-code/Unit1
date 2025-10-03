package parte2;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Declaramos las variables de tipo DOBLE 
		double mm;
		double cm;
		double m;
		
		//Declaramos una variable que almacenará el sumatorio de las 3 variables
		double metrosTotales;
		//Solictiamos los valores de las  variables
		System.out.println("Distancia en mm");
		mm = sc.nextDouble();
		
		System.out.println(" Distancia en cm");
		
		cm = sc.nextDouble();
		
		System.out.println("Distancia en m");
		
		m = sc.nextDouble();
		//Un metro son mil milímetros y a su vez 100 centímetros
		
		metrosTotales = mm / 1000 + cm /100 + m;
		System.out.println("La distancia total es de " +metrosTotales + " metros");
		
		
	}
	

}
