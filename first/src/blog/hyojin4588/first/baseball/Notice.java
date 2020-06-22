package blog.hyojin4588.first.baseball;

public class Notice {
	// 안내문 출력 클래스입니다. 원하는 안내문을 void형으로 출력합니다.

	// Member Field
	// Member Field

	// Constructor
	// Constructor

	// Entity Method
	// 시작 멘트
	public static void openMent() {
		System.out.println(" --- 숫자 야구 게임 ---");
		System.out.println("숫자 야구 게임을 진행합니다.");
		System.out.println("맞출 숫자의 개수를 입력해주세요.");
	}

	// 비교 멘트
	public static void checkMent() {
		System.out.println("도전 횟수 : " + Initializer.tryCnt + "회");
		System.out.printf("결과 :::  Strike : %d  Ball : %d  Out : %d\n", Initializer.strike, Initializer.ball,
				Initializer.out);
	}

	// 결과 멘트
	public static void resultMent() {
		if (Initializer.strike != Initializer.answer) {
			System.out.println("\n\n다시 시도하시려면 R 혹은 'ㄱ'을 눌러주세요.\n");
		}
	}

	public static void congratMent() {
		if (Initializer.strike == Initializer.answer) {
			System.out.printf("\n\n축하드립니다! %d회 만에 성공하셨습니다.", Initializer.tryCnt);
		}
	}
	// Entity Method

}