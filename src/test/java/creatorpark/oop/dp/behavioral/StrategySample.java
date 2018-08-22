package creatorpark.oop.dp.behavioral;

import org.junit.Test;

import creatorpark.oop.dp.behavioral.strategy.Calculator;
import creatorpark.oop.dp.behavioral.strategy.strategyimpl.Add;
import creatorpark.oop.dp.behavioral.strategy.strategyimpl.Multiply;
import creatorpark.oop.dp.behavioral.strategy.strategyimpl.Subtract;

/**
 * Client
 */
public class StrategySample {

	@Test
	public void test() {
		Calculator colculator;
		
		colculator = new Calculator(new Add());
		System.out.println("Result : " + colculator.excute( 3, 5) );
		
		colculator = new Calculator(new Subtract());
		System.out.println("Result : " + colculator.excute( 3, 5) );
		
		colculator = new Calculator(new Multiply());
		System.out.println("Result : " + colculator.excute( 3, 5) );
	}

}


