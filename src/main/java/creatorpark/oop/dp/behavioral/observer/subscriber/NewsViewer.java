package creatorpark.oop.dp.behavioral.observer.subscriber;

import creatorpark.oop.dp.behavioral.observer.publisher.ProgramType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewsViewer implements Viewer {


	@Override
	public ProgramType getFavoriteProgramType() {
		return ProgramType.NEWS;
	}
	

	
}
