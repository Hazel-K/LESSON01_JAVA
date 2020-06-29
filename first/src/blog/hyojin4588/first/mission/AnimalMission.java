package blog.hyojin4588.first.mission;

import blog.hyojin4588.first.level5.Animal;
import blog.hyojin4588.first.level5.Cat;
import blog.hyojin4588.first.level5.Dog;
import blog.hyojin4588.first.level5.Sparrow;

public class AnimalMission {
	
	public static void main() {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Sparrow spa = new Sparrow();
		
		doCry(dog);
		doCry(cat);
		doCry(spa);
	}
	
	public static void doCry(Animal i) {
		i.cry();
	}

}