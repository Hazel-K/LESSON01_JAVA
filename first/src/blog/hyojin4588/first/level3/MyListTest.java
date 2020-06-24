package blog.hyojin4588.first.level3;

public class MyListTest {

	public static void main(String[] args) {
		MyList list = new MyList(); // 변수는 값 하나만 지정 가능, 대문자 시작은 레퍼런스 변수
		list.add(10);
		list.add(0, 5);
		list.add(15);
		list.add(25);
		list.add(2,100);
		
		System.out.println(list.remove(2));
		
		for(int i = 0; i <list.size();i++) {
			System.out.println(list.get(i));
		}
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
		// add(arr.length, i);
	}
	
	void add(int i, int j) {
		int[] temp = new int[arr.length + 1];
		for(int k = 0; k < arr.length; k++) {
			
			if(k >= i) {
				temp[k+1] = arr[k];
			} else {
			temp[k] = arr[k];
			}
		
		}
		temp[i] = j;
		arr = temp;
	}
	
	int remove() {
		int[] temp = new int[arr.length - 1];
		int lastNum = arr[temp.length];
		for (int i = 0; i < temp.length; i++ ) {
			temp[i] = arr[i];
		}
		arr = temp;
		return lastNum;
		// remove(arr.length - 1);
	}
	
	int remove(int i) {
		int[] temp = new int[arr.length - 1];
		int delNum = arr[i];
		for (int j = 0; j < temp.length; j++) {
			temp[j] = j < i ? arr[j] : arr[j+1];
		}
		arr = temp;
		return delNum;
	}
	
	int get(int i) {
		return arr[i];
	}
	
	int size() {
		return arr.length;
	}
	// Entity Method

}