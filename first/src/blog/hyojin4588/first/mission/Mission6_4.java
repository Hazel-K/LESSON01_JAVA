package blog.hyojin4588.first.mission;

public class Mission6_4 {

	public static void main(String[] args) {

		
		for (int i = 1; i < 10; i++) { // 1에서 10까지 9번 반복
			for (int j = 2; j < 10; j++) { // 2에서 10까지 8번 반복
				System.out.printf("%d * %d = %d\t", j, i, (i*j));
			}
			System.out.println();
		}
		
		/*
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\t", j, i, (i*j));
			}
			System.out.println();
		}
		*/

	}

}