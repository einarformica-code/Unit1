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
		//Entero que guardará el resto de dividir num1 entre num 2
		int resto;
		System.out.println("Introduzca numero 1");
		num1 = sc.nextInt();
		System.out.println("Introduzca numero 2");
		num2=sc.nextInt();
		//esta expresion calcula el resto resultante de división de num1 entr num2
		resto = num1 % num2;
		//el numero que hay que sumarle a n1 para ser divisible  (múltiplo de) de n2 será num2 menos el resto de num1 entre num2;
		numSumar = num2 - resto;
		System.out.println("Para que su primer número sea múltiplo del segundo, le debe sumar al primero: +"  +numSumar);

	}

}
