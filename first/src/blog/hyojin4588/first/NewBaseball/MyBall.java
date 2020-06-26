package blog.hyojin4588.first.NewBaseball;

import java.util.Arrays;
import java.util.Scanner;

public class MyBall {

	// Member Field
	private int[] myArr;
	private Scanner scan;
	// Member Field
	
	// Constructor
	public MyBall() {}
	
	public MyBall(int i) {
		init(i);
	}
	// Constructor
	
	// Setter & Getter
	public void setNumbers() {
		for(int i = 0; i < myArr.length; i++) {
			System.out.printf("%d번째 숫자를 입력해주세요(1 ~ 9) : ", i + 1);
			// 문자열 입력시 오류 구문
			String strI = scan.nextLine();
			try {
				myArr[i] = Integer.parseInt(strI);
			} catch (Exception e) {
				System.out.print("숫자만 입력하여야 합니다. 다시 ");
				i--;
				continue;
			}
			// 문자열 입력시 오류 구문
			// myArr[i] = scan.nextInt();
			if (myArr[i] < 1 || myArr[i] > 9) {
				System.out.print("입력 범위를 벗어나셨습니다. 다시 ");
				i--;
				continue;
			}
			for(int j = 0; j < i; j++) {
				if (myArr[i] == myArr[j]) {
					System.out.print("중복된 값을 입력하셨습니다. 다시 ");
					i--;
					break;
				}
			}
		}
	}
	
	public int getlength() {
		return myArr.length;
	}
	
	public int getClass(int i) {
		return myArr[i];
	}
	// Setter & Getter
	
	// Entity Method
	private void init(int i) {
		myArr = new int[i];
		scan = new Scanner(System.in);
	}
	
	public void checkMine() {
		System.out.println(Arrays.toString(myArr));
	}
	// Entity Method

}