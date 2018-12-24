package creatorpark.oop.dp.behavioral.observer;

import java.util.ArrayList;

public class Publisher implements Subject {
	private ArrayList<AlarmListener> listeners = new ArrayList<AlarmListener>();

	public void addListener(AlarmListener listener) {
		listeners.add(listener);
	}

	public void removeListener(AlarmListener listener) {
		listeners.remove(listener);
	}

	public void notifyListeners() {
		for (AlarmListener listerner : listeners) {
			listerner.alarm();
		}
	}

}

