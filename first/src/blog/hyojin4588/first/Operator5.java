package blog.hyojin4588.first;

public class Operator5 {
	public static void main(String[] args) {
		// 비교연산자 > boolean
		int n1 = 10;
		int n2 = 11;
		boolean result = (n1 == n2);
		
		System.out.println(n1 == n2); // 같은지 물어보는 비교연산자
		System.out.println(result);
		System.out.println(!result); // 결과값 반전
		System.out.println(!!result); // 결과값 재반전
		System.out.println(n1);
		
		System.out.println(n1 != n2); // 다른지를 물어보는 비교연산자
		
		System.out.println("n1 > n2 : " + result);
		
		result = (n2 >= n1);
		System.out.println("n2 > n1 : " + result);
		
		String r1 = "aaaa";
		String r2 = "aaa";
		
		System.out.println("문자열 비교 : " + r1.equals(r2)); // 문자열 비교하는 메소드
	}
}