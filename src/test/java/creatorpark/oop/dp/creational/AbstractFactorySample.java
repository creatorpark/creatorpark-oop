package creatorpark.oop.dp.creational;

import org.junit.Test;

import creatorpark.oop.dp.creational.abstract_factory.AbstractFactory;
import creatorpark.oop.dp.creational.abstract_factory.FactoryDetail;
import creatorpark.oop.dp.creational.abstract_factory.FactorySummary;
import creatorpark.oop.dp.creational.abstract_factory.ProductCompany;
import creatorpark.oop.dp.creational.abstract_factory.ProductNational;


/**
 * http://www.oodesign.com/abstract-factory-pattern.html
 *  AbstractFactory - 집단으로 다뤄지는 객체군, 동일한 데이터에 다양한 표현력을 지닌 경우.
 */
public class AbstractFactorySample {
	
	@Test
	public void test() {
		testSummary();
		System.out.println();
		testDetail();
	}
 
	public void testSummary() {
		AbstractFactory factorySummary = new FactorySummary();
		
		ProductCompany productCompany =  factorySummary.createProductCompany();
		productCompany.getName();
		productCompany.getCEO();

		ProductNational productNational =  factorySummary.createProductNational();
		productNational.getName();
		productNational.getPresident();
		
	}
	
	public void testDetail() {
		AbstractFactory factoryDetail = new FactoryDetail();
		
		ProductCompany productCompany =  factoryDetail.createProductCompany();
		productCompany.getName();
		productCompany.getCEO();

		ProductNational productNational =  factoryDetail.createProductNational();
		productNational.getName();
		productNational.getPresident();
	}
}
