package blog.hyojin4588.first.mission;

public class Mission6_5 {

	public static void main(String[] args) {

		int star = 3;
		
		/*
		for (int i = 0; i < star; i++) {
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		for (int i = 0; (star * star) > i; i++) {
			System.out.print("*");
			if ((i + 1) % star == 0) {
				System.out.println();
			}
		}

	}

}
