package blog.hyojin4588.first.mission;

public class Mission6_7 {

	public static void main(String[] args) {

		int star = 5;
		/*
		for (int i = 1; i <= star; i++) {
			for (int j = 0; j < (star - i); j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		for (int i = 1; i <= star; i++) { // 1 2 3 4 5
			for (int j = star; j > 0; j--) { // 5 4 3 2 1
				System.out.print(i < j ? " " : "*");
			}
			System.out.println();
		}
		
	}

}
