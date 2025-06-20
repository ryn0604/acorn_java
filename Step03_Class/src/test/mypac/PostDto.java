package test.mypac;

public class PostDto {
	private int id;
	private String content;
	private String author;
	
	public PostDto() {
		System.out.println("PostDto 클래스와 생성자 실행!");
	}
	
	public PostDto(int id, String content, String author) {
		this.id = id;
		this.content = content;
		this.author = author;
	}
	
	public PostDto(int id, String content) {
		this.id = id;
		this.content = content;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
