package Selenium;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//			A: 90-100
//			B: 80-89
//			C: 70-79
//			D: 60-69
//			F: 0-59
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the score of student : ");
		int Score = sc.nextInt();
char Grade ='F';
		if (Score <= 100 && Score >= 90) {
			Grade= 'A';
		}
		else if (Score <= 89 && Score >= 80) {
			Grade= 'B';

		}
		else if (Score <= 79 && Score >= 70) {
			Grade= 'C';
		}
		else if (Score <= 69 && Score >= 60) {
			Grade= 'D';
		}
		else {
			Grade= 'F';
		}
System.out.println("Your grade is : "+Grade);

	}
}
