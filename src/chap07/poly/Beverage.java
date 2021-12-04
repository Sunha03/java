package chap07.poly;

public abstract class Beverage {
	private String name;
	private int price;
	
	public Beverage() {
		
	}
	
	public Beverage(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public abstract void calcPrice();
	
	public void print() {
		System.out.println("판매 음료는 " + getName() + "이며, 가격은 " + getPrice());
	}
}
