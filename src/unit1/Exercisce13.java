package unit1;

import java.util.Scanner;

public class Exercisce13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean estaLloviendo;
		boolean tareasTerminadas;
		boolean irBiblioteca;
		boolean salir;
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("loviendi?");
		estaLloviendo = scanner.nextBoolean();
		
		System.out.println("tareas?");
		tareasTerminadas = scanner.nextBoolean();
		
		System.out.println("tienes que ir a la biblioteca?");
		irBiblioteca = scanner.nextBoolean();
		
		salir= (!estaLloviendo && tareasTerminadas) || irBiblioteca;
		
		System.out.println(salir);
		
				
		

	}

}
