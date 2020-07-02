package blog.hyojin4588.third;

import java.util.ArrayList;

public class C_Player extends B_Deck {
	
	static ArrayList<String> myCards = new ArrayList<String>();
	
	public static void drawMyCards() {
		String[] strTemp1 = drawCard();
		String strTemp2 = strTemp1[0] + " " + strTemp1[1];
		myCards.add(strTemp2);
	}
	
	public static void showMyCards() {
		for (int i = 0; i < myCards.size(); i++) {
			System.out.print(myCards.get(i));
		}
	}

}
