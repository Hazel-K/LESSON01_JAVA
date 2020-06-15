package blog.hyojin4588.first.mission;

import java.util.Scanner;

public class Mission3_1 {
	public static void main(String[] args) {
		/*
			성별을 입력해주세요(남/여) : 
			키를 입력해주세요 : 
			남자 기준 : 160
			여자 기준 : 150
			"평균 이하입니다."
			"평균입니다."
			"평균 초과입니다."
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력해주세요(남/여) : ");
		String gender = scan.next();
		System.out.println("키를 입력해주세요 : ");
		int height = scan.nextInt();
		scan.close();
		
		if ("남".equals(gender) || "여".equals(gender)) {
			
			int standHeight = 150; // 변수를 초기화하는 것을 잊지 말기
			
			if ("남".equals(gender)) {
				standHeight = 160;
			}
			
			if(height > standHeight) {
				System.out.println("평균 초과입니다.");
			} else if (height < standHeight) {
				System.out.println("평균 미만입니다.");
			} else {
				System.out.println("평균입니다.");
			}
			
		} else {
			System.out.println("성별을 잘못 입력하셨습니다. 다시 입력해주세요.");
		}
	}
}