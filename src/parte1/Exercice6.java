package parte1;

import java.util.Scanner;

public class Exercice6 {
	public static void main(String[] args) {
		//Creamos un scanner
				Scanner sc = new Scanner(System.in);
				//Insetamos variable n1, que será el primer número que se pida
				int n1;
				//Insertamos variable n2, segundo número.
				int n2;
				
				//Pedimos al usuario que defina el primer número
				System.out.println("Introduzca el primer número ") ;
				//Permitimos que el usuario responda el primer número
				n1= sc.nextInt();	
				
				System.out.println("Introduzca el segundo número ") ;
				n2= sc.nextInt();
				//Ahora que tenemos los dos valores, podemos definir variables con operaciones de n1 y n2
				//Definimos suma.
				int suma = n1 + n2;
				//Definimos resta
				int resta = n1 - n2;
				//Definimos multiplicación
				int mult = n1 * n2;	
				//Definimos división
				int div = n1/n2;
				System.out.println("La suma de n1 y n2 equivale a :" + suma) ;
				System.out.println("La resta a n1 de n2 es igual a " + resta);
				System.out.println("La multiplicación de n1 y n2 equivale a"  +  mult);
				System.out.println("n1 entre n2 es "+ div);
				
	}
		
		
}
