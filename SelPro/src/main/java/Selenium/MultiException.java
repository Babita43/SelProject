package Selenium;

import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;

public class MultiException {

	public static void main(String[] args) throws ArithmeticException , FileNotFoundException{
		// TODO Auto-generated method stub

		
	}
	void readfile()throws ArithmeticException , FileNotFoundException {
		System.out.println("Hi");
		int a = 10/0;
		FileReader f = new FileReader(new File("c://Downloads/ac.txt"));
		System.out.println("Bye");
	}

}
