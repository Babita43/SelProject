package Selenium;

import java.util.Scanner;

public class AlphabetCasecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the word : ");
char ch = sc.next().trim().charAt(0);
System.out.println(ch);
if(ch>='a' && ch<='z') {
	System.out.println(ch + " is lowercase");
}else {
	System.out.println(ch + " is Uppercase");
}
	}

}
