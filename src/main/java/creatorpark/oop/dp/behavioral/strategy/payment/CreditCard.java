package creatorpark.oop.dp.behavioral.strategy.payment;

import creatorpark.oop.dp.behavioral.strategy.PaymentStrategy;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class CreditCard implements PaymentStrategy {
	
	private String cardNumber;
	private String mmyy;
	private String cvc;
	
	public CreditCard(String cardNumber, String mmyy, String cvc) {
		this.cardNumber = cardNumber;
		this.mmyy = mmyy;
		this.cvc = cvc;
	}

	@Override
	public void pay(int amount) {
		log.info("CardNumber : " + cardNumber + ". mmyy : " + mmyy + ", cvc : " + cvc);
		log.info("Amount : " + amount );
	}

}
