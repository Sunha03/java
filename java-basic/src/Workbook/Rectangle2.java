package Workbook;

public class Rectangle2 extends Shape2 implements Movable {
	private int radius;
	
	public Rectangle2() {
		
	}
	
	public Rectangle2(int radius, int x, int y) {
		super(new Point(x, y));
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return point.getX() * point.getY();
	}

	@Override
	public double getCircumference() {
		return 2 * (point.getX() + point.getY());
	}
	
	public void move(int x, int y) {
		point.setX(x + 2);
		point.setY(y + 2);
	}
	
	public String printInfo() {
		String res = radius + " " + point.getX() + " " + point.getY();
		return res;
	}
}
