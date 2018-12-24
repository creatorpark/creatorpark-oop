package creatorpark.oop.dp.behavioral.observer;

import org.junit.Test;

import creatorpark.oop.dp.behavioral.observer.publisher.BroadCaster;
import creatorpark.oop.dp.behavioral.observer.publisher.JTBC;
import creatorpark.oop.dp.behavioral.observer.subscriber.DocumantaryViewer;
import creatorpark.oop.dp.behavioral.observer.subscriber.NewsViewer;
import lombok.extern.log4j.Log4j2;

/**
 * One to Many Relation.
 * Publisher changes state, all its subscribers are notified.
 */
@Log4j2
public class ObserverClient {

	@Test
	public void testObserver() {
		BroadCaster jtbc = new JTBC();
		jtbc.addViewer(new DocumantaryViewer());
		jtbc.addViewer(new NewsViewer());
		
		jtbc.notifyViewers();
	}
	
}
