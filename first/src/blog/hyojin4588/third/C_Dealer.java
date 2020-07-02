package blog.hyojin4588.third;

import java.util.ArrayList;

public class C_Dealer extends B_Deck {

	static ArrayList<String> dealerCards = new ArrayList<String>();

	public static void drawdealerCards() {
		String[] strTemp1 = drawCard();
		String strTemp2 = strTemp1[0] + " " + strTemp1[1];
		dealerCards.add(strTemp2);
	}

}
