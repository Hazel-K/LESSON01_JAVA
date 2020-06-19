package blog.hyojin4588.first.level3;

public class TvTest {
	
	public static void main(String[] args) {
		
		Tv tv1 = new Tv(); // new Name(); 객체 생성 시 필요한 커맨드, 나는 Tv 객체 안의 주소값만 저장을 하겠다는 의미.
		// 나는 레퍼런스라서 (객체이므로, Tv) 레퍼런스 주소 안의 주소값만을 저장할 수 있다는 의미.
		// String varName; 의 경우 String객체 안의 주소값만 저장하겠다는 의미.
		// 객체의 주소값0을 정해주지 않으면 JAVA GC가 메모리가 부족할 때에 Tv 객체를 배제하게 되므로 프로그램이 종료될 때까지 배제되지 않도록 레퍼런스 주소값을 지정해줄 필요가 있음.
		// (); 기본생성자 호출 커맨드. 만들지 않더라도 자동으로 들어가게 하는 호출법.
		
		System.out.println("name : " + tv1.name);
		System.out.println("power : " + tv1.power);
		System.out.println("channel : " + tv1.channel);
		System.out.println("------------------------");
		tv1.name = "삼성TV";
		System.out.println("name : " + tv1.name);
		tv1.changePower(); // void형 메소드에서는 앞에 "="을 붙여서는 안된다.
		System.out.println("power : " + tv1.power);
		
	}

}
