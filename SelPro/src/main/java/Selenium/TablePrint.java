package Selenium;

import java.util.Scanner;

public class TablePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no :  ");
int n = sc.nextInt();
for(int i =1; i<=10; i++) {
	System.out.println(n +"*"+i+ "="  + (n*i));
	
}
	}

}
