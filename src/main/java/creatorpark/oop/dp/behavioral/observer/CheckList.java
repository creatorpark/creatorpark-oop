package creatorpark.oop.dp.behavioral.observer;

public class CheckList {
	
	public void checkLanguage() {
		System.out.println("?���??�� �??��버전. ?��?��로이?��?��?�� ?��?�� �??��??.");
	}

	public void checkLocalHoliday() {
		System.out.println("?��?���? ?��?�� �??��버전. ?��?���? ?��?�� ?���?");
	}
	
	public void checkHoliday() {
		System.out.println("?��?��?�� ?��?�� ?��?�� 추�? 기능.");
	}

	
	public void excuteCheckList() {
		checkLanguage();
		checkLocalHoliday();
		checkHoliday();
	}
	
}
