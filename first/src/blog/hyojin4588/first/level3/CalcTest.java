package blog.hyojin4588.first.level3;

public class CalcTest {
	
	public static void main(String[] args) {
		// System.out.println(Calc.sum(10,20)); // 30
		
		Calc calc1 = new Calc(20, 30);
		// calc1.n1 = 20;
		// calc1.n2 = 30;
		
		System.out.println(calc1.sum()); // 50
		// syso 출력문 안에 class커맨드 있을 경우 void형일 수 없음.
		// calc1.sum(); 과 같은 형태가 독립적으로 있을 경우 void형일 수 있음.
	}

}