package blog.hyojin4588.first.level3;

public class MyListTest {

	public static void main(String[] args) {
		MyList list = new MyList(); // 변수는 값 하나만 지정 가능, 대문자 시작은 레퍼런스 변수
		list.add(10); // 사실상 MyList 클래스 안에 add 메소드를 쓰겠다는 뜻. = 이 없으므로 void 형일 가능성이 높음
		list.add(3);
		list.remove(); // 
		list.size();
		list.get(1);
		/*
		list {

			// Member Field
			private int[] arr = temp;
			// Member Field

			// Entity Method
			void add(int i) {
				int[] temp = new int[arr.length + 1];
				for (int j = 0; j < arr.length; j++) {
					temp[j] = arr[j];
				}
				temp[arr.length] = i;
				arr = temp;
				System.out.print(arr[arr.length - 1] + ", ");
			}
		*/
	}

}

// 한 파일에 class 하나 더 추가
class MyList {

	// Member Field
	private int[] arr = new int[0]; // add(10) -> 1, 10
	// Member Field

	// Entity Method
	void add(int i) {
		int[] temp = new int[arr.length + 1];
		for (int j = 0; j < arr.length; j++) {
			temp[j] = arr[j];
		}
		temp[arr.length] = i;
		arr = temp;
		System.out.print(arr[arr.length - 1] + ", ");
	}
	
	void remove() {
		int[] temp = new int[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++ ) {
			temp[i] = arr[i];
		}
		arr = temp;
		System.out.print(arr[arr.length - 1] + ", ");
	}
	
	void get(int i) {
		System.out.println(arr[i-1]);
	}
	
	void size() {
		System.out.println(arr.length);
	}
	// Entity Method

}