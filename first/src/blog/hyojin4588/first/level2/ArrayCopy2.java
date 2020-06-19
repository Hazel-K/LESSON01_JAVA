package blog.hyojin4588.first.level2;

import java.util.Arrays;

public class ArrayCopy2 {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 7, 10, 55 };
		int[] arr2 = copyArr(arr);
		
		System.out.println(arr == arr2);
		// arr2[2] = 44; 확인용
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr2 : " + Arrays.toString(arr2));

	}
	
	public static int[] copyArr(int ...arr) {
		/*
		int[] iArr = new int[arr.length];
			for (i = 0; i < arr.length; i++) {
				iArr[i] = arr[i];
			}
		*/
		int[] iArr = Arrays.copyOf(arr, arr.length);
		return iArr;
	}

}
