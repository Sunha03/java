package Workbook;

public class Circle extends Shape implements Resize {

	private int radius;
	
	public Circle() {
		
	}
	
	public Circle(int width, int height, String colors, int radius) {
		super(width, height, colors);
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void setResize(int size) {
		// TODO Auto-generated method stub
		setRadius(getRadius() + size);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		
		return radius * radius * Math.PI;
	}

}
