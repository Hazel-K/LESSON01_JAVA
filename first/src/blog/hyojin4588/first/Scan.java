package blog.hyojin4588.first;

import java.util.Scanner; // Ctrl + Shift + O, 혹은 Scanner를 가리켜 import 시켜도 가능

public class Scan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 변수 scan은 입력받은 새로운 데이터이다.
		System.out.println("나이?"); // 나이? 를 출력
		int age = scan.nextInt(); // 입력받은 정수를 스캔한 후 age 변수에 대입
		System.out.println("나이 : " + age); // 텍스트와 변수 age를 출력
		
		System.out.println("이름?"); // 이름? 을 출력
		String name = scan.next(); // 입력받은 텍스트를 스캔한 후 name 변수에 대입
		System.out.println("이름 : " + name); // 텍스트와 변수 name을 출력
		scan.close(); // IO(in-out)계열의 클래스들은 닫힐 때까지 메모리를 소모하므로 닫아주는 것이 좋다.
	}
}