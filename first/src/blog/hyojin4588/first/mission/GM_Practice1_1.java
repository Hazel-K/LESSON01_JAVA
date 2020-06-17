package blog.hyojin4588.first.mission;

public class GM_Practice1_1 {
	
	public static void main (String[] args) {

		/*
			각 과목들의 합계와 평균 구하기
			전체 인원, 모든 과목의 총점과 평균도 구하기
			과목과 인원 수가 늘어나더라도 적용되도록 하기
		*/
		
		int[][] scoreArr = {
				{90, 100, 88},	// 영어
				{34, 99, 45},	// 수학
				{98, 65, 87},	// 국어
				{80, 70, 60, 77, 88} // 사회
		};
		
		/*
		tip!
		각 과목명을 배열화 시켜서 저장해봅시다.
		배열화시킨 과목에 classArr[n] 항들의 값들을 저장해봅시다.
		String Array와 값들을 저장시킨 항목들로 반복문을 출력해봅시다.
		*/
		
		// 배열 및 변수
		String[] classArr = {"영어", "수학", "국어", "사회"}; // 과목명 생성
		int[] classSum = new int[classArr.length]; // 과목별 점수 합계산출용 배열 생성
		float[] classAvg = new float[classArr.length]; // 과목별 점수 평균산출용 배열 생성
		int classTotal = 0; // 과목별 합계 누적용 변수
		int classCount = 0; // 각 항목 개수 누적용 변수
		// 배열 및 변수 끝
		
		// 과목별 합계 및 평균 산출 (전체 포함)
		for (int i = 0; i < classArr.length; i++) {
			for (int j = 0; j < scoreArr[i].length; j++) {
				classSum[i] += scoreArr[i][j]; // 각 과목의 합이 누적합으로서 배열에 삽입되므로 classArr 길이만큼의 공간이 필요하다.
				classCount++;
			}
			classTotal += classSum[i];
			classAvg[i] = (float)classSum[i] / scoreArr[i].length;// 2중 for문 안에서 실행 시 3번씩 값이 정해지므로 넣을 필요가 없음
		}
		// 과목별 합계 및 평균 산출 끝 (전체 포함)
		
		// 출력 구문
		for (int i = 0; i < classArr.length; i++) {
			System.out.printf("%s - 합계 : %,d  평균 : %.1f\n", classArr[i], classSum[i], classAvg[i]);	
		}
		System.out.printf("\n전체 - 합계 : %,d  평균 : %.1f\n", classTotal, (float)classTotal / classCount);
		// 출력 구문 끝
		
	}

}
