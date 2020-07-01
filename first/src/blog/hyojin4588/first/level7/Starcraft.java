package blog.hyojin4588.first.level7;

public class Starcraft {
	
	public static void main(String[] args) {
		Marine m1 = new Marine();
		System.out.println(m1 + ", 공격력 : " + m1.getterDamage());
		
		Marine m2 = new Marine();
		m2.attack(m1);
		m1.attack(m1);
		System.out.println(m1);
		
		Firebat f1 = new Firebat();
		f1.attack(m1);
		f1.attack(m1);
		f1.attack(m1);
		System.out.println(m1);
		
		// System.out.println(f1 instanceof Treatable);
		
		Medic md1 = new Medic();
		md1.heal(m1);
		md1.heal(f1);
		System.out.println(m1);
		System.out.println(f1);
	}

}
