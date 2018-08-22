package creatorpark.oop.dp.behavioral;

import org.junit.Test;

import creatorpark.oop.dp.behavioral.observer.AnalogAlarm;
import creatorpark.oop.dp.behavioral.observer.CheckedAlarm;
import creatorpark.oop.dp.behavioral.observer.DigitalAlarm;
import creatorpark.oop.dp.behavioral.observer.Publisher;

/**
 * Activity, Document
 * @author creatorpark
 */
public class ObserverSample {

	@Test
	public void testObserver() {
		Publisher publisher = new Publisher();
		
		publisher.addListener(new AnalogAlarm());
		publisher.addListener(new DigitalAlarm());
		publisher.addListener(new CheckedAlarm());
		
		publisher.notifyListeners();
	}
	
}
