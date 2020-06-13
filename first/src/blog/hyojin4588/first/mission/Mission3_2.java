package blog.hyojin4588.first.mission;

import java.util.Scanner;

public class Mission3_2 {
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
		String reStart;
		
		do
		{
			int manAvg = 160, femAvg = 150;
			
			System.out.println("성별을 입력해주세요(남/여) : ");
			String gender = scan.next();
			
			while (!"남".equals(gender) && !"여".equals(gender))
			{
				System.out.println("오류! 성별을 다시 입력해주세요(남/여) : ");
				gender = scan.next();
			}
			
			System.out.println("키를 입력해주세요 : ");
			int height = scan.nextInt();
						
			boolean mB = "남".equals(gender);
			boolean wB = "여".equals(gender);
			
			if (mB)
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
			if (wB)
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
			System.out.println("다시 입력하시려면 Y를 입력하세요. : ");
			reStart = scan.next();
		}
		while ("Y".equals(reStart) || "y".equals(reStart));
		scan.close();
	}
}