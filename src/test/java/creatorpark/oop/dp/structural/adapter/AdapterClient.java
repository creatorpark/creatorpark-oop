package creatorpark.oop.dp.structural.adapter;

import org.junit.Test;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AdapterClient {

	@Test
	public void adapterTest() {
		StandardConnector japanConnector = new JapanConnector();
		JapanToKoreaConnectorAdapter adapter = new JapanToKoreaConnectorAdapter(japanConnector);
		log.info("converting electricity : " + adapter.provideElectricity() );
	}
}
