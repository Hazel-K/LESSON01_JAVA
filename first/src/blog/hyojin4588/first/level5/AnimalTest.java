package blog.hyojin4588.first.level5;

public class AnimalTest {
	
	public static void main(String[] args) {		
		Animal ani = new Dog();
		ani.cry();
		ani = new Cat();
		ani.cry();
		// ani.sleep();
		
		Cat cat = new Cat();
		cat.sleep();
		Cat cat2 = (Cat)ani;
		cat2.sleep();
	}

}