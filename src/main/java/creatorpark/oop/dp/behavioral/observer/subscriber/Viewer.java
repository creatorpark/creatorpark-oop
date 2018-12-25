package creatorpark.oop.dp.behavioral.observer.subscriber;

import creatorpark.oop.dp.behavioral.observer.publisher.BroadcastingProgram;
import creatorpark.oop.dp.behavioral.observer.publisher.ProgramType;

// Observer, Subscriber
public interface Viewer {
	
	public ProgramType getFavoriteProgramType();
	
	
	default void watchingProgram(BroadcastingProgram program) {
		if ( program.getType() == getFavoriteProgramType() ) {
			System.out.println(" watching Favorite " + program.getType() + " Program");
		} else {
			System.out.println(" skip " + program.getType() + " Program ");
		}
	}
}
