package part1;

import java.util.Scanner;

public class Exercisce12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		double kgmanzana;
		double beneficiomanzana;
		double kgpera;
		double beneficiopera;
		double beneficiototal;
		System.out.println("Cuantos kilos de manzana has vendido este año");
		kgmanzana = scanner.nextDouble();
		beneficiomanzana = kgmanzana * 2.35;
		
		System.out.println("Cuantos kilos de pera has vendido este año");
		kgpera = scanner.nextDouble();
		beneficiopera = kgpera * 1.95;
		beneficiototal = beneficiopera + beneficiomanzana;
		
		System.out.println("Su beneficio total este año ha sido " + beneficiototal + " euros");
		
		

		
		
		


	}

}
