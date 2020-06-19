package blog.hyojin4588.first.level2;

public class Method4 {
	
	public static void main (String[] args) {
		
		sum(4, 5);
		sum(4, 5, 7);
		sum(4, 5, 8, 8);
		
	}
	
	public static void sum (int ...arr) { // ...arr 앞자리에 다른 변수 삽입도 가능
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			
			sum += arr[i];
			
		}
		System.out.println("sum : " + sum);	
	} // 가변인자 사용 방법

}
