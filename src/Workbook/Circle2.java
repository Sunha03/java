package Workbook;

public class Circle2 extends Shape2 implements Movable {
	private int radius;
	
	public Circle2() {
		
	}
	
	public Circle2(int radius, int x, int y) {
		super(new Point(x, y));
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public double getCircumference() {
		return 2 * radius * Math.PI;
	}
	
	public void move(int x, int y) {
		point.setX(x + 1);
		point.setY(y + 1);
	}
	
	public String printInfo() {
		String res = radius + " " + point.getX() + " " + point.getY();
		return res;
	}
}
