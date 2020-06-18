package blog.hyojin4588.first.level2;

public class Method2 {
	
	public static void main (String[] args) {
		
		// String[] args는 외부에서 호출할 시, args 인자를 호출한 개수만큼 자동으로 늘린 다음 호출한다.
		System.out.println("args.length: " + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
	}

}
