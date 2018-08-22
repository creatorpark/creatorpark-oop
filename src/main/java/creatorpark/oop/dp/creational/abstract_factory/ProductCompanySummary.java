package creatorpark.oop.dp.creational.abstract_factory;

public class ProductCompanySummary implements ProductCompany {

	public String productName =  this.getClass().getSimpleName();
	
	public void getName() {
		System.out.println(productName + "Name : ì§„ì§œ ì¢‹ì? ?šŒ?‚¬");
	}

	public void getCEO() {
		System.out.println(productName + "CEO : ?‚˜");
	}

}
