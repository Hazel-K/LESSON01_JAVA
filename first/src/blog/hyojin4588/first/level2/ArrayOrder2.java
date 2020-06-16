package blog.hyojin4588.first.level2;

public class ArrayOrder2 {

	public static void main(String[] args) {

		int[] arr = { 29, 33, 15, 88, 2, 46, 92, 1, 19 }; // arr
		int iTemp = 0;
		int iMin = 0;

		// 선택정렬
		for (int i = 0; i < arr.length - 1; i++) { // 0 - 7
			
			System.out.println("Cycle " + (i + 1));

			iMin = i; // 앞줄 재검색 방지

			for (int j = i + 1; j < arr.length; j++) { // 1 - 8
				
				for (int k = 0; k < arr.length; k++) {
					
					System.out.print(k != 0 ? ", " : "");
					System.out.print(arr[k]);
					
				}
				
				// System.out.print("\t교체 여부 : ");
				// System.out.print(arr[iMin] > arr[j] ? "[교체]" : "[잔류]");
				System.out.print("\t현재 기억된 배열 주소 : arr[" + iMin + "]");
				System.out.println();
				
				if (arr[iMin] > arr[j]) { // 바뀐 부분 재검색 방지
					iMin = j;

					// System.out.println(iMin); // 확인용 출력구문
				} // if

			} // for j

			iTemp = arr[i];
			arr[i] = arr[iMin];
			arr[iMin] = iTemp;

			System.out.println("arr[" + i + "] 위치에 정렬된 최소값 : " + arr[i] + "");
			System.out.println();
			
		} // for i
		
		System.out.println();
		System.out.print("[출력 결과] : ");
		for (int k : arr) {
			System.out.print(k + " ");
		} // for k

	} // main

} // ArrayOrder2
