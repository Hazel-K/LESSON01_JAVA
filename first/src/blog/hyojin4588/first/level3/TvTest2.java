package blog.hyojin4588.first.level3;

public class TvTest2 {
	
	public static void main(String[] args) {
		
		Tv tv1 = new Tv();
		Tv tv2 = tv1; // tv1, tv2 두 변수가 가리키는 곳은 똑같다.
		// tv1의 주소값을 복사하여 tv2에다가 붙여주는 셈.
		
		tv1.channalUp();
		tv2.channalUp();
		
		System.out.println("tv1 : " + tv1.channel);
		System.out.println("tv2 : " + tv2.channel);
		
	}

}
