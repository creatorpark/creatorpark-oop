package creatorpark.oop.dp.behavioral.strategy.strategyimpl;

import creatorpark.oop.dp.behavioral.strategy.Strategy;

public class Multiply implements Strategy {

	public int calc(int a, int b) {
		System.out.println("A * B");
		return a * b;
	}

}
