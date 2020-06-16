package blog.hyojin4588.first.level2;

public class Array {

	public static void main(String[] args) {

		// 배열 만들기 첫번째 방법; new 키워드를 사용하는 방법
		int[] arr = new int[100]; // 배열 int arr은 새로운 정수[100;크기] 이다. *int[], new 등등은 전부 레퍼런스 변수이다.
		arr[0] = 10; // arr[0]번째 위치의 값은 10이다.
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;

		char[] arr2 = new char[20]; // 배열 char arr2은 새로운 정수[20;크기] 이다.
		float[] arr3 = new float[10]; // 배열 float arr3은 새로운 정수[10;크기] 이다.
		String[] arr4 = new String[200]; // 배열 String arr4은 새로운 정수[200;크기] 이다.
		arr4[0] = "dd"; // arr4[0]번째 위치의 값은 "dd"이다.

		// 배열 만들기 두번째 방법; { }중괄호를 사용하는 방법
		int[] arr5 = { 10, 20, 30, 40 }; // 배열 int arr5는 [4;크기] 에 값이 각각 10, 20, 30, 40인 배열이다.
		int[] arr6 = arr5; // 지정하지 않은 배열은 NULL값을 기본 값으로 가진다.

		System.out.println(arr5); // 레퍼런스 변수, 주소값으로서의 arr5와 arr6의 값은 같다.
		System.out.println(arr6); // 레퍼런스 변수, 주소값으로서의 arr5와 arr6의 값은 같다.
		// 객체화된 것들은 기본값이 들어간다. char 빈칸, 정수 0, boolean false, 실수 0.0, String NULL

		int[] arr7 = new int[100];
		/*
		for (int i = 0; i < 100; i++) {
			arr7[i] = i;
			System.out.println(arr7[i]);
		}
		*/
		for (int i = 0; i < arr7.length; i++) { // arr7.length = 배열 arr7의 길이
			arr7[i] = i;
			System.out.println(arr7[i]);
		}
	
	}

}
