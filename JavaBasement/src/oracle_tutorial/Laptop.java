package oracle_tutorial;

//Laptop Interface
interface LaptopAction {
	void powerUp();
	void shutDown();
}


public class Laptop extends DefineLaptop {
	public static void main(String[] args) {
		Laptop newLaptop = new Laptop();
		newLaptop.setScreenSize(23);
		newLaptop.setPrice(444);
		newLaptop.showProductStatus();
		newLaptop.shutDown();
	}
}

class DefineLaptop implements LaptopAction {
	int price = 0;
	int screenSize = 0;
	String keyboard = "keyboard";
	String charger = "dell charger";
	String owner = "bill";
	
	void setPrice(int a) {
		price = a;
		System.out.println("Laptop price is: " + price);
	}
	
	void setScreenSize(int a) {
		screenSize = a;
		System.out.println("Laptop screen size is: " + screenSize);
	}
	
	void showProductStatus() {
		System.out.println("Laptop price is: " + price + " screen size is: " + keyboard);
	}
	
	public void powerUp() {
		System.out.println("Power up laptop");
	}
	
	public void shutDown() {
		System.out.println("Shut down laptop");
	}
}
