package parte2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numSolicitado;
		int paraSer;
		int resto;
		System.out.println("Escriba un número entero");
		numSolicitado = sc.nextInt();
		resto = numSolicitado % 7;
		paraSer = 7 - resto;
		System.out.println("Debe sumarle  " + paraSer);

	}

}
