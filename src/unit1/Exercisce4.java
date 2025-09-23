package unit1;

import java.util.Scanner;

public class Exercisce4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos un scanner de nombre sc
		Scanner sc= new Scanner(System.in);
		//Creamos una variable "grade1" que corresponde a la primera nota que se proporcionará
		double grade1;
		//Creamos una variable "grade2" que corresponde a la segunda nota que se proporcionará
		double grade2;
		//Imprimimos el mensaje deseado
		System.out.println("Whats your first grade");
		//Su respuesta equivaldrá al valor de grade1
		grade1= sc.nextDouble();
		//Repetimos el mismo proceso con la segunda
		System.out.println("Whats your second grade");
		grade2= sc.nextDouble();
		
		//Definimos la suma de las dos variables, las dos primeras notas.
				double gradeaddition = (grade1 + grade2);
				//La nota final corresponderá a al sumatorio de las notas entre dos.
				double finalgrade = (gradeaddition * 0.5);
		
		System.out.println("Your final grade is " + finalgrade);
		
	}

}
