package blog.hyojin4588.first.level3;

public class Car {

	// Member Field, 속성
	// 자바의 Member Field는 private의 속성을 가짐
	// Final은 값을 바꿀 수 없기 때문에 유일하게 Member Field에서 public 속성을 가진다.
	String name;
	String color;
	int cc;
	// Member Field, 속성 끝
	
	// 컴파일러가 생각하는 기본 생성자
	public Car() {
		// 생성자 호출 윗줄에는 아무것도 적을 수 없고, 서로가 서로를 호출할 수도 없다.
		// 생성자 뒤에 extends objectName 을 붙여 부모를 지정할 수 있으나, 생략할 경우 기본 오브젝트를 부모로 설정한다.
		super();
		System.out.println("Car 기본생성자!");
		// 다른 방법
		/*
			this("소나타", "흰색", 2500);
		*/
		// 도 가능하다. 이 경우 위의 super(); 는 쓰면 안 됨.
	}
	
	public Car(String name) {
		this(name, "검정색", 3000); // 생성자들 중 3개 인자를 받아 오는 생성자를 자동으로 불러온다.
	}
	
	public Car(String name, String color, int cc) {
		super(); // super(); 부모 생성자, 나의 직속 부모를 뜻한다.
		/* 
			name = name;
			color = color;
			cc = cc;
			은 왜 사용할 수 없을까?
			변수는 항상 자신과 가장 가까운 값을 불러오기 때문에, 위와 같은 변수는 항상 지역 변수인 생성자 Car의 인자를 가져온다.
			전역 변수와 지역 변수의 이름이 같을 경우, 전역 변수를 불러 와야 할 이름은 지역 변수를 가리키게 되므로 this. 를 붙여주어 구분해줘야 한다.
		*/
		this.name = name; // this. 나 자신을 뜻한다.
		this.color = color;
		this.cc = cc;
		// super 혹은 this(); 해당 object의 생성자를 불러온다는 것을 의미
		// super 혹은 this.elementName 해당 object에 해당 element의 값을 입력한다.
	}
	// 컴파일러가 생각하는 기본 생성자 끝
	
	// 생성자의 특징 1 : 클래스와 이름이 같다.
	// 생성자의 특징 2 : return type이 없다.

	
	// Member method, 메소드
	public void introduceMyCar() {
		System.out.printf("%s의 컬러는 %s이고 %dcc이다.\n", name, color, cc);
	}
	// Member method, 메소드 끝

}
