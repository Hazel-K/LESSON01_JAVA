package blog.hyojin4588.first;

public class Operator7 {
	public static void main(String[] args) {
		int n1 = 5, n2 = 5, n3 = 6;
		
		System.out.println(n1 == n2 && n2 == n3 && n3 == n1); // and 연산자는 true 나오기가 힘듬. false가 하나라도 있으면 무조건 false를 출력
		System.out.println(n1 == n2 || n2 == n3 || n3 == n1); // or 연산자는 false 나오기가 힘듬. true가 하나라도 있으면 무조건 true 출력.
		// 비트연산자(&,|,^)의 경우 앞의 조건을 충족하더라도 굳이 모두 비교하기 때문에 퍼포먼스가 느려질 수 있음.
	}
}