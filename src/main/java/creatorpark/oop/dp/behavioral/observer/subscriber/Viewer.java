package creatorpark.oop.dp.behavioral.observer.subscriber;

import creatorpark.oop.dp.behavioral.observer.publisher.BroadcastingProgram;
import creatorpark.oop.dp.behavioral.observer.publisher.ProgramType;

// Observer, Subscriber
public interface Viewer {
	
	public ProgramType getFavoriteProgramType();
	
	
	default String watchingProgram(BroadcastingProgram program) {
		if ( program.getType() == getFavoriteProgramType() ) {
			return " watching Favorite " + program.getType() + " Programs ";
		} else {
			return " skip " + program.getType() + " Program ";
		}
	}
}
