package blog.hyojin4588.first.level4;

public class Birds extends Animal {
	
	// 생성자에용
	public Birds(String i) {
		super(i, "조류");
	}
	// 생성자에용
	
	// 세터에용
	// 세터에용

	// 객체 메소드에요
	void flying() {
		System.out.println("나 난당~~");
	}
	
	@Override // 이렇게 찍어보면 오버라이드인지 아닌지 뜬다
	void crying() {
		System.out.println("나 또 울어?");
	}
	// 객체 메소드여요

}
