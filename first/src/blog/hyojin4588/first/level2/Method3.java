package blog.hyojin4588.first.level2;

public class Method3 {
	
	public static void main (String[] args) {
		
		int result = sum(15,10);
		
		System.out.println(result);
		System.out.println(minus(20,5));
		
	}
	
	public static int sum (int iNum1, int iNum2) {
		
		return iNum1 + iNum2;
		
	} // void형은 연산값을 호출자에게 전달해주지 않는다. 비 void형은 return; 이 필수다.
	
	public static int minus (int iNum1, int iNum2) {
		
		return iNum1 - iNum2;
		
	}

}
