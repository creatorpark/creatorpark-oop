package creatorpark.oop.dp.creational.factory_method;

public class CreatorSummary implements Creator {

	public Product factoryMethod() {
		return new ProductCompany();
	}

}
