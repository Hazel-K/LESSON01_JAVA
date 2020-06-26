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
	}

}
