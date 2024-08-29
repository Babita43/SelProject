package Selenium;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank icici = new Bank("INR", 1000);
		Bank sbi = new Bank("INR", 1000);
		Integer total = icici.add(sbi);
		System.out.println(total);
		
		Bank jkbank = new Bank("USD", 500);
		Integer total1 = sbi.add(jkbank);
		System.out.println(total1);
		
		// but here the currency is different for both banks than it should not allow to add
	}

}
