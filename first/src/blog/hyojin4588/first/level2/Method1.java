package blog.hyojin4588.first.level2;

public class Method1 {
	
	// 모든 언어를 통틀어, Method 안에 Method는 없다. 모든 Method는 동급이며, 위치는 여기를 벗어날 수 없다.
	
	public static void main(String[] args) {
		
		// static은 자동으로 메모리에 올려주는 기능을 한다. 만약 static이 없다면 수동으로 메모리에 올려야 한다.
		
		// C언어로 따지면 function과 같은 기능
		// 객체 안에 있으면 Method, 객체 바깥에 있으면 function
		// JAVA는 function의 개념이 없다.
		
		// void main(String[] args) 는 전부 Method의 선언부라고 한다.
		// { } 속 내용은 Method의 구현부라고 한다.
		// main은 Method의 이름이다.
		// void는 return type이다.
		// (String[] args)는 parameter(매개 변수)이다.
		
		// return type
		// return type은 void와 비void형으로 나눔, 회신이 없고 있고의 차이이다.
		// void는 return 입력이 선택이지만, 비void형은 필수이다.
		// 타입에 따라 호출하는 방식이 다르다.
		
		// Method Call; 메소드 호출
		sum(10, 15); // 이름 옆에 소괄호 ( )가 있다면 무조건 Method와 연관이 있는 셈. 여기다가 변수를 지정할 수 없고, 값만을 보내야 한다.
		Method1.sum(20, 25); // 외부 클래스에서 Method를 호출할 경우 class명도 함께 적는다. 
		Method1 me1 = new Method1(); // static으로 class를 지정하지 않은 경우, 메모리에 올리는 커맨드를 입력해야 한다.
		// JAVA는 Method에 지정된 타입 이외의 자료형태를 입력하거나 지정된 개수를 초과하거나 더 적은 값을 보낼 수는 없다.
		
		minus(20, 5);
		
	}
	
	public static void sum(int n1, int n2) { // 외부로부터 매개변수를 받을 수 있는 통로와 같다. n1, n2에 해당하는 인자를 받아야 함
		
		System.out.println(n1 + n2); // 가공이 완료된 상태, 만약 return을 한다면 호출에 의한 반환값이 발생한다.
		// void형은 이 부분에 return; 이 생략되어 있는 형태이다. 즉 자동으로 호출한 곳으로 값을 반환한다.
		
	}
	
	public static void minus(int n1, int n2) {
		
		System.out.println(n1 - n2);
		
	}

}
