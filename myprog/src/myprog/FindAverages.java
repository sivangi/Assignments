package myprog;

import java.util.Scanner;

public class FindAverages {

	public static void main(String[] args) {
		
		double score1;
		double score2;
		double score3;
		double average;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first score: ");
		score1= input.nextDouble();
		
		System.out.println("Enter the second score: ");
		score2= input.nextDouble();
		
		System.out.println("Enter the third score: ");
		score3= input.nextDouble();
		
		
		average = (score1+score2+score3)/3.0;
		
		System.out.println("The average score is : "+ average);
		System.exit(0);

	}

}
