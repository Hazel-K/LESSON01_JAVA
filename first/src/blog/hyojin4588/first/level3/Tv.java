package blog.hyojin4588.first.level3;

public class Tv { // class명 만들 때는 항상 파스칼 기법으로
	
	// Member Field, 속성
	String name; // 기본값 NULL
	boolean power; // 기본값 False
	int channel; // 기본값 0
	// Member Field, 속성 끝
	
	// Member method, 메소드
	void changePower() {	
		power = !power;
	}
	
	void channalUp() {
		channel++;
	}
	
	void channalDown() {
		channel--;
	}
	// Member method, 메소드 끝

}
