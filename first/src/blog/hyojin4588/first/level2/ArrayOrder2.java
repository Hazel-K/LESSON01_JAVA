package blog.hyojin4588.first.level2;

public class ArrayOrder2 {

	public static void main(String[] args) {

		int[] arr = { 29, 33, 15, 88, 2, 46, 92, 1, 19 }; // arr
		int iTemp = 0;
		int iMin = 0;

		// 선택정렬
		for (int i = 0; i < arr.length - 1; i++) { // 0 - 7
			
			iMin = i; // 앞줄 재검색 방지
			
			for (int j = i + 1; j < arr.length; j++) { // 1 - 8
				
				if (arr[iMin] > arr[j]) { // 바뀐 부분 재검색 방지
					iMin = j;
					
					// System.out.println(iMin); // 확인용 출력구문
				} // if
				
			} // for j

			iTemp = arr[i];
			arr[i] = arr[iMin];
			arr[iMin] = iTemp; 
			
		} // for i
		
		for (int k : arr) {
			System.out.print(k + " ");
		} // for k

	} // main

} // ArrayOrder2
