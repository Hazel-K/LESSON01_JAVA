package blog.hyojin4588.first.level2;

public class ArrayOrder3_1 {

	public static void main(String[] args) {

		int[] arr = { 29, 33, 15, 88, 2, 46, 92, 1, 19 }; // arr

		// 버블정렬
		for (int i = arr.length - 1; i > 0; i--) { // 8 ~ 1 까지 반복

			for (int j = 0; j < i; j++) { // 0 ~ (i - 1) 까지 반복

				if (arr[j + 1] < arr[j]) {

					int iTemp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = iTemp;

				}

			}

		}

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}