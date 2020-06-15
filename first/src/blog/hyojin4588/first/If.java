package blog.hyojin4588.first;

public class If {
	public static void main(String[] args) {
		int n1 = 30, n2 = 20;
		if(n1 > n2) // 조건절이 false인 경우 연산하지 않고 바로 아래로 내려간다.
		{
			System.out.println("n1이 n2보다 크다.");
		}
		else if(n1 == n2) // if의 조건절의 false인 경우 else if 조건절을 검증한다.
		{
			System.out.println("n1과 n2는 같다.");
		}
		else // 위 조건절을 만족하지 않으면 else문을 실행한다. else가 만약 없다면 아무것도 실행하지 않는다.
		{
			System.out.println("n1이 n2보다 작다.");
		}
	}
}