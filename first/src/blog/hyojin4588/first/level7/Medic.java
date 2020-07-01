package blog.hyojin4588.first.level7;

public class Medic extends Unit implements Treatable {

	public Medic() {
		super("메딕", 70);
	}

	public void heal(Unit u) {
		if (!(u instanceof Treatable) || this == u) {
			System.out.println("이 유닛을 치료할 수 없습니다.");
		} else {
			System.out.println("히이일");
			while (u.getCurrent_hp() < u.MAX_HP) {
				u.setCurrent_hp(1);
			}
		}
	}
	
}
