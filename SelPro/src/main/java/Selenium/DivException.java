package Selenium;

import java.util.Scanner;

public class DivException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new  Scanner(System.in);
System.out.println("Enter the value of x: ");

		Integer x = s.nextInt();
if(x==0) {
	try {
		throw new ArithmeticException("X should not be zero");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("x should not zero");
	}
}
Integer a = 20/x;
System.out.println(a);
}
}
