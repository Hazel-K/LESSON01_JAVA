package blog.hyojin4588.first.mission;

import java.util.Scanner;

public class GreatMission1 {

	public static void main(String[] args) {
		/* 숫자 야구 게임 */

		final int LEN = 3;
		int[] rArr = new int[LEN];
		int[] myArr = new int[LEN];

		int str = 0; // 스트라이크 개수
		int bal = 0; // bal 개수
		int out = 0; // out 개수

		Scanner scan = new Scanner(System.in); // 스캔 기능 사용하기 위한 scan 변수 지정

		// 정답인 숫자 생성기
		// iGenerator를 이용해서 중복되지 않은 값을 rArr에 저장
		for (int i = 0; i < rArr.length; i++) {
			rArr[i] = (int) (Math.random() * 9 + 1); // 1 ~ 9 까지의 랜덤한 숫자를 생성하는 변수 지정
			for (int j = 0; j < i; j++) {
				if (rArr[i] == rArr[j]) {
					i--;
					break;
				}
			}
		} // 정답인 숫자 생성기 끝

		// 정답 확인용 출력 구문
		System.out.print("정답 : ");
		for (int k : rArr) {
			System.out.print(k + " ");
		}
		System.out.println();
		// 정답 확인용 출력 구문 끝
	
		// 반복문 시작
		while (str != 3) {
			str = 0; // 반복 시 이전 값 초기화
			bal = 0; // 반복 시 이전 값 초기화
			out = 0; // 반복 시 이전 값 초기화

			// 숫자 입력받기
			for (int i = 0; i < myArr.length; i++) {
				System.out.println((i + 1) + "번째 숫자 입력(1 ~ 9) : ");
				myArr[i] = scan.nextInt();
			}
			// 숫자 입력받기 끝

			// 숫자 확인하기
			for (int i = 0; i < rArr.length; i++) {
				for (int j = 0; j < myArr.length; j++) {
					if (rArr[i] == myArr[j]) {
						if (i == j) {
							str++;
						} else {
							bal++;
							out--;
						}
					} else {
						if (i == j) {
							out++;
						}
					}
				}
			}
			// 숫자 확인하기 끝

			// 결과 출력하기
			System.out.println("S : " + str + " B : " + bal + " O : " + out); // 혹은 out = (rArr.length - str - bal)로 치환 가능
			// 결과 출력하기 끝
			
			// 다시 시작 시 출력 문구
			if (str != 3 ) {
				System.out.println();
				System.out.println("다시 시도해봅시다.");
			}
			// 다시 시작 시 출력 문구 끝
		} // 반복문 끝
		System.out.println();
		System.out.println("축하드립니다! 성공하셨습니다."); //모든 과정 완료
	}
}
