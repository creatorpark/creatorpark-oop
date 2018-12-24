package creatorpark.oop.dp.behavioral.strategy;

/**
 * Context
 */
public class Context {
	private Strategy strategy;
	
	public Context( Strategy strategy ) {
		this.strategy = strategy;
	}
	
	public int excute(int a, int b) {
		return this.strategy.calc(a, b);
	}
}
