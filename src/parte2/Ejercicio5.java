package parte2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Dintroducimos los segundos inicales
		int segundo0;
		//Introducimos variable entera que representa los segundos que van a quedar
		int segundo;
		//introducimos variable para almacenar los minutos
		int minutos;
		//introducimos variable para almacenar las horas
		int horas;
		System.out.println("Introduzca una cantidad  desegundos");
		segundo0 = sc.nextInt();
		//esta expresión representa la definicón de minuto
		minutos = segundo0 / 60;
		//el resto de la división anterior define los segundos que quedaron tras la conversion a minutos
		segundo = segundo0 % 60;
		//esta expresión representa el cambio de minujtos a horas
		horas = minutos / 60;
		//el resto de la división anterior son los minutos que sobran
		minutos = minutos % 60;
		
		
		
		
		System.out.println(horas + "horas");
		System.out.println(minutos + "minutos");
		System.out.println(segundo + "segundos");
		


	}

}
