package blog.hyojin4588.first.mission;

public class MethodMission3 {
	
	public static void main (String[] args) {
		
		int result = abs(10);
		System.out.println(result);
		
		result = abs(-10);
		System.out.println(result);
		
	}
	
	public static int abs(int iNum) {
		
		return iNum < 0 ? -iNum : iNum;
		
	}

}
