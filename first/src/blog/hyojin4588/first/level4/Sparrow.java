package blog.hyojin4588.first.level4;

public class Sparrow extends Birds{
	
	public Sparrow(String i) {
		super(i);
	}
	
	// 객체 메소드에요
	@Override
	void crying() {
		super.crying();
		System.out.println("GGBYBE");
	}
	// 객체 메소드에요

}
