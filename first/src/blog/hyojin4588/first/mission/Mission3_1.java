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
		int manAvg = 160, femAvg = 150;
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력해주세요(남/여) : ");
		String gender = scan.next();
		System.out.println("키를 입력해주세요 : ");
		int height = scan.nextInt();
		scan.close();
		if (("남".equals(gender) == true))
		{
			if(height > manAvg)
			{
				System.out.println("평균 초과입니다.");
			}
			else if (height < manAvg)
			{
				System.out.println("평균 이하입니다.");
			}
			else
			{
				System.out.println("평균입니다.");
			}
		}
		if (("여".equals(gender) == true))
		{
			if(height > femAvg)
			{
				System.out.println("평균 초과입니다.");
			}
			else if (height < femAvg)
			{
				System.out.println("평균 이하입니다.");
			}
			else
			{
				System.out.println("평균입니다.");
			}
		}
	}
}