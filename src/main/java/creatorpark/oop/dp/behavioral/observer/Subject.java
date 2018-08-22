package creatorpark.oop.dp.behavioral.observer;

public interface Subject {
	public void addListener(AlarmListener listener);
	public void removeListener(AlarmListener listener);
	public void notifyListeners();
}
