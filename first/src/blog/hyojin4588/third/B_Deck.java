package blog.hyojin4588.third;

import java.util.ArrayList;

public class B_Deck {

	ArrayList<Integer> spade = new ArrayList();
	ArrayList<Integer> clover = new ArrayList();
	ArrayList<Integer> diamond = new ArrayList();
	ArrayList<Integer> heart = new ArrayList();

	public void initCard() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				switch (i) {
				case 0:
					spade.add(j + 1);
					break;
				case 1:
					clover.add(j + 1);
					break;
				case 2:
					diamond.add(j + 1);
					break;
				case 3:
					heart.add(j + 1);
					break;
				}
			}
		}
	}

}
