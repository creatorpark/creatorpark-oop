package creatorpark.oop.dp.behavioral.observer.publisher;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BroadcastingProgram {

	private BroadCasterType broadCaster;
	private ProgramType type;
	private String onAirTime;
	
	public BroadcastingProgram(BroadCasterType broadCaster, ProgramType type, String onAirTime) {
		this.broadCaster = broadCaster;
		this.type = type;
		this.onAirTime = onAirTime;
	}
	
}


