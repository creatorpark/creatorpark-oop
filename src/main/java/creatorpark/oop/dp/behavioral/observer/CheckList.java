package creatorpark.oop.dp.behavioral.observer;

public class CheckList {
	
	public void checkLanguage() {
		System.out.println("?€κ΅??΄ μ§??λ²μ . ??λ‘μ΄??? ?Έ?΄ κ°?? Έ??.");
	}

	public void checkLocalHoliday() {
		System.out.println("??Όλ³? ?΄?Ό μ§??λ²μ . ??Όλ³? ?΄?Ό ? λ¦?");
	}
	
	public void checkHoliday() {
		System.out.println("?¬?©? ? ? ?΄?Ό μΆκ? κΈ°λ₯.");
	}

	
	public void excuteCheckList() {
		checkLanguage();
		checkLocalHoliday();
		checkHoliday();
	}
	
}
