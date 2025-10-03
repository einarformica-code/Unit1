package EnglishP2;

import java.util.Scanner;

public class Exercisce02 {
 public static void main(String[] args) {
	 Scanner keyboard = new Scanner(System.in);
	 //We will ask the users current age.
	 int age;
	 //Declaration of a variable we will use to store the year the user was born;
	 int yearBorn;
	 System.out.println("Please introduce your age");
	 age = keyboard.nextInt();
	 //Assuming the program will run in 2025, the difference between 2025 and the users age will be the year he was born.
	 yearBorn = 2025 - age;
	 System.out.println(" You were born year : " + yearBorn);
	 
}
}
