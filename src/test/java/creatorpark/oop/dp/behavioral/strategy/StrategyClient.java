package creatorpark.oop.dp.behavioral.strategy;

import org.junit.Test;

import creatorpark.oop.dp.behavioral.strategy.payment.Bank;
import creatorpark.oop.dp.behavioral.strategy.payment.CreditCard;
import creatorpark.oop.dp.behavioral.strategy.payment.Paypal;
import lombok.extern.log4j.Log4j2;

/**
 * Strategy used when the 'if' statement becomes complicated.
 * Strategy lets algorithm independently from clients.
 */
@Log4j2
public class StrategyClient {


	@Test
	public void usingStrategy() {
		PaymentType paymentType = PaymentType.Bank;
		PaymentStrategy strategy = null;
		
		if (PaymentType.Bank == paymentType) {
			// 1. algorithm become encapsulation.
			// 2. algorithm become interchangeable.
			strategy = new Bank("331144");
		} else if ( PaymentType.CreditCard == paymentType ) {
			strategy = new CreditCard("33", "0824", "507");
		} else if ( PaymentType.Paypal == paymentType ) {
			strategy = new Paypal("2324");
		} else {
			
		}	
		
		Payment payment = new Payment(strategy);
		payment.pay(400);
	}
	
	
	
	// simple
	// @Test
	public void usingIf() {
		
		PaymentType paymentType = PaymentType.Bank;
		
		if (PaymentType.Bank == paymentType) {
			// Account Set
			log.info("Account : " + 333);
			log.info("Amount : " + 400);
		} else if ( PaymentType.CreditCard == paymentType ) {
			// Card Info Set
			log.info("CardNumber : " + 333);
			log.info("MMYY : " + 1225);
			log.info("CVC : " + 200);
			log.info("Amount : " + 400);
		} else if ( PaymentType.Paypal == paymentType ) {
			// Paypal Set
			log.info("Paypal Number : " + 333);
			log.info("Amount : " + 400);
		} else {
			
		}
	}

}


