package Selenium;

public class AnonymousClassInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Airway ai = new Airway() {

	@Override
	public void hanger() {
		// TODO Auto-generated method stub
		System.out.println("it is called");
	}
	
};
ai.hanger();
	}
	

}
interface Airway{
	int runway =2;
	void hanger();
}