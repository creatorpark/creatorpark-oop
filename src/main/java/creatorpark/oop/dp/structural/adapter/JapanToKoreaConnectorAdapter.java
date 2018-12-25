package creatorpark.oop.dp.structural.adapter;

public class JapanToKoreaConnectorAdapter implements StandardConnector {
	
	private StandardConnector japanConnector;
	

	public JapanToKoreaConnectorAdapter( StandardConnector japanConnector ) {
		this.japanConnector = japanConnector;
	}
	
	public int provideElectricity() {
		return japanConnector.provideElectricity() * 2;
	}

}
