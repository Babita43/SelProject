package Selenium;

public class ExceptionHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "kdjfhd";
try {
	int a = Integer.parseInt(s);
} catch (NumberFormatException e) {
	// TODO Auto-generated catch block
	System.out.println("Use the numbers in String assignment");
	
}finally {
	System.out.println("hi");
	//it is used to close the file, sql, scanner
}
	}

}
