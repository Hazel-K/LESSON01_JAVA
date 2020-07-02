package blog.hyojin4588.third;

import java.util.ArrayList;

public class B_Deck {

	static ArrayList<Integer> spade = new ArrayList<Integer>();
	static ArrayList<Integer> clover = new ArrayList<Integer>();
	static ArrayList<Integer> diamond = new ArrayList<Integer>();
	static ArrayList<Integer> heart = new ArrayList<Integer>();
	

	public static void initCard() {
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
	
	public static String[] drawCard() {
		ArrayList<Integer> tempDeck = new ArrayList<Integer>();
		String[] strI = new String[2];
		int iRand = (int)(Math.random() * 4);
		switch (iRand) {
		case 0:
			tempDeck = spade;
			strI[0] = "♠";
			int jRand = (int)(Math.random() * tempDeck.size());
			strI[1] = String.format("%d", tempDeck.get(jRand));
			tempDeck.remove(tempDeck.get(jRand));
			spade = tempDeck;
			break;
		case 1:
			tempDeck = clover;
			strI[0] = "♣";
			jRand = (int)(Math.random() * tempDeck.size());
			strI[1] = String.format("%d", tempDeck.get(jRand));
			tempDeck.remove(tempDeck.get(jRand));
			clover = tempDeck;
			break;
		case 2:
			tempDeck = diamond;
			strI[0] = "◆";
			jRand = (int)(Math.random() * tempDeck.size());
			strI[1] = String.format("%d", tempDeck.get(jRand));
			tempDeck.remove(tempDeck.get(jRand));
			diamond = tempDeck;
			break;
		case 3:
			tempDeck = heart;
			strI[0] = "♥";
			jRand = (int)(Math.random() * tempDeck.size());
			strI[1] = String.format("%d", tempDeck.get(jRand));
			tempDeck.remove(tempDeck.get(jRand));
			heart = tempDeck;
			break;
		}
		return strI;
	}

}