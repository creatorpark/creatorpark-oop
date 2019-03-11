package creatorpark.oop.dp.behavioral.observer.publisher;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BroadcastingProgram {

	private BroadCasterName broadCasterName;
	private ProgramType type;
	private String onAirTime;
	
	public BroadcastingProgram(BroadCasterName broadCasterName, ProgramType type, String onAirTime) {
		this.broadCasterName = broadCasterName;
		this.type = type;
		this.onAirTime = onAirTime;
	}
	
}


