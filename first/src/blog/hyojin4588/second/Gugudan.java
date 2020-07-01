package blog.hyojin4588.second;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// gugudan(2, 5);
		Gugudan a = new Gugudan();
		a.gugudan(2, 5);
	}

	public void gugudan(int startNum, int endNum) {
		for (; startNum <= endNum; startNum++) {
			for (int i = 1; i < 10; i++) {
				if ((startNum * i) % 2 == 0) {
					System.out.printf("%d * %d = %d\n", startNum, i, startNum * i);
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
