package creatorpark.oop.dp.creational.abstract_factory;

public class ProductNationalDetail implements ProductNational {

	public String productName = this.getClass().getSimpleName();
	
	public void getName() {
		System.out.println(productName + "Name : Korea");
	}


	public void getPresident() {
		System.out.println(productName + "President");
	}

}
