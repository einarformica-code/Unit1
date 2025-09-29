package parte2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int segundo0;
		int segundo;
		int minutos;
		int horas;
		System.out.println("Introduzca una cantidad  desegundos");
		segundo0 = sc.nextInt();
		minutos = segundo0 / 60;
		segundo = segundo0 % 60;
		horas = minutos / 60;
		minutos = minutos % 60;
		
		
		
		
		System.out.println(horas + "horas");
		System.out.println(minutos + "minutos");
		System.out.println(segundo + "segundos");
		System.out.println(121%60);


	}

}
