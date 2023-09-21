package javastart1;

import java.util.Scanner;

public class JavaCalculator {

	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);
		
		// Dandelionnss Kim.Tehyung //
		// Calculator // 
		
		System.out.print("Enter The First Number  : ");
		double Num1 = user.nextDouble();
		
		System.out.print("Enter The Second Number : ");
		double Num2 = user.nextDouble();
		
		// Choose An Operation //
		double Results;
		
		System.out.println("\n CHOOSE AN OPERATION");
		System.out.println("1. Multiplication ");
		System.out.println("2. Addition ");
		System.out.println("3. Subtraction ");
		System.out.println("4. Division ");
		
		System.out.print("\nEnter the Operation: ");
		int Operation = user.nextInt();
		
		switch (Operation) {
				
		case 1: 
			Results = Num1 * Num2;
			System.out.print("\nThe Results is: " + Results);
			break;
		case 2: 
			Results = Num1 + Num2;
			System.out.print("\nThe Results is: " + Results);
			break;
		
		case 3: 
			Results = Num1 - Num2;
			System.out.print("\nThe Results is: " + Results);
			break;
		
		case 4: 
			Results = Num1 / Num2;
			System.out.print("\nThe Results is: " + Results);
			break;
			
			default:
				System.out.println("You Entered A wrong Operation!");
				break;
		
		
		}

	}

}
