package creatorpark.oop.dp.behavioral.template_method;

public  class CoffeeBeverage extends CommonBeverage {
	
	void brew() {
		System.out.println("Coffee Brew.");
	}
	
	void addCondiments() {
		System.out.println("Sugar Add.");
	}
}
