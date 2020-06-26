package blog.hyojin4588.first.NewBaseball;

public class Game {
	
	// Member Field
	// Member Field
	
	// Constructor
	// Constructor
	
	// Setter & Getter
	// Setter & Getter
	
	// Entity Method		
	public static void main(String[] args) {
		int gameCnt = 3;
		
		Baseball ball = new Baseball(gameCnt);
		int val = ball.getClass(0); // 0번째 인덱스 값 리턴
		
		MyBall myBall = new MyBall(gameCnt);
		
		do {
		myBall.setNumbers();
		} while (Checker.check(gameCnt, ball, myBall));
	}
	// Entity Method

}