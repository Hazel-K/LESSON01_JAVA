package blog.hyojin4588.first.NewBaseball;

import java.util.Arrays;

public class Baseball {

	// Member Field
	private int[] rArr;
	// Member Field

	// Constructor
	public Baseball() {
	}

	public Baseball(int i) {
		init(i);
	}
	// 생성자는 자료형의 속성을 갖지 않음
	// Constructor

	// Setter & Getter
	public int getlength() {
		return rArr.length;
	}

	public int getClass(int i) {
		return rArr[i];
	}
	// Setter & Getter

	// Entity Method
	private void init(int i) {
		rArr = new int[i];
		setRandom();
	}

	private void setRandom() {
		for (int i = 0; i < rArr.length; i++) {
			rArr[i] = (int) (Math.random() * 9 + 1);
			for (int j = 0; j < i; j++) {
				if (rArr[i] == rArr[j]) {
					i--;
					break;
				}
			}
		}
	}

	public void checkAnswer() {
		System.out.println(Arrays.toString(rArr));
	}
	// Entity Method

}