package blog.hyojin4588.first.level3;

import java.util.ArrayList;

public class List2 {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1); // list.add(); 리스트 길이 추가
		list.add(2);
		list.add(3);
		
		for(int i = 0; i < list.size(); i++) { // list.size(); 리스트의 길이, 현재 3
			int val = (int)list.get(i);
			System.out.print(val + ", ");
		}
		
		System.out.println();
		
		for (Object val : list) { // Object는 JAVA의 최상위 클래스로서, 모든 자바 객체들은 Object로부터 상속받았다.
			System.out.print((int)val + ", ");
		}
		
		Object obj = 1;
		obj = "aaa";
		obj = 1.1; // 변수 지정을 이런 형식으로도 할 수 있으나 사용 시 강제로 형변환을 해줘야 함
	}

}