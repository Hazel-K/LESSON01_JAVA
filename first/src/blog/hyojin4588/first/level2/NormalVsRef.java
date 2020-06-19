package blog.hyojin4588.first.level2;

public class NormalVsRef {

	public static void main(String[] args) {

		int iNum = 10;
		System.out.println("Before num : " + iNum);
		changeVal(iNum);
		System.out.println("After num : " + iNum); // iNum의 값을 복사해서 changeVal에 넘겨준 것이므로, main Method에 int iNum 값에 영향을 주지 못한다.

		int[] iNumArr = { 10 };
		System.out.println("Before num : " + iNumArr[0]);
		changeVal(iNumArr);
		System.out.println("Before num : " + iNumArr[0]); // 배열은 레퍼런스 변수이므로 주소값을 저장한다. 같은 주소값을 가리켜 값을 변경하므로, 주소값에 해당하는 값이 영향을 받는다.
	}

	public static void changeVal(int iNum) {

		iNum = 30;

	}

	public static void changeVal(int[] iNum) {

		iNum[0] = 30;

	}

}
