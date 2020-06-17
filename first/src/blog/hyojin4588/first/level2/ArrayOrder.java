package blog.hyojin4588.first.level2;

public class ArrayOrder {

	public static void main(String[] args) {

		int[] arr = { 29, 33, 15, 88, 2, 46, 92, 1, 19 };

		// 스왑구문
		/*
		 * int swap = 0; swap = arr[0]; arr[0] = arr[1]; arr[1] = swap;
		 * System.out.println(arr[0] + "," + arr[1]);
		 */

		// 순차정렬
		for (int i = 0; i < arr.length - 1; i++) { // 0 ~ 7까지 반복

			for (int j = i + 1; j < arr.length; j++) { // 1 ~ 8까지 반복

				System.out.print(arr[i] + "<=비교중=>" + arr[j] + ":\t" + (arr[i] > arr[j]) + ":\t");
				if (arr[i] > arr[j]) { // i와 j에 있는 배열의 값을 서로 비교 ex) 0 1, 0 2, 0 3...
					int swap = arr[i];
					arr[i] = arr[j];
					arr[j] = swap; // 조건에 부합할 경우 i와 j에 있는 배열값을 교체
				}
				for (int k = 0; k < arr.length; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}
			System.out.println();
			
		}
		/*
		 * for (int k = 0; k < arr.length; k++) { System.out.print(arr[k] + " "); } //
		 * 출력 구문, 모든 배열값 출력
		 */

	}

}
