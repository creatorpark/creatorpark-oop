package creatorpark.oop.dp.creational.abstract_factory;

public class ProductCompanyDetail implements ProductCompany {

	public String productName = this.getClass().getSimpleName();
	
	public void getName() {
		System.out.println(productName + "Name : 진짜 좋�? ?���? 좋�? 멋진 ?��?��");
	}

	public void getCEO() {
		System.out.println(productName + "CEO : 멋진 ?��");
	}

}
