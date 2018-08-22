package creatorpark.oop.dp.behavioral.strategy;

/**
 * Context
 */
public class Calculator {
	private Strategy strategy;
	
	public Calculator( Strategy strategy ) {
		this.strategy = strategy;
	}
	
	public int excute(int a, int b) {
		return this.strategy.calc(a, b);
	}
}
