package parte1;

import java.util.Scanner;

public class Exercisce11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos scanner
		Scanner scanner = new Scanner(System.in);
		//Introducimos peseta de tipo doble, podrá tomar valores decimales
		double peseta ;
		//Introducimos variable doble euro.
		double euro ; 
		//Pedimos valor de "peseta"
		System.out.println("¿Cuantas pesetas tienes?");
		peseta = scanner.nextDouble();
		//por cada 166 pesetas tenemos un euro.
		euro = peseta / 166;
		System.out.println("Tienes " + euro + " euros");
		
	}

}
