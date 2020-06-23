package blog.hyojin4588.first.baseball;

import java.util.Scanner;

public class Initializer {

	// Member Field
	static Scanner scan = new Scanner(System.in); // 값을 입력받게 도와주는 변수
	static int answer = 0; // 정답의 자리수를 저장하는 변수
	static int[] answerArr = new int[answer]; // 자리수만큼의 정답 배열을 저장하는 변수
	static int[] myArr = new int[answer]; // 자리수만큼의 나의 배열을 저장하는 변수
	static int tryCnt = 0; // 시도한 횟수를 저장하는 변수
	static int strike = 0; // 스트라이크 개수
	static int ball = 0; // 볼 개수
	static int out = 0; // 아웃 개수
	// Member Field

	// Constructor
	// Constructor

	// Entity Method
	public static void runGame() {
		openMent();
		answerIs();
		answerSet();
		while (true) {
			// for (int i : answerArr) {System.out.print(i + " ");} // 정답 확인 구문
			myAnswer();
			compareStart();
			compareEnd();
			if (strike == answer) {
				congratMent();
				break;
			}
			String reStart = scan.next();
			if ("ㄱ".equals(reStart) || "r".equals(reStart) || "R".equals(reStart)) {
			} else {
				break;
			}
		}
	}

	private static void openMent() {
		Notice.openMent();
	}

	private static void answerIs() {
		answer = InputNum.answerIs();
	}

	private static void answerSet() {
		answerArr = AGenerator.answerSet(answer);
	}

	private static void myAnswer() {
		myArr = InputNum.myAnswer();
	}

	private static void compareStart() {
		Compare.compareStart();
		Notice.checkMent();
	}

	private static void compareEnd() {
		Notice.resultMent();
	}

	private static void congratMent() {
		Notice.congratMent();
	}
	// Entity Method

}
