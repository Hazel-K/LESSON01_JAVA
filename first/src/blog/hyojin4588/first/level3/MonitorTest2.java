package blog.hyojin4588.first.level3;

public class MonitorTest2 {
	
	public static void main(String[] args) {
		Monitor.brand = "삼성";
		Monitor.printBrand(); // 전역화시킨 객체 메소드는 객체화시키지 않아도 사용할 수 있다.
		// Monitor.printInfo(); // 오류 발생. Monitor m1 = new Monitor();와 같이 객체화시키지 않는 이상 불러올 수 없음. 
	}

}
