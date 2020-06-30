package blog.hyojin4588.first.level7;

public class Unit {
	
	public final String NAME;
	public final int MAX_HP;
	// final은 생성자 생성 시 값이 반드시 들어가야 한다.
	private int current_hp;
	
	public Unit(String name, int max_hp) {
		this.NAME = name;
		this.MAX_HP = max_hp;
		this.current_hp = max_hp;
	}
	
	public void move(int x, int y) {
		System.out.printf("x:%d, y:%d 좌표로이동\n", x, y);
	}
	
	public void getDamage(int damage) {
		current_hp -= damage;
	}
	
	public int getCurrent_hp() {
		return current_hp;
	}
	
	@Override
	public String toString() {
		return String.format("이름 : %s, 체력 : %,d/%,d", NAME, current_hp, MAX_HP);
	}

}
