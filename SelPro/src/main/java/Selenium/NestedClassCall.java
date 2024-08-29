package Selenium;

public class NestedClassCall {
	public static void main(String args[]) {
		Car c = new Car("Lambo");
System.out.println(c.make);
		c.drive();
		Car.Gearbox g =  c.new Gearbox();
		g.helo();
		Car.Gearbox.Start cgs = g.new Start();
		cgs.starting();
	}

}

class Car {
	String make;

	public Car(String make) {
		this.make = make;
	}

	void drive() {
		System.out.println("kjdsfhkjds");
	}

	class Gearbox {
		void helo() {
			System.out.println("Print me");
		}

		class Start {
			void starting() {
				System.out.println("okay lets try");
			}
		}
	}
}
