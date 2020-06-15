package blog.hyojin4588.first;

public class Variable2 {
	public static void main(String[] args) {
		int num = 10;
		int num2, num3 = 20; // num2는 초기화되지 않은 상태이다.
		int num4 = 10, num5 = 20;
		
		/*
		 변수명 주의사항
		 1. 소문자로 시작해야 한다. (가급적 카멜케이스 기법을 활용)
		 2. 특수기호는 _(언더바), $(달러)만 사용 가능 - 특수기호로 시작해도 무방!
		 3. 숫자로 시작할 수 없다. 숫자를 뒤에 붙이는 건 가능하다.
		 4. 예약어 사용이 금지되어 있다. int char; 와 같은 따위
		 5. 변수명을 띄어쓰지 않는다.
		 6. 변수명은 대소문자를 구분한다.
		*/
		
		final int MY_MAX_HEIGHT = 1_000; // 숫자는 자리수를 구분하기 위해 언더바(_)를 사용, 없는 것과 똑같다.
		// 상수명은 무조건 대문자, 구분은 언더바로 한다.
	}
}