package creatorpark.oop.dp.creational.abstract_factory;

public class FactoryDetail implements AbstractFactory {

	public ProductCompany createProductCompany() {
		return new ProductCompanyDetail(); 
	}

	public ProductNational createProductNational() {
		return new ProductNationalDetail();
	}

}
