package blog.hyojin4588.first.level2;

import java.util.Random;

public class Practice3 {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			
			Random rand = new Random();
			// int ran1 = (int)(Math.random() * 3 + 1);
			int ran2 = rand.nextInt(3) + 1;

			// System.out.print(ran1 + " ");
			System.out.print(ran2 + " ");
			
		}
		
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			
			Random rand = new Random();
			int ran1 = (int)(Math.random() * 3 + 1);
			// int ran2 = rand.nextInt(3) + 1;

			System.out.print(ran1 + " ");
			// System.out.print(ran2 + " ");
			
		}

	}

}
