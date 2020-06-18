package blog.hyojin4588.first.mission;

public class MethodMission2 {
	
	public static void main (String[] args) {
		
		printStar(6); // ******
		printStar(3); // ***
		
		printStarSqure(4); // **** * 4
		
		printStarTriangle(5); // ***** 1--
		
		printStarReverse(4); // ____* *++
		
	}
	
	public static void printStarReverse (int iNum) {
		
		for (int i = 1; i <= iNum; i++) {
			printString(" ", iNum - i);
			printString("*", i);
			System.out.println();
		}
		
	}
	
	public static void printStarTriangle (int iNum) {
		
		for (int i = 1; i <= iNum; i++) {
			printStar(i);
		}
		
	}
	
	public static void printStarSqure (int iNum) {
		
		for (int i = 0; i < iNum; i++) {
			printStar(iNum);
		}
		
	}
	
	public static void printStar (int iNum) {
		
		for (int i = 0; i < iNum; i++) {
			System.out.print("*");
		}
		System.out.println();
		
	}

	public static void printString (String iStr, int iNum) {
		
		for (int i = 0; i < iNum; i++) {
			System.out.print(iStr);
		}
		
	}
	
}
