package Selenium;

import java.util.Scanner;

public class MaxSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		/*
		 * largest number int max=a;
		 * 
		 * if(b>max) { max=b; } if(c>max) { max=c; } System.out.println(max);
		 */
		
		//smallest no
		int min=a;
		if(b< min) {
			min=b;
		}
		if(c<min) {
			min=c;
		}
		System.out.println(min);
	}
}
