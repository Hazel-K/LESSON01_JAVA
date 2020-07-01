package blog.hyojin4588.first.level8;

public class TryCatchTest {

	public static void main(String[] args) {
		// 첫번째 실행
		int a = 2;
		// 두번째 실행
		try {
			// 시도시켜보고 싶은거
			/*
			if (a % 2 == 0) {
				System.out.println("어예");
				return;
			}
			*/
		} catch (Exception e) { // 만약 오류가 난다면
			// 오류가 나면 실행해야 하는거
			System.out.println("너 오류래");
		} finally {
			// 오류가 나든 안 나든 실행하고 싶은거
			System.out.println("응");
		}
		// 세번째 실행
		System.out.println("난 뭔데");
		
		try {
			practice01();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int practice01 () throws Exception {
		int a = 0;
		int b = 0;
		return a + b;
	}
	
}
