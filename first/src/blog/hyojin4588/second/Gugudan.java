package blog.hyojin4588.second;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan(2, 5);
	}

	public static void gugudan(int a, int b) {
		for (; a <= b; a++) {
			for (int i = 1; i < 10; i++) {
				if ((a * i) % 2 == 0) {
					System.out.printf("%d * %d = %d\n", a, i, a * i);
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
