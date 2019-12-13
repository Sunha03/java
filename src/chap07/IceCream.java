package chap07;

public class IceCream extends Dessert {
	private int calorie;
	
	public IceCream() {
		
	}
	
	public int getCalorie() {
		return calorie;
	}
	
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	
	public IceCream(String productName, int price, int count, int calorie) {
		super(productName, price, count);
		this.calorie = calorie;
	}
	
	public static void print() {
		System.out.println("======================================");
		System.out.println("�ֹ��׸�\t����\t����\tĮ�θ�");
		System.out.println("======================================");
	}
	
	public void printProductInfo() {
		System.out.println(getProductName() + "\t" + getPrice() + "\t" 
							+ getCount() + "\t" + getCalorie() + "kcal");
	}
}
