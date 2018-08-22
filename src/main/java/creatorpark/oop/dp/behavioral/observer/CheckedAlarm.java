package creatorpark.oop.dp.behavioral.observer;

public class CheckedAlarm extends CheckList implements AlarmListener {
	
	public void alarm() {
		excuteCheckList();
		System.out.println("Checked Alarming");
	}
	
}
