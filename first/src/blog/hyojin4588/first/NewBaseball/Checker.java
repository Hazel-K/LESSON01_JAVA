package blog.hyojin4588.first.NewBaseball;

public class Checker {

	// Entity Method
	public static boolean check(int i, Baseball j, MyBall k) {
		// j.checkAnswer(); // 정답 확인용 구문
		int str = 0;
		int bal = 0;
		for (int a = 0; a < j.getlength(); a++) {
			for (int b = 0; b < k.getlength(); b++) {
				if (j.getClass(a) == k.getClass(b)) {
					if (a == b) {
						str++;
					} else {
						bal++;
					}
				}
			}
		}
		if (str == i) {
			return false;
		} else {
			return true;
		}
	}
	// Entity Method

}
