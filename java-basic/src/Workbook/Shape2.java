package Workbook;

public abstract class Shape2 {
	Point point;
	
	public Shape2() {
		
	}
	
	public Shape2(Point point) {
		this.point = point;
	}
	
	public abstract double getArea();
	public abstract double getCircumference();
}
