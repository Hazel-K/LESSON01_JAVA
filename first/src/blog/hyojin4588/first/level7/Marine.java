package blog.hyojin4588.first.level7;

public class Marine extends Unit implements AttackUnit {
	
	private int damage;
	
	public Marine() {
		super("마린", 50);
		damage = 5;
	}
	
	@Override
	public void attack(Unit u) {
		if (this == u) {
			
		} else {
		System.out.println("따다다다");
		u.getDamage(damage);
		}
	}
	
	public int getterDamage() {
		return damage;
	}

}
