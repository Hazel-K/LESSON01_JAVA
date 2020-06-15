package blog.hyojin4588.first.mission;

import java.util.Scanner;

public class Mission5 {
	/*
	 * 점수를 입력해주세요(0 ~ 100) : 90점 이상 A 80점 이상 B 70점 이상 C 나머지는 D입니다. 일의 자리 수가 7점 이상이면
	 * + 일의 자리 수가 3점 이하이면 -
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력해주세요(0 ~ 100) : ");
		String strScore = scan.next();
		int intScore = Integer.parseInt(strScore);

		while (intScore > 100 || intScore < 0) {
			System.out.println("점수는 0점 미만이거나 100점을 초과할 수 없습니다. 다시 입력해주세요.");
			System.out.println("점수를 입력해주세요(0 ~ 100) : ");
			strScore = scan.next();
			intScore = Integer.parseInt(strScore);
		}
		scan.close();

		// 점수 구간
		int perfect = 100;
		int gradeA = 90;
		int gradeB = 80;
		int gradeC = 70;
		int gradePlus = 7;
		int gradeMinus = 3;

		if (intScore == perfect) {
			System.out.println("A++"); // 골든정답, 예비대학원생
		} else {
			if (intScore >= gradeA) {
				System.out.print("A");
			} else if (intScore >= gradeB) {
				System.out.print("B");
			} else if (intScore >= gradeC) {
				System.out.print("C");
			} else {
				System.out.println("D");
			}

			if (intScore >= gradeC) {
				if ((intScore % 10) >= gradePlus) {
					System.out.println("+");
				} else if ((intScore % 10) <= gradeMinus) {
					System.out.println("-");
				}
			}
		}

	}
}