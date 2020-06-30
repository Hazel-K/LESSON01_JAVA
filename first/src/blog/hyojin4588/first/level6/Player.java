package blog.hyojin4588.first.level6;

public abstract class Player {
// 메소드 없이 abstract 붙이면 객체화 하기 싫다는 이야기임. 상속 시 유용하게 활용 가능.

	public abstract void play();
	// 내용은 없고 선언만 할 수 있는 메소드를 추상 메소드라고 함. 메소드가 하나라도 있으면 해당 메소드와 클래스 모두 abstract를 적어야 함.
	// 상속 시에는 선언한 메소드를 반드시 자식 객체에서 오버라이드 해야 한다.
	
	public void stop() {
		System.out.println("재생을 멈췄냐");
	}

}
