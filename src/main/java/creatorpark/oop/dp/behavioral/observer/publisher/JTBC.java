package creatorpark.oop.dp.behavioral.observer.publisher;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import creatorpark.oop.dp.behavioral.observer.subscriber.Viewer;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class JTBC implements BroadCaster {
	
	protected List<BroadcastingProgram> programs;
	
	// Observer;
	protected List<Viewer> viewers;
	
	public JTBC() {
		BroadCasterType broadCaster = BroadCasterType.JTBC; 
		programs = new ArrayList<>(4);
		programs.add(new BroadcastingProgram(broadCaster, ProgramType.NEWS , "9 PM") );
		programs.add(new BroadcastingProgram(broadCaster, ProgramType.DRAMA, "10 PM") );
		programs.add(new BroadcastingProgram(broadCaster, ProgramType.DOCUMANTARY, "11 PM") );
		programs.add(new BroadcastingProgram(broadCaster, ProgramType.COMEDY, "12 PM") );
		viewers = new LinkedList<>();
	}

	@Override
	public void addViewer(Viewer viewer) {
		viewers.add( viewer );
	}

	@Override
	public void removeViewer(Viewer viewer) {
		viewers.remove( viewer );
	}

	@Override
	public void notifyViewers() {
		Random random = new Random();
		BroadcastingProgram program = programs.get( random.nextInt(3) );
		for (Viewer viewer : viewers) {
			log.info(viewer.watchingProgram( program ) );
		}
	}
	
}
