package parte1;

import java.util.Scanner;

public class Exercisce2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Creamos un scanner
		int age;
		//Creamos una variable entera que corresponderá a la edad o número que escriba el usuario
		System.out.println("Introduce your age");
		age= sc.nextInt()	+1;
		//Se le suma uno al valor escrito por el usuario para calcular su edad el próximo año
		System.out.println("Your age next year will be " + age);
		
	}

}
