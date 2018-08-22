package creatorpark.oop.dp.creational.abstract_factory;

public class FactorySummary implements AbstractFactory {

	public ProductCompany createProductCompany() {
		return new ProductCompanySummary(); 
	}

	public ProductNational createProductNational() {
		return new ProductNationalSummary();
	}

}
