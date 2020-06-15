package blog.hyojin4588.first.mission;

public class Mission7_2 {

	public static void main(String[] args) {
		/*
			while문에 조건식 사용하여 1~100을 모두 더한 값이 출력되도록 하세요 합계 : 5050
		*/
		int iNum = 0, iSum = 0;

		
		while (iNum <= 100) {
			iSum += iNum++;
		}
		System.out.println("합계 : " + iSum);

		/*
		while (true) {
			if (iNum >= 100) {
				break;
			}
			iSum += ++iNum;
		}
		System.out.println("합계 : " + iSum);
		*/
	}
	
}