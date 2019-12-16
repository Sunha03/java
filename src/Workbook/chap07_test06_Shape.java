package Workbook;

public class chap07_test06_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] sh = new Shape[7];
		sh[0] = new Triangle(7, 5, "Blue");
		sh[1] = new Rectangle(4, 6, "Blue");
		sh[2] = new Triangle(6, 7, "Red");
		sh[3] = new Rectangle(8, 3, "Red");
		sh[4] = new Triangle(9, 8, "White");
		sh[5] = new Rectangle(5, 7, "White");
		sh[6] = new Circle(0, 0, "White", 5);
		
		System.out.println("---------------- �⺻���� -----------------");
		for(int i=0;i<sh.length;i++) {
			/*if(sh[i] instanceof Triangle)
				System.out.print("Triangle\t");
			else if(sh[i] instanceof Rectangle)
				System.out.print("Rectangle\t");*/
			System.out.print(sh[i].getClass().getName() + "\t");
			System.out.println(sh[i].getArea() + "\t" + sh[i].getColors());
		}
		
		System.out.println("---------------- Resize() -----------------");		
		for(int i=0;i<sh.length;i++) {
			//��ü�� Ÿ���� �����ϴ� ��� ������ �����ϴ� ���� �ƴ϶� ��ü�� Ÿ���� üũ�� �Ŀ� ������
			if(sh[i] instanceof Triangle) {
				((Triangle) sh[i]).setResize(5);
				System.out.print("Triangle\t");
			}
			else if(sh[i] instanceof Rectangle) {
				((Rectangle) sh[i]).setResize(5);
				System.out.print("Rectangle\t");
			}
			else if(sh[i] instanceof Circle) {
				((Circle) sh[i]).setResize(5);
				System.out.print("Circle\t");
			}
			System.out.println(sh[i].getArea() + "\t" + sh[i].getColors());
		}
		
		//���� forans- 5.0���� �߰��� for��
		//�迭�̳� Collection�� �ٷ� �� ���
		//for���� �� �� ����� ������ shape �迭���� ��� �ϳ��� ������ obj�� ���� �� �۾�
		/*for(Shape obj : sh) {
			
		}*/
	}

}
