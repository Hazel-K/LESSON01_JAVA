package blog.hyojin4588.first.level4;

public class ValueTest1 {
	
	public static void main(String[] args) {
		String str1 = new String("A");
		String str2 = new String("A");
		
		System.out.println("1: " + (str1 == str2));
		System.out.println("2: " + str1.equals(str2));
		// 자기 걸 오버라이딩해서 쓰고 있음.
		
		ValueExam1 val1 = new ValueExam1(1);
		ValueExam1 val2 = new ValueExam1(1);
		
		System.out.println("1: " + (val1 == val2));
		System.out.println("2: " + val1.equals(val2));
		// 자기 걸 오버라이딩 하지 않고 있음
	}

}