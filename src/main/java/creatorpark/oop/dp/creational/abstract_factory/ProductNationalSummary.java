package creatorpark.oop.dp.creational.abstract_factory;

public class ProductNationalSummary implements ProductNational {

	public String productName = this.getClass().getSimpleName();
	
	public void getName() {
		System.out.println(productName + "Name : ?•œêµ?");
	}


	public void getPresident() {
		System.out.println(productName + "???†µ? ¹ : ?´ê²ƒë‘ ?‚˜");
	}

}
