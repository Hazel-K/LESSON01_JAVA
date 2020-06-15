package blog.hyojin4588.first;

public class PirntF {
	public static void main (String[] args) {
		int age = 31;
		String name = "김효진";
		float vision = 1.4f;
		char bloodType = 'O';
		
		System.out.println("나의 이름은 " + name + "입니다. 나의 나이는 " + age + "입니다. 나의 시력은 " + vision + "입니다. 나의 혈액형은 " + bloodType + "형입니다.");
		// 여러 자료형이 합쳐질 경우, 모든 자료형은 String으로 귀결된다.
		
		System.out.printf("나의 이름은 %s입니다. 나의 나이는 %,d입니다. 나의 시력은 %.1f입니다. 나의 혈액형은 %c형입니다.\n",name, age, vision, bloodType);
		// 전부 %s로 할 수 있지만 숫자들이 갖는 기능적인 부분은 사용할 수 없다.
		
		char v1 = 'A';
		System.out.printf("%c : %d\n", v1, (int)v1);
		
		byte v2 = 66;
		System.out.printf("%c : %d\n", (char)v2, v2);
	}
}