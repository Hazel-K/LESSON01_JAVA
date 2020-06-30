package blog.hyojin4588.first.level7;

public interface AttackUnit {
// 인터페이스 이름은 형용사로 많이 짓는다
// 인터페이스 끼리의 상속은 extends, 클래스가 인터페이스를 상속할 때는 implements
// 인터페이스와 추상클래스 모두 부모 역할만 한다. 상속만 가능
// 이름을 함부로 바꿀 수 없으므로, 실수를 배제하기 용이하다.
	void attack(Unit u);

}
