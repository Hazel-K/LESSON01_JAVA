package blog.hyojin4588.first.level3;

public class BoardVO {
	// Member Field, !static 아니면 객체화 필수!
	private String title;
	private String content;
	private int writeID;
	// Member Field
	
	// Constructor
	public BoardVO() {} // 기본생성자, 하나도 없을 때는 컴파일러가 자동으로 삽입
	// 기본 생성자와 세터 지정을 하지 않으면 인자를 활용한 생성자를 통해 객체를 상수처럼 활용 가능
	
	public BoardVO(String title, String content, int writeID) {
		super();
		this.title = title;
		this.content = content;
		this.writeID = writeID;
	}
	// Constructor
	
	// Setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setWriteID(int writeID) {
		this.writeID = writeID;
	}
	// Setter
	
	// Getter
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public int getWriteID() {
		return writeID;
	}
	// Getter
	
	// Entity Method
	// Entity Method
}
