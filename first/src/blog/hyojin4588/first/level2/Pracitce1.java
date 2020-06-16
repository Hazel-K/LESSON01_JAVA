package blog.hyojin4588.first.level2;

public class Pracitce1 {

	public static void main(String[] args) {

		int[] arr = { 29, 33, 15, 88, 2, 46, 92, 1, 19 };

		System.out.println("i j");
		for (int i = 0; i < arr.length; i++) { // 0 ~ 8

			for (int j = 0; j < arr.length; j++) { // 0 ~ 8
				
				System.out.print(i + " " + j);
				System.out.println();

			}

		}

	}

}
