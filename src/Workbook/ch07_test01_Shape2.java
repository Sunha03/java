package Workbook;

public class ch07_test01_Shape2 {

	public static void main(String[] args) {
		Shape2[] sh2 = new Shape2[4];
		sh2[0] = new Rectangle2(4, 7, 5);
		sh2[1] = new Rectangle2(5, 4, 6);
		sh2[2] = new Circle2(6, 6, 7);
		sh2[3] = new Circle2(7, 8, 3);
		
		for(int i=0;i<sh2.length;i++) {
			if(sh2[i] instanceof Rectangle2) {
				System.out.print("Rectangle : ");
				System.out.println(((Rectangle2)sh2[i]).printInfo());
			}
			else if(sh2[i] instanceof Circle2) {
				System.out.print("Circle : ");
				System.out.println(((Circle2)sh2[i]).printInfo());
			}
		}
		
		System.out.println("After Move ..............");
		for(int i=0;i<sh2.length;i++) {
			if(sh2[i] instanceof Rectangle2) {
				((Rectangle2)sh2[i]).move(10, 10);
				
				System.out.print("Rectangle : ");
				System.out.println(((Rectangle2)sh2[i]).printInfo());
			}
			else if(sh2[i] instanceof Circle2) {
				((Circle2)sh2[i]).move(10, 10);
				
				System.out.print("Circle : ");
				System.out.println(((Circle2)sh2[i]).printInfo());
			}
		}
	}

}
