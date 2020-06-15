package blog.hyojin4588.first;

public class Variable {
	public static void main(String[] args) {
		char	v1;
		// 문자형 변수(사실상 정수형 변수)
		v1 = 'A';
		// 오른쪽에 있는 값을 복사하여 왼쪽에 넣어준다.
		System.out.println(v1);
		System.out.println('A');
		// 자바에서 홑따옴표 ''는 문자, 겹따옴표""는 객체를 의미한다.
		v1 = 'B';
		// 변수의 값은 언제든 변경할 수 있다.
		System.out.println(v1);
		// char v2; 로 사용할 수는 없음, 자료형이 달라도 변수 이름을 중복해서 사용할 수 없다.
		// 각자의 고유한 값을 리터럴(literal)이라고 한다. 리터럴에도 기본으로 할당된 각자의 자료형이 존재한다.

		byte	v2;
		short	v3;
		int		v4;
		long	v5;
		// 정수형 변수
		v2 = 10;
		v3 = 20;
		v4 = 30;
		v5 = 50;
		System.out.println();
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		// 64bit PC라도 메모리를 제외한 나머지 사양은 32bit이므로 4byte로 연산 처리를 하는 자료형이 유리하다(int, float)
		
		float	v6;
		double	v7;
		// 실수형 변수
		// v6 = 10.1; 10.1 자체가 double 자료형이므로 float 변수 v6에 10.1이라는 값을 집어넣을 수 없다.
		v6 = (float)10.1;
		v6 = 10.1f;
		v7 = 10.1;
		v6 = (float)v7;
		// 자료형에 맞는 수를 집어넣는 여러 용례	
		
		boolean	v8;
		System.out.println();
		v8 = true;
		System.out.println(v8);
		v8 = false;
		System.out.println(v8);
		// True, False 변수, 트루, 펄스의 실제 값은 1과 0이며 1byte의 메모리를 할당받는다. 
		
		String		r1 = "안녕하세요."; // String은 class이다.
		System.out.println(r1);
		Variable	r2;
		// Reference 변수
		
		// 객체는 명사적 성질(변화할수 없는 정의적 정보)를 띄고 있고, 메소드는 동사적 성질(유동적인 변화적 정보)을 갖고 있다.
	}
}
