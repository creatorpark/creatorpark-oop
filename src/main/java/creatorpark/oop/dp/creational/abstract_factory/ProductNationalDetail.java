package creatorpark.oop.dp.creational.abstract_factory;

public class ProductNationalDetail implements ProductNational {

	public String productName = this.getClass().getSimpleName();
	
	public void getName() {
		System.out.println(productName + "Name : ???•œë¯¼êµ­");
	}


	public void getPresident() {
		System.out.println(productName + "???†µ? ¹ : ì§„ì§œ ì§„ì§œ ?‚˜");
	}

}
