package blog.hyojin4588.first;

public class Operator6 {
	public static void main(String[] args) {
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		
		System.out.println(str1 == str2); // 잘못된 사용 방법, 1.8 이전의 버전은 false 값을 출력했음. text의 주소값을 비교하므로 같은 문자열이라도 주소값이 다르면 false를 출력
		System.out.println(str1.equals(str2)); // 자바의 고유한 방법. 메소드를 사용하여 text를 비교해야함
		// 참조 변수끼리의 비교는 같은 참조 주소를 갖고 있느냐를 비교하게 됨. 자바에서 값을 비교하기 위한 유일한 방법은 equals 메소드를 이용해야만 할 수 있다.
	}
}