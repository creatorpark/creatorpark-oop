package creatorpark.oop.dp.creational;

import org.junit.Test;

import creatorpark.oop.dp.creational.factory_method.Creator;
import creatorpark.oop.dp.creational.factory_method.CreatorSummary;
import creatorpark.oop.dp.creational.factory_method.Product;

/**
http://www.oodesign.com/factory-method-pattern.html
*/
public class FactoryMethodSample {

	@Test
	public void test() {
		// 주로 이 부분은 복잡한 객체를 생성해야하는 Aggre-gate root에서 한다. 
		Creator creator = new CreatorSummary();

		// 이 부분에 파라메터를 넘기면 생성시 옵션을 설정 할 수 있다. hook method
		Product product = creator.factoryMethod(); 

		product.getName();
		product.getCEO();
	}
}
