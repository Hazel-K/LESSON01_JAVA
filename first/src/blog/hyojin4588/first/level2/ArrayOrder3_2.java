package blog.hyojin4588.first.level2;

public class ArrayOrder3_2 {

	public static void main(String[] args) {
		
		int[] arr = { 29, 33, 15, 88, 2, 46, 92, 1, 19 }; // arr
		
		// 버블정렬 2
		for (int i = 1; i < arr.length; i++) { // 1 ~ 9 까지 반복
			
			System.out.println("[Cycle " + i + "]");
			
			for (int j = 0; j < arr.length - i; j++) { // j가 arr.length - i보다 작을 때까지 반복
				
				for (int k = 0; k < arr.length; k++) {
					
					System.out.print(k != 0 ? ", " : "");
					System.out.print(k == j || k == j + 1 ? "[" + arr[k] + "]" : arr[k]);
					
				}				
				
				System.out.print("\t[] : 현재 선택된 비교 대상, 교체 여부 : [");
				System.out.print((arr[j + 1] < arr[j]) ? "교체]" : "잔류]");
				System.out.println();
				
				if (arr[j + 1] < arr[j]) {
					
					int iTemp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = iTemp;
					
				}
				
				
			}	
			System.out.println();
		}
		
		System.out.println();
		System.out.print("총 실행 결과 : ");
		for (int k : arr) {
			System.out.print(k + " ");
		}
		
	}

}
