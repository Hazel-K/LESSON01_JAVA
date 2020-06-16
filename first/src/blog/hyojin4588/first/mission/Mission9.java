package blog.hyojin4588.first.mission;

public class Mission9 {

	public static void main(String[] args) {
		/*
		arr 1~100값이 들어가도록 해주세요 순서대로
		0번방에 1
		1번방에 2
		...
		99번방에 100
		------
		각 방에 있는 모든 값을 더한 후 결과값 출력
		------
		각각 for문 따로
		*/
		
		/*
		int iSum = 0;
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		for (int j = 0; j < arr.length; j++) {
			iSum += arr[j];
		}
		System.out.println(iSum);
		 */
		/*
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 2;
		}
		
		for (int j = 0; j < arr.length; j++) {
			iSum += arr[j];
		}
		System.out.println(iSum);
		 */
		
		int[] arr = new int[10];
		int iSum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 2;
			iSum += arr[i];
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i != 0 ? ", " : ""); // 논리식 ? 참일때 : 거짓일때
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("합계 = " + iSum);
				
	}

}
