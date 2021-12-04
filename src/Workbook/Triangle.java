package Workbook;

public class Triangle extends Shape implements Resize {
	public Triangle() {
		
	}
	
	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
	}
	
	public double getArea() {
		return (double)getWidth() * getHeight() * 1/2;
	}

	@Override
	public void setResize(int size) {
		// TODO Auto-generated method stub
		setHeight(getHeight() + size);
	}
}
