package blog.hyojin4588.first;

public class Operator2 {
	public static void main(String[] args) {
		int n1 = 10, n2 = 10;
		
		int result = n1++;
		System.out.println(result);
		System.out.println("n1 : " + n1); // result 값을 출력 후 값을 증가시킨다.
		
		int result2 = ++n2;
		System.out.println(result2);
		System.out.println("n2 : " + n2); // result2 값을 증가시킨 후 출력한다.
	}
}
