package parte2;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Entero al que se le sumará un número para ser múltiplo de n2
		int num1;
		//Entero donde se almacenará el número que hay que sumarle a nq para ser multiplo de n2
		int numSumar;
		//Núnmero que será multiplo de n1 + numero a sumar
		int num2;
		int resto;
		System.out.println("Introduzca numero 1");
		num1 = sc.nextInt();
		System.out.println("Introduzca numero 2");
		num2=sc.nextInt();
		resto = num1 % num2;
		numSumar = num2 - resto;
		System.out.println("Para que su primer número sea múltiplo del segundo, le debe sumar al primero: +"  +numSumar);

	}

}
