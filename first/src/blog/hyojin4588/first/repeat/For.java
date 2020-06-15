package blog.hyojin4588.first.repeat;

public class For {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {	// 필요에 따라서 생략 가능, 생략시 무한 반복, 조건식이 참인 동안만 반복, 증감식을 통해 초기값 변경
			System.out.println("반복문!" + (i + 1));
		}

	}

}
