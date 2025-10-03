package EnglishP2;

import java.util.Scanner;

public class Exercice06 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int student;
		int groupSize;
		int studentsLeft;
		int groupsFormed;
		
		System.out.println("Introduce how many students there are");
		student = keyboard.nextInt();
		
		System.out.println("Introduce group size");
		groupSize = keyboard.nextInt();
		
		groupsFormed = student / groupSize;
		
		studentsLeft = student % groupSize;
		
		System.out.println("You can make " + groupsFormed  + "groups of " +groupSize+ " students and there will be " + studentsLeft + " students left without a group" );
		
		
		

	}

}
