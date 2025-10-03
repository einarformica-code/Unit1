package parte1;

import java.util.Scanner;

public class Exercisce13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variable booleana que almacenará si es verdad o no que está lloviendo
		boolean estaLloviendo;
		//Variable booleana que almacenará si es verdad o no que se han terminado las tareas

		boolean tareasTerminadas;
		//Variable booleana que almacenará si es verdad o no que hay que ir a la biblioteca

		boolean irBiblioteca;
		//Variable booleana que almacenará si es verdad o no que se puede salir

		boolean salir;
		//creamos un scanner
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("loviendo?");
		//Se almacenará el valor de estaLLoviendo
		estaLloviendo = scanner.nextBoolean();
		
		System.out.println("tareas?");
		//Se almacenará el valor de tareas terminadas
		tareasTerminadas = scanner.nextBoolean();
		
		System.out.println("tienes que ir a la biblioteca?");
		//Se almacenaá el valor de si se tiene que ir a la bilioteca
		irBiblioteca = scanner.nextBoolean();
		//Salir será verdadero si es verdad tanto que NO está lloviendo Y las tareas están terminadas O si hay que ir a la biblioteca
		salir= (!estaLloviendo && tareasTerminadas) || irBiblioteca;
		
		System.out.println(salir);
		
				
		

	}

}
