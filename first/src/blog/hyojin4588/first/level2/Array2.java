package blog.hyojin4588.first.level2;

public class Array2 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[2][3];
		
		int[][] arr2 = {
				{10, 20},
				{12, 13, 14},
				{15, 16, 17, 18}
		};
		
		System.out.println(arr.length + "\n"); // 2중 배열의 element가 몇 개 있는지를 체크, 2가 출력
		System.out.println(arr2[0].length); // 2중 배열의 element의 element가 몇 개 있는지를 체크, 2가 출력
		System.out.println(arr2[1].length); // 2중 배열의 element의 element가 몇 개 있는지를 체크, 3이 출력
		System.out.println(arr2[2].length); // 2중 배열의 element의 element가 몇 개 있는지를 체크, 4이 출력
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j <arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println("");
		}
		
	}

}
