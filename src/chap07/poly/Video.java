package chap07.poly;

public class Video extends Content{
	private String genre;
	
	public Video() {
		
	}
	
	public Video(String title, String genre) {
		super(title);
		this.genre = genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public Video(String genre) {
		this.genre = genre;
	}
	
	public void totalPrice() {
		switch(genre.toString()) {
			case "new" : 
				setPrice(2000);
				break;
			case "comic" : 
				setPrice(1500);
				break;
			case "child" : 
				setPrice(1000);
				break;
			default :
				setPrice(500);
				break;
		}
	}
}
