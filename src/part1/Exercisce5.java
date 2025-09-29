package part1;

import java.util.Scanner;

public class Exercisce5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos un scanner de nombre sc
		Scanner sc = new Scanner(System.in);
		//Introducimos la variable que corresponderá al radio
		double ratius;
		//Introducimos la variable que corresponderá a la longitud
		
		double length;
		//Introducimos el área
		double area;
		//Imprimimos el mensaje deseado
		System.out.println("Introduce a ratious value");
		//La respuesta a ese mensaje equivaldrá al valor de nuestro radio
		ratius= sc.nextDouble();
		//El largo de un circulo es 2*(Pi)*radio
		length= 2 * Math.PI * ratius;
		//El área de un círculo es 2*(Pi)^2
		area = Math.PI * Math.pow(ratius, 2)	;
		System.out.println("Your lenght value is:" + length  );
		System.out.println("Your area value is:" + area  );
		
	
	}	
	
}
