package blog.hyojin4588.first.mission;

public class MethodMission1 {
	
	public static void main (String[] args) {
		// gugudan(5); // 구구단 5단을 출력
		// System.out.println();
		// gugudan(2); // 구구단 2단을 출력
		gugudan(4, 2);
	}
	
	public static void gugudan (int iNum1, int iNum2) {
		
		if (iNum1 > iNum2) {
			int iTemp = iNum1;
			iNum1 = iNum2;
			iNum2 = iTemp;
		}
		
		for (int i = iNum1; i <= iNum2; i++) {
			gugudan(i);
			System.out.println();
		}
		
	}
	
	public static void gugudan (int iNum) {
		
		for (int i = 1; i < 10; i++) {
			System.out.println(iNum + " * " + i + " = " + (iNum * i));
		}
		
	}
	
	// Overloading과 Overriding
	// 오버로딩 : 이름이 같은 Method를 여러 개 만드는 것
	// 오버라이딩 : 이름이 같은 Method를 여러 개 사용하는 것
	// 파라미터(매개변수 등)가 다르다면 같은 이름으로도 Method를 만드는 것이 가능하다.

}
