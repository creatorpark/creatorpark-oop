package creatorpark.oop.dp.behavioral.observer.publisher;

import creatorpark.oop.dp.behavioral.observer.subscriber.Viewer;

// Observable(Publisher)
public interface BroadCaster {
	
	// add Observer(Subscribe)
	public void addViewer( Viewer viewer);
	public void removeViewer( Viewer viewer);
	public void deliveringProgramToViewers();
}
