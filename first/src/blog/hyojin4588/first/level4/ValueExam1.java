package blog.hyojin4588.first.level4;

public class ValueExam1 {

	private int val;

	public ValueExam1(int val) {
		this.val = val;
	}

	public int getVal() {
		return val;
	}

	public boolean equals(Object i) {
		ValueExam1 j = (ValueExam1)i;
		return j.val == val;
	}

}
