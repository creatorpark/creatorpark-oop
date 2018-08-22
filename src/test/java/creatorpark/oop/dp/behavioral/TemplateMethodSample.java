package creatorpark.oop.dp.behavioral;

import org.junit.Test;

import creatorpark.oop.dp.behavioral.template_method.CoffeeBeverage;
import creatorpark.oop.dp.behavioral.template_method.CommonBeverage;
import creatorpark.oop.dp.behavioral.template_method.GreenTeaBeverage;

public class TemplateMethodSample {

	@Test
	public void test() {
		
		CommonBeverage coffee = new CoffeeBeverage();
		coffee.prepareRecipe();
		
		CommonBeverage greenTea = new GreenTeaBeverage();
		greenTea.prepareRecipe();
	}
}
