package blog.hyojin4588.first.mission;

import java.util.Scanner;

public class GreatMission2 {

	public static void main(String[] args) {

		String[] arrMenu = { "사이다", "콜라", "환타", "마운틴듀", "초코우유", "바나나우유" }; // 메뉴 입력
		int[] arrPrice = { 500, 600, 700, 800, 400, 400 }; // 가격 입력

		int iInput = 0; // 받아올 입력값을 저장하는 변수
		int iSum = 0; // 받아올 가격을 저장하는 변수
		Scanner scan = new Scanner(System.in); // 스캔 기능 변수 설정

		// 메뉴 출력
		System.out.println("-메뉴-");
		for (int i = 0; i < arrMenu.length; i++) {
			if (i == 0) {
				continue;
			}
			System.out.print((i) + ". " + arrMenu[i] + " (" + arrPrice[i] + "원)\n");
		}
		// 메뉴 출력 끝

		// 반복문 시작
		while (true) {

			// 안내문 출력
			System.out.println("메뉴를 선택하세요.(종료하시려면 0번을 눌러주세요) : ");
			iInput = scan.nextInt();
			// 안내문 출력 끝

			// 오류 배제문
			while (iInput < 0 || iInput > arrMenu.length) {
				System.out.println("잘못된 숫자를 입력하셨습니다. 번호를 올바르게 입력해주세요. (종료는 0번 입력)");
				iInput = scan.nextInt();
			}
			// 오류 배제문 끝

			// 탈출 조건문
			if (iInput == 0) {
				break;
			}
			// 탈출 조건문 끝

			// 입력 메뉴 및 가격 표시문
			System.out.println(arrMenu[iInput - 1] + " (" + arrPrice[iInput - 1] + "원)");
			iSum += arrPrice[iInput]; // 입력받은 가격을 변수에 합산
			// 입력 메뉴 및 가격 표시문 끝

		}
		// 반복문 끝

		// 결과문 출력
		System.out.println("\n종료! " + iSum + "원 사용");
		// 결과문 출력 끝

		scan.close(); // 스캔 기능 종료
	}

}
