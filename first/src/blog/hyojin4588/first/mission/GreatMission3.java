package blog.hyojin4588.first.mission;

public class GreatMission3 {

	public static void main(String[] args) {
		
		/*
			영어 합계 : ?, 평균 : ?
			국어 합계 : ?, 평균 : ?
			수학 합계 : ?, 평균 : ?
			전체 합계 : ?, 평균 : ?
		*/
		
		int[][] arr = {
				{90, 100, 88},	// 영어
				{34, 99, 45},	// 수학
				{98, 65, 87},	// 국어
		};
		
		int iCount = 0;
		int iEng = 0;
		int iMath = 0;
		int iKor = 0;
		int iSum = 0;
		float iEngAvg = 0;
		float iMathAvg = 0;
		float iKorAvg = 0;
		float iSumAvg = 0;
		
		for (int i = 0; i < arr.length; i++) { // arr.length = 3
			for (int j = 0; j < arr[i].length; j++) { // arr[i].length = 3
				iSum += arr[i][j];
				iCount++;
				if (i == 0) {
					iEng += arr[i][j];
				} else if (i == 1) {
					iMath += arr[i][j];
				} else if (i == 2) {
					iKor += arr[i][j];
				}
			}
			if (i == 0) {
				iEngAvg = (float)iEng / arr[i].length;
			} else if (i == 1) {
				iMathAvg = (float)iMath / arr[i].length;
			} else if (i == 2) {
				iKorAvg = (float)iKor / arr[i].length;
			}
		}
		iSumAvg = (float)iSum / iCount;
		
		System.out.printf("영어 합계 : %,d점, 평균 : %.1f점\n", iEng, iEngAvg);
		System.out.printf("수학 합계 : %,d점, 평균 : %.1f점\n", iMath, iMathAvg);
		System.out.printf("국어 합계 : %,d점, 평균 : %.1f점\n", iKor, iKorAvg);
		System.out.printf("전체 합계 : %,d점, 평균 : %.1f점\n", iSum, iSumAvg);
		
	}

}
