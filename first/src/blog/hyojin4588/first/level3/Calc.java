package blog.hyojin4588.first.level3;

public class Calc {
	
	int n1;
	int n2;
	// 전역 변수 : 클래스 내 모든 메소드에서 사용 가능
	// 지역 변수 : 메소드 혹은 반복문 내에서 사용되는 변수로, 메소드나 반복문 바깥에서 사용할 수 없다.
	// default 변수 : 같은 패키지 내 모든 메소드에서 사용 가능
	// protected 변수 : 같은 패키지 내 변수 혹은 상속 받은 관계 내의 메소드에서 사용 가능
	// static 변수 : JAVA 객체 전역에서 사용할 수 있는 변수. 이 변수에 접근할 경우 'ClassName.varName' 으로 접근해야 함.
	// private 변수 : 같은 클래스 내에서 사용 가능
	// public 변수 : 모든 클래스 내에서 사용 가능 (객체화 여부 중요) 
	
	public Calc(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public static int sum(int iA, int iB) {
		return iA + iB;
	}
	
	public int sum() {
		return n1 + n2;
	}

}