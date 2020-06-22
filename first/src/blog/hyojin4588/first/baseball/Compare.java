package blog.hyojin4588.first.baseball;

public class Compare {
	// 입력받은 두 값을 비교한 후 결과를 반환합니다.

	// Member Field
	// Member Field

	// Constructor
	// Constructor

	// Entity Method
	public static void compareStart() {
		int iStr = 0;
		int iBal = 0;
		int iOut = 0;
		for(int i = 0; i < Initializer.answer; i++) {
			for(int j = 0; j < Initializer.answer; j++) {
				if(Initializer.answerArr[i] == Initializer.myArr[j]) {
					if(i == j) {
						iStr++;
					} else {
						iBal++;
					}
				}
			}
		}
		iOut = Initializer.answer - iStr - iBal;
		Initializer.strike = iStr;
		Initializer.ball = iBal;
		Initializer.out = iOut;
		Initializer.tryCnt++;
	}
	// Entity Method

}
