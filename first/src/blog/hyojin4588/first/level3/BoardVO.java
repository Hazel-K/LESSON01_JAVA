package blog.hyojin4588.first.level3;

public class BoardVO {
	// Member Field, !static 아니면 객체화 필수!
	private String title;
	private String content;
	private int writeID;
	// Member Field
	
	// Constructor
	public BoardVO() {} // 기본생성자, 하나도 없을 때는 컴파일러가 자동으로 삽입
	
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
