package Workbook;

public class Book {
	public String bookName;
	public int bookPrice;
	public double bookDiscountRate;
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public int getBookPrice() {
		return bookPrice;
	}
	
	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	
	public double getBookDiscountRate() {
		return bookDiscountRate;
	}
	
	public double getDiscountBookPrice() {
		return bookPrice - (bookPrice * bookDiscountRate * 0.01);
	}

	public void print() {
		System.out.println(bookName + " " + bookPrice + " " + bookDiscountRate + "% " + getDiscountBookPrice() + "¿ø");
	}
}
