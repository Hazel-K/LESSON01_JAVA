package blog.hyojin4588.first.level4;

public class AnimalTest {
	
	public static void main(String[] args) {
	// Animal animal = new Animal();
	Sparrow sparrow = new Sparrow("참새");
	Birds wildGoose = new Birds("기러기");
	
	sparrow.whoAmI();
	wildGoose.whoAmI();
	// Sparrow sparrow = new Sparrow();
	
	// animal.crying();
	// bird.crying();
	// bird.flying();
	// sparrow.crying();
	
	// 둘 다 같은 메소드를 호출할 수 있음. 상속받은 사람은 점점 메소드가 늘어난다.
	// 둘 다 같은 이름의 같은 인자 메소드를 만들 경우, 자기에게 가장 가까운 메소드로 오버라이딩된다.
	
	// 상속 관계 특징
	// 부모 타입은 자식 객체 주소값을 저장할 수 있다. (가리킬 수도 있다.)
	// 자식타입은 부모 객체 주소값을 저장할 수 없다.
	Animal wawa = new Birds("와와"); // 이게 가능함
	Animal waw = new Sparrow("와와"); // 반대는 안된다.
	// 타입은 메소드를 호출할 수 있느냐 없느냐만을 호출한다. (자기가 알고 있는 메소드만을 호출)
	// 호출했을 때는 객체 기준으로 실행된다.
	}

}
