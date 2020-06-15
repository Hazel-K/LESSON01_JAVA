package blog.hyojin4588.first.mission;

public class Mission6_3 {
	/*
	 	2단에서 9단 구구단 출력
	 	단이 바뀔때 개행을 한번 더
	*/
	
	public static void main (String[] args) {
		
		/*
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}
		*/
		
		for (int i = 26; i < 34; i++) { // for문을 26에서 34까지 총 8번 반복시키겠다.
			
			for(int j = 1; j < 10; j++){ // for문을 1에서 9까지 총 9번 반복시키겠다.
				System.out.printf("%d * %d = %d\n", (i - 24), j, ((i - 24) * j));
			}
			System.out.println();
		}
		
	}
	
}