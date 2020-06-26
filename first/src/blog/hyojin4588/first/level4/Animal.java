package blog.hyojin4588.first.level4;

public class Animal {
	
	// 멤버 필드에요
	private String name;
	private String type; //포유류, 조류, 어류
	// 멤버 필드여요
	
	// 생성자에용
	public Animal(String i, String j) {
		this.name = i;
		this.type = j;
	}
	// 생성자에용
	
	// 객체 메소드에요
	void crying() {
		System.out.println("나 운다~~");
	}
	
	void eat() {
		System.out.println("나 먹는다~~");
	}
	
	void whoAmI() {
		System.out.printf("나는 %s이고 %s여요.\n", type, name);
	}
	// 객체 메소드여요

}
