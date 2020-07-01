package blog.hyojin4588.first.level7;

public class Firebat extends Unit implements AttackUnit{
	
	private int damage;
	
	public Firebat() {
		super("파이어뱃", 60);
		damage = 7;
	}
	
	@Override
	public void attack(Unit u) {
		if (this == u) {
		} else {
		System.out.println("퐈이얏");
		u.getDamage(damage);
		}
	}

}
