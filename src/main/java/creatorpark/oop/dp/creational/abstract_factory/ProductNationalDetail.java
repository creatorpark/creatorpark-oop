package creatorpark.oop.dp.creational.abstract_factory;

public class ProductNationalDetail implements ProductNational {

	public String productName = this.getClass().getSimpleName();
	
	public void getName() {
		System.out.println(productName + "Name : ???λ―Όκ΅­");
	}


	public void getPresident() {
		System.out.println(productName + "???΅? Ή : μ§μ§ μ§μ§ ?");
	}

}
