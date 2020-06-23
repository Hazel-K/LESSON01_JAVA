package blog.hyojin4588.first.baseball;

public class AGenerator {
	// InputNum Class에서 받은 변수를 바탕으로 변수만큼의 자리수를 가진 난수 배열을 만듭니다.
	// 난수는 각각 1 ~ 9 사이의 수입니다.
	
	// Member Field
	// Member Field
	
	// Constructor
	// Constructor
	
	// Entity Method
	public static int[] answerSet(int iNum) {
		int[] iArr2 = new int[Initializer.answer];
		for (int i = 0; i < iNum; i++) {
			iArr2[i] = (int)(Math.random() * 9 + 1);
			for (int j = 0; j < i; j++) {
				if (iArr2[i] == iArr2[j]) {
					i--;
					break;
				}
			}
		}
		return iArr2;
	}
	// Entity Method

}
