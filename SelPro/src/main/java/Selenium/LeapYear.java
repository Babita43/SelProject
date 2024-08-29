package Selenium;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int Year = sc.nextInt();
		if (Year % 4 == 0) {
		System.out.println(Year + " : It is leap year");
		
		}
else {
	System.out.println(Year + " : It is not a  leap year");
		}
	}

}
