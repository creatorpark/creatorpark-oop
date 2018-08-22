package creatorpark.oop.dp.behavioral.template_method;

/**
 * Template Method
 * @author creatorpark
 */
public abstract class CommonBeverage {

	 public final void prepareRecipe() {
		
		boilWater();        // 
		brew();             //
		pourInCup();       	// 
		addCondiments();	//
	}

	void boilWater() {
		System.out.println("boil Water");
	}
	
	abstract void brew();
	
	void pourInCup() {
		System.out.println("pourInCup.");
	}
	
	abstract void addCondiments();
}
