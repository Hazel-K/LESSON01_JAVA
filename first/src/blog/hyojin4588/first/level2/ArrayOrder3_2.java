package blog.hyojin4588.first.level2;

public class ArrayOrder3_2 {

	public static void main(String[] args) {
		
		int[] arr = { 29, 33, 15, 88, 2, 46, 92, 1, 19 }; // arr
		
		// 버블정렬 2
		for (int i = 1; i < arr.length; i++) { // 1 ~ 9 까지 반복

			for (int j = 0; j < arr.length - i ; j++) { // j가 arr.length - i보다 작을 때까지 반복
				
				// System.out.print(i + " " + j);
				// System.out.println();
				
				if (arr[j + 1] < arr[j]) {
					
					int iTemp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = iTemp;
					
				}
				
				
			}	
			
		}
		
		for (int k : arr) {
			System.out.print(k + " ");
		}
		
	}

}
