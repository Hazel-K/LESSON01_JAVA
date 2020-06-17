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
		
		// 유연한 방식.
		/*
		int[][] arr = {
				{90, 100, 88}, //영어
				{34, 99, 45}, //수학
				{98, 65, 87} //국어
		}; // Array 정렬
		
		String[] clsArr = {"영어", "수학", "국어"}; // 과목 Arr 정렬
		int[] sumArr = new int[clsArr.length]; // sumArr 1차배열은 clsArr.length 만큼의 크기를 가지는 배열이다.
		
		// 각 항목 누적합 산출
		// 확인용
		// System.out.println(arr.length); 결과값 = 3 (배열{ }이 세 개)
		// System.out.println(arr[i].length); 결과값 = 3 (값이 세 개, 90, 100, 88 등)
		for(int i=0; i<arr.length; i++) {
			for(int z=0; z<arr[i].length; z++) {
				sumArr[i] += arr[i][z]; // clsArr[i] 항목에 있는 것들 전부 누적합 시키겠다는 의미
			}
		}
		// 각 항목 누적합 산출 종료
		
		int totalSum = 0; // 합계 누적용 변수
		int totalCnt = 0; // 전체평균 수집용 변수
		
		// 각 과목명 및 합계와 평균 동시 출력
		// 확인용
		// System.out.println(sumArr.length); 결과값 = 3 ()
		for(int i=0; i<sumArr.length; i++) {
			System.out.printf("%s합계: %d, 평균: %.1f\n"
					, clsArr[i], sumArr[i], (float)sumArr[i]/arr[i].length);
			totalSum += sumArr[i];
			totalCnt += arr[i].length; // 낱개의 element를 하나하나 세지 않고 한 줄에 들어 있는 자식들의 값을 누적합시키는 점이 인상적임
		}
		// 각 과목명 및 합계와 평균 동시 출력
		
		System.out.printf("전체합계: %d, 평균: %.1f\n", totalSum, (float)totalSum/totalCnt); // 전체합계 출력구문
		*/
	}

}
