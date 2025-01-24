package tp012;

public class Book {
	private String kTitle;
	private String kAuthor;
	private int kPublication;
	private boolean kAvailable;
	
	protected Book() {
		this.kAuthor = new String();
		this.kTitle = new String();
		this.kPublication = 0;
		this.kAvailable = true;
	}
	public void SetAuthor(String Author) {
		this.kAuthor = Author;
	}
	public void SetTitle(String Title) {
		this.kTitle = Title;
	}
	public void SetPublication(int Year) {
		this.kPublication = Year;
	}
	public void SetAvailable(boolean Available) {
		this.kAvailable = Available;
	}
	public String GetAuthor() {
		return this.kAuthor;
	}
	public String GetTitle() {
		return this.kTitle;
	}
	public int GetPublication() {
		return this.kPublication;
	}
	public boolean GetAvailable() {
		return this.kAvailable;
	}
}
