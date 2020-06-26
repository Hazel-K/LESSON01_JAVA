package blog.hyojin4588.first.NewBaseball;

public class Checker {

	// Entity Method
	public static boolean check(int i, Baseball j, MyBall k) {
		// j.checkAnswer(); // 정답 확인용 구문
		int str = 0;
		int bal = 0;
		for (int a = 0; a < i; a++) {
			for (int b = 0; b < i; b++) {
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
			System.out.printf("스트라이크 : %d 볼 : %d 아웃 : %d\n", str, bal, (i - str - bal));
			return false;
		} else {
			System.out.printf("스트라이크 : %d 볼 : %d 아웃 : %d\n", str, bal, (i - str - bal));
			return true;
		}
	}
	// Entity Method

}