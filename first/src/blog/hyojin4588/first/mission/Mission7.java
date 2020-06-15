package blog.hyojin4588.first.mission;

import java.util.Scanner;

public class Mission7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int iSum = 0;

		while (true) {
			System.out.print("숫자를 입력(0을 입력 시 종료): ");
			int iNum = scan.nextInt();
			/*
			if (iNum != 0) {
				iSum += iNum; // 누적합하라는 커맨드, iSum = (iSum + iNum);
			} else {
				System.out.println("합계 : " + iSum);
				break;
			}
			*/
			if (iNum == 0) {
				break;
			}
			iSum += iNum;
		}
		System.out.println("합계 : " + iSum);
		scan.close();

	}

}
