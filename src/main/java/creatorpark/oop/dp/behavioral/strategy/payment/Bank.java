package creatorpark.oop.dp.behavioral.strategy.payment;

import creatorpark.oop.dp.behavioral.strategy.PaymentStrategy;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Bank implements PaymentStrategy {
	
	String account;

	public Bank(String account) {
		this.account = account;
		
	}
	
	@Override
	public void pay(int amount) {
		log.info("Account : " + account);
		log.info("Amount : " + amount );
	}


}
