package blog.hyojin4588.first;

public class ConditionOperator {
	
	public static void main (String[] args) {
		int num = 3;
		boolean isOdd = num % 2 == 1 ? true : false; // (== ?조건식), 참일 경우 값 : 거짓일경우 값
		System.out.printf("%d is odd? %b\n", num, isOdd);
	}
	
}
