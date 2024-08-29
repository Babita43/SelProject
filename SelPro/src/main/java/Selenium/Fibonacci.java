package Selenium;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Fibonacci series is, it add 2 no and print next, it starts with 0,1
		//0,1,1,2,3,5,8,13,21
		int a= 0;
		int b=1;
		int fibo= a+b;
				Scanner sc = new Scanner(System.in);
		System.out.println("Enter the place no : ");
		int n = sc.nextInt();
		for(int count=2;count<=n;count++ ) {
			fibo= a+b;
			a=b;
					b=fibo;
			
					
		}
		System.out.println(b);
		
	}

}
