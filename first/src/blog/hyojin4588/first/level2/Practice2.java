package blog.hyojin4588.first.level2;

import java.util.Random;

public class Practice2 {
	
	public static void main(String[] args) {
		
		int len = 3; // int형 변수 len의 값은 3이다.
		int[] arr = new int[len]; // int형 배열 arr은 len값의 크기인 신규 인트형 배열을 생성한다.
		
		// 1~9 사이의 랜덤한 값을 중복되지 않게 arr 배열 크기만큼 초기화한다.
		
		for (int i = 0; i < arr.length; i++) {
			
			// Random rand = new Random();
			// arr[i] = rand.nextInt(9) + 1;
			arr[i] = (int)(Math.random() * 9 + 1);
			
			// System.out.println(arr[i]);
			
			for (int j = 0; j < i; j++) {
				
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			
			}
		
		}
		// System.out.println();
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}

}
