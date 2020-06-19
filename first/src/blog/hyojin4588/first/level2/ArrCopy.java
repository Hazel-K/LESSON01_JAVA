package blog.hyojin4588.first.level2;

import java.util.Arrays;

public class ArrCopy {
	
	public static void main (String[] args) {
		
		int[] arr = {2, 4, 6, 7, 10};
		int[] arr2 = new int[arr.length];
		// arr2 = Arrays.copyOf(ArrayName, ArrayName.Length); 배열의 값을 복사하는 Method
		
		System.out.println(arr == arr2);
		System.out.println("arr : " + Arrays.toString(arr)); // Arrays.toString(ArrayName) : 배열 출력해주는 Method
		
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		
	}
	

}
