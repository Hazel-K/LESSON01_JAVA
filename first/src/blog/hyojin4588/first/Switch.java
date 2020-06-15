package blog.hyojin4588.first;

public class Switch {
	public static void main(String[] args) {
		
		int num = 4;
		
		switch (num) {
		case 1:
			System.out.println("1"); // 진입했다면 break; 구문을 만나기 전까지 다음 케이스를 계속해서 실행한다.
			break;
			
		case 2:
			System.out.println("2");
			break;
			
		case 3:
			System.out.println("3");
			break;
			
		default:
			System.out.println("nothing"); // default값을 설정하지 않았다면 아무것도 출력되지 않는다.
			break;
		// 문자열을 비교할 때 equals를 사용하지 않아도 되므로 문자열 비교에 주로 쓰인다.
		}
	}
}
