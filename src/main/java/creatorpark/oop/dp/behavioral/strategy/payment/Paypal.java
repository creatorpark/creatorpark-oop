package creatorpark.oop.dp.behavioral.strategy.payment;

import creatorpark.oop.dp.behavioral.strategy.PaymentStrategy;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Paypal implements PaymentStrategy {
	
	private String paypalNumber;
	
	public Paypal(String paypalNumber) {
		this.paypalNumber = paypalNumber;
	}

	@Override
	public void pay(int amount) {
		log.info("PayPal Number : " + paypalNumber );
		log.info("Amount : " + amount );
	}


}
