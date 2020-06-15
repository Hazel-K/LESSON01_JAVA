package blog.hyojin4588.first.mission;

import java.util.Scanner; // ctrl + shift + O

public class Mission2 {

	public static void main(String[] args) {
		/*
			스캐너로 정수값 하나 입력 받고
			그 값의 홀수면 "홀수입니다."
			그 값이 짝수면 "짝수입니다."
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int n = scan.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		System.out.println("홀수입니다.");
		scan.close();
	}
}