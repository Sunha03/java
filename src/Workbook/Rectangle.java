package Workbook;

public class Rectangle extends Shape implements Resize {
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);
	}
	
	public double getArea() {
		return (double)getWidth() * getHeight();
	}

	@Override
	public void setResize(int size) {
		// TODO Auto-generated method stub
		setWidth(getWidth() + size);
	}
}
