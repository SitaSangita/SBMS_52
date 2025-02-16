package in.sita.sangita.model;


public class Book {
	@Override
	public String toString() {
		return "Book [id=" + id + ", bName=" + bName + ", author=" + author + "]";
	}
	private Integer id;
	private String bName;
	private String author;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

}
