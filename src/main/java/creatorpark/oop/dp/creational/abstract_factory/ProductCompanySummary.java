package creatorpark.oop.dp.creational.abstract_factory;

public class ProductCompanySummary implements ProductCompany {

	public String productName =  this.getClass().getSimpleName();
	
	public void getName() {
		System.out.println(productName + "Name : 진짜 좋�? ?��?��");
	}

	public void getCEO() {
		System.out.println(productName + "CEO : ?��");
	}

}
