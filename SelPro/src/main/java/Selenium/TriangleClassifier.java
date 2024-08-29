package Selenium;

import java.util.Scanner;

public class TriangleClassifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int side[] = new int[3];
		for (int i = 0; i <side.length; i++) {
			System.out.println("enter the no : ");
			side[i] = sc.nextInt();
		}
		 if (side[0] == side[1] && side[1] == side[2] ) {
			System.out.println("Triangle is equilateral");
		}
		 else if (side[0] == side[1] || side[1] == side[2] || side[2] == side[0]) {
			System.out.println("Triangle is isoceles");
		} else {
			System.out.println("It is scaline");

		}
	}

}
