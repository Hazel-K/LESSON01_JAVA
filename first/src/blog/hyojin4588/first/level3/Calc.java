package blog.hyojin4588.first.level3;

public class Calc {
	
	int n1;
	int n2;
	
	public Calc(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public static int sum(int iA, int iB) {
		return iA + iB;
	}
	
	public int sum() {
		return n1 + n2;
	}

}