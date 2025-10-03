package parte2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos un scanner
		Scanner sc = new Scanner(System.in);
		//creamos un entero donde se almacenará el número que se solicite
		int numSolicitado;
		//creamos un entero donde se almacenará el valor del número a sumarle al introducido para ser múltiplo de 7
		int paraSer;
		//creamos una variable entera donde almacenaremos el resultado de la operación del resto
		int resto;
		//solicitamos entero
		System.out.println("Escriba un número entero");
		numSolicitado = sc.nextInt();
		//en el resultado de la variable resto será almacenado el valor de sacar el resto de dividir el entero solicitado entre 7
		resto = numSolicitado % 7;
		//Para que el número solicitado sea múltiplo de 7, le restamos a 7 el resto. Por ejemplo si estuvieramos dividiendo 7 entre 6, 7 - 6 = 1, le tendríamos que sumar 1 a 6 (7) para ser múltiplo de 7 
		paraSer = 7 - resto;
		System.out.println("Debe sumarle  " + paraSer + " a su número para ser múltiplo de 7");

	}

}
