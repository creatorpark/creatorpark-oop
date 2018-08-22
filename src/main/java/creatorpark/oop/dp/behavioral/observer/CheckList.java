package creatorpark.oop.dp.behavioral.observer;

public class CheckList {
	
	public void checkLanguage() {
		System.out.println("?‹¤êµ??–´ ì§??›ë²„ì „. ?•ˆ?“œë¡œì´?“œ?—?„œ ?–¸?–´ ê°?? ¸??.");
	}

	public void checkLocalHoliday() {
		System.out.println("?‚˜?¼ë³? ?œ´?¼ ì§??›ë²„ì „. ?‚˜?¼ë³? ?œ´?¼ ? •ë¦?");
	}
	
	public void checkHoliday() {
		System.out.println("?‚¬?š©? ? •?˜ ?œ´?¼ ì¶”ê? ê¸°ëŠ¥.");
	}

	
	public void excuteCheckList() {
		checkLanguage();
		checkLocalHoliday();
		checkHoliday();
	}
	
}
