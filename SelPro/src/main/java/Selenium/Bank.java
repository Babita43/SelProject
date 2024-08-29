package Selenium;

public class Bank {
private String currency;
private Integer amount;

Bank(String currency, Integer amount){
	this.currency = currency;
	this.amount = amount;
	
}

public String getCurrency() {
	return currency;
}

public void setCurrency(String currency) {
	this.currency = currency;
}
public Integer add(Bank bankname) {
	if(!bankname.currency.equalsIgnoreCase("INR"))
		try {
			throw new Exception("Currency should be same");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Bank currency should be same");
		
		}
	Integer sum = this.amount + bankname.amount;
	return sum;
	
}
}
