package creatorpark.oop.dp.behavioral;

import org.junit.Test;

import creatorpark.oop.dp.behavioral.strategy.Context;
import creatorpark.oop.dp.behavioral.strategy.impl.Add;
import creatorpark.oop.dp.behavioral.strategy.impl.Multiply;
import creatorpark.oop.dp.behavioral.strategy.impl.Subtract;

// Client
public class StrategyClient {
	
	
	// simple version
	public void _if() {
		
	}

	// Strategy used when the 'if' statement becomes complicated.
	public void strategy() {
		Context colculator;
		
		colculator = new Context(new Add());
		System.out.println("Result : " + colculator.excute( 3, 5) );
		
		colculator = new Context(new Subtract());
		System.out.println("Result : " + colculator.excute( 3, 5) );
		
		colculator = new Context(new Multiply());
		System.out.println("Result : " + colculator.excute( 3, 5) );
	}

}


