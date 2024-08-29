package Selenium;

public enum EnumUrls {

	Homepage("https://www.flipkart.com/"),
	Login("https://www.flipkart.com/account/login?signup=true&ret=/");
	String value;
	EnumUrls(String Value){
		this.value = Value;
	}
	
	public String getValue() {
		return value;
	}
}
