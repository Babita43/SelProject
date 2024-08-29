package Selenium;

public class ExceptionPassing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		executed();
	}

	private static void executed() {
		executed1();
	}

	private static void executed1() {
		Integer[] i = new Integer[2];
		try {
			System.out.println(i[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Array Exception");
		}catch(Exception e){
			System.out.println("catch it big fish");
		}
	}
}
