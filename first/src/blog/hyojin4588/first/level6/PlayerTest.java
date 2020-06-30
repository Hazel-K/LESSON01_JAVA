package blog.hyojin4588.first.level6;

public class PlayerTest {
	
	public static void main(String[] args) {
		
		Player play = new CDPlayer(); // 추상 클래스는 객체화할 수 없다.
		play.play();
		
		play = new DVDPlayer();
		play.play();
		
	}

}

class CDPlayer extends Player {

	@Override
	public void play() {
		System.out.println("시디를 재생합니다");
	}
	
}

class DVDPlayer extends Player {

	@Override
	public void play() {
		System.out.println("디비디를 재생합니다");
	}
	
}