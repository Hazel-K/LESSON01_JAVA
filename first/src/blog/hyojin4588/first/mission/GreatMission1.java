package blog.hyojin4588.first.mission;

import java.util.Scanner;

public class GreatMission1 {

	public static void main(String[] args) {
		/* 숫자 야구 게임 */

		final int LEN = 3; // 상수로서 배열 길이 지정
		int[] rArr = new int[LEN]; // 랜덤한 값을 받아올 수 있는 상수 크기만큼의 배열을  생성
		int[] myArr = new int[LEN]; // 입력한 값을 받아올 수 있는 상수 크기만큼의 배열을  생성

		int iStr = 0; // strike 개수
		int iBal = 0; // ball 개수
		int iOut = 0; // out 개수
		int iTry = 0; // 시도 횟수

		Scanner scan = new Scanner(System.in); // 스캔 기능 사용하기 위한 scan 변수 지정

		// 정답인 숫자 생성기
		for (int i = 0; i < LEN; i++) {
			rArr[i] = (int) (Math.random() * 9 + 1); // 1 ~ 9 까지의 랜덤한 숫자를 생성하는 변수 지정
			for (int j = 0; j < i; j++) {
				if (rArr[i] == rArr[j]) {
					i--;
					break;
				}
			}
		}
		// 정답인 숫자 생성기 끝

		// 정답 확인용 출력 구문
		System.out.print("정답 : ");
		for (int k : rArr) {
			System.out.print(k + " ");
		}
		System.out.println();
		// 정답 확인용 출력 구문 끝
	
		System.out.print("숫자 야구 시작. "); // 시작 구문 출력
		
		// 반복문 시작
		while (iStr != LEN) {
			
			iTry++; // 반복 시 시도 횟수 증가
			iStr = 0; // 반복 시 이전 값 초기화
			iBal = 0; // 반복 시 이전 값 초기화
			iOut = 0; // 반복 시 이전 값 초기화
			
			System.out.println(iTry + "번째 시도"); // 시도 구문 출력

			// 숫자 입력받기
			for (int i = 0; i < LEN; i++) {
				System.out.println((i + 1) + "번째 숫자 입력(1 ~ 9) : ");
				myArr[i] = scan.nextInt();
			}
			// 숫자 입력받기 끝

			// 숫자 확인하기
			for (int i = 0; i < LEN; i++) {
				for (int j = 0; j < LEN; j++) {
					if (rArr[i] == myArr[j]) {
						if (i == j) {
							iStr++;
						} else {
							iBal++;
							iOut--;
						}
					} else {
						if (i == j) {
							iOut++;
						}
					}
				}
			}
			// 숫자 확인하기 끝

			// 결과 출력하기
			System.out.println();
			System.out.println("S : " + iStr + " / B : " + iBal + " / O : " + iOut); // 혹은 out = (rArr.length - str - bal)로 치환 가능
			// 결과 출력하기 끝
			
			// 다시 시작 시 출력 문구
			if (iStr != LEN) {
				System.out.println();
				System.out.println("다시 시도해봅시다.");
			}
			// 다시 시작 시 출력 문구 끝
			
		}
		// 반복문 끝
		
		System.out.println();
		System.out.println("축하드립니다! 성공하셨습니다."); //모든 과정 완료
		scan.close(); // 스캔 닫기
		
	}
}
