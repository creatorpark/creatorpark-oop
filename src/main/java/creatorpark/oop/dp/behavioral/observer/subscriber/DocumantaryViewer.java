package creatorpark.oop.dp.behavioral.observer.subscriber;

import creatorpark.oop.dp.behavioral.observer.publisher.ProgramType;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Getter
@Setter
@Log4j2
public class DocumantaryViewer implements Viewer {
	
	@Override
	public ProgramType getFavoriteProgramType() {
		return ProgramType.DOCUMANTARY;
	}
	
}
