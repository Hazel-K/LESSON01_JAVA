package blog.hyojin4588.first.level3;

public class Monitor {
	
	// Member Field, 속성
	// 자바의 Member Field는 private의 속성을 가짐
	// Final은 값을 바꿀 수 없기 때문에 유일하게 Member Field에서 public 속성을 가진다.
	static String brand; // class 변수, static이 붙으면 값은 1개밖에 저장되지 않으며, 모든 객체가 이 값을 공유하게 된다. 또한 static 변수는 메모리에 자동으로 올라간다.
	int inch; // Instance 변수
	// Member Field, 속성 끝
	
	void printlnfo() {
		System.out.printf("brand : %s, inch : %d inches\n", this.brand, this.inch);
	}
	
	static void printBrand() {
		System.out.println(brand);
	}
	// static이 붙은 메소드는 static이 붙은 변수를 사용할 수 있다. 

}
