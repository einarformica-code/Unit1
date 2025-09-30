package part1;

import java.util.Scanner;

public class Exercisce3 {

	public static void main(String[] args) {
		// Creamos un scanner de nombre sc
		Scanner sc= new Scanner(System.in);
		int year;
		//Definimos variable year, valor que será proporcionado por usuario (año actual)
		int birth;
		//Definimos variable birth, valor que será proporcionado por usuario (año de nacmiento)
		int age;
		//Definimos age, que será calculado en base a los datos proporcionados por el usuario.
		
		System.out.println("What year is it currently?");
		year = sc.nextInt();
		//El valor de year será definido por el valor que escriba el usuario
		
		System.out.println("What year were you born");
		birth = sc.nextInt();
		//El valor de birth será definido por el valor que escriba el usuario
		age = year - birth;
		//La resta del año de nacimiento al actual será age, la edad del usuario.
		System.out.println("Your are: " + age);
		System.out.print(" years old" );
		//Se imprime el resultado de age con texto adherido
		
		

	}

}
