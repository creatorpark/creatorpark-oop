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
		// �ַ� �� �κ��� ������ ��ü�� �����ؾ��ϴ� Aggre-gate root���� �Ѵ�. 
		Creator creator = new CreatorSummary();

		// �� �κп� �Ķ���͸� �ѱ�� ������ �ɼ��� ���� �� �� �ִ�. hook method
		Product product = creator.factoryMethod(); 

		product.getName();
		product.getCEO();
	}
}
