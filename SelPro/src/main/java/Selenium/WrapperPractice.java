package Selenium;

public class WrapperPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//primitive into wrapper 
		
		int a = 10;
		Integer b =a;
		System.out.println(b);
	
		
		
		//wrapper into primitive
		
		Integer c = 34;
		int d = c;
		System.out.println(d);
	
		
		///////////////////////  String to Int conversion
		String s = "10";
		Integer i = Integer.valueOf(s);
		System.out.println(i);
		
		int j= Integer.parseInt(s);
		System.out.println(j);
		
		Double d1= 3.14;
		double d2 =d1;
		System.out.println(d2);
		
		String t = "abc";
		int st = Integer.parseInt(t);
		System.out.println(st);  // it will cause Number format exception becuase to convert from string to  int, the string should contain numeric value
		
		
	}

}
