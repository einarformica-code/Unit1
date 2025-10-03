package parte1;

import java.util.Scanner;

public class Exercisce12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//Creamos variable donde se almacenará la cantidad (en kg) de manzana
		
		double kgmanzana;
		//Variable donde se almacenará los beneficios de la manzana
		double beneficiomanzana;
		//Creamos variable donde se almacenará la cantidad (en kg) de pera

		double kgpera;
		//Variable donde se almacenará los beneficios de la manzana
		double beneficiopera;
		//Variable donde se almacenará el sumatorio de las otras variables
		double beneficiototal;
		//solicitamos cantidad (kg) de manzana
		System.out.println("Cuantos kilos de manzana has vendido este año");
		//kg de manzana serán lo que se escriba a continuación
		kgmanzana = scanner.nextDouble();
		//Un kg de manzana cuesta 2.35 euros
		beneficiomanzana = kgmanzana * 2.35;
		//Solicitamos kg de pera
		System.out.println("Cuantos kilos de pera has vendido este año");
		//lo que se escriba a continuación será almacenado como kilos de pera
		kgpera = scanner.nextDouble();
		//un kg de pera cuesta 1.95 euros
		beneficiopera = kgpera * 1.95;
		//El beneficio total es la suma de los dos beneficios.
		beneficiototal = beneficiopera + beneficiomanzana;
		
		System.out.println("Su beneficio total este año ha sido " + beneficiototal + " euros");
		
		

		
		
		


	}

}
