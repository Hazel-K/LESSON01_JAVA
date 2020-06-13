package blog.hyojin4588.first.mission;

public class Mission1 {
	public static void main(String[] args) {
		int n1 = 10, n2 = 3;
		float result = (float)n1/n2; // n2도 자동으로 형변환이 되기 때문에 한 곳에만 적어줘도 가능함.
		System.out.printf("%.1f\n",result);
		// 결과를 변수에 담아주시고, 그 변수를 콘솔에 찍으면 3.3333 어쩌고 나오도록 해주세요.
	}
}