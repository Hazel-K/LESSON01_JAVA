package blog.hyojin4588.first.baseball;

public class InputNum {
	// 자릿수를 입력받는 클래스입니다. 스캔 기능을 이용하여 값을 변수에 저장합니다.
	
	// Member Field
	// Member Field
		
	// Constructor
	// Constructor
		
	// Entity Method Start
	// 정답의 자리수를 입력받는 메소드
	public static int answerIs() {
		int iNum = 0;
		iNum = Initializer.scan.nextInt();
		return iNum;
	}
	
	// 내가 고른 숫자를 입력받는 메소드
	public static int[] myAnswer() {
		int[] iArr1 = new int[Initializer.answer];
		for(int i = 0; i < Initializer.answer; i++) {
			System.out.println((i + 1) + "번째 숫자를 입력해주세요.(1 ~ 9의 숫자) : ");
			iArr1[i] = Initializer.scan.nextInt();
		}
		return iArr1;
	}
	// Entity Method End

}
