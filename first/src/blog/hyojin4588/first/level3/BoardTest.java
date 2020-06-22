package blog.hyojin4588.first.level3;

public class BoardTest {
	
	public static void main(String[] args) {
		BoardVO bv1 = new BoardVO("제목1", "내용1", 1); // !static 아니면 객체화 필수!
		
		BoardVO bv2 = new BoardVO();
		bv2.setTitle("제목2");
		bv2.setContent("내용2");
		bv2.setWriteID(2);
	}
	
}
