package creatorpark.oop.dp.behavioral.strategy;

// Context
public class Payment {
	private PaymentStrategy strategy;
	
	public Payment(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void pay(int amount) {
		strategy.pay( amount );
	}
}

