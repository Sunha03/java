package chap07;

//StaticDemo�� �׽�Ʈ�ϴ� Ŭ����
//static���� ������ ������ �ν��Ͻ��� ������ ���� �����ϴ� �ν��Ͻ� ������ �ƴϹǷ� �ν��Ͻ� ������ ������ �� ����
//Ŭ���� �̸����� �����ؾ� ��
public class StaticDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo obj1 = new StaticDemo("obj1");
		obj1.display();
		System.out.println(obj1.num + ", " + /*obj1.staticNum (X)*/ StaticDemo.staticNum);
		
		StaticDemo obj2 = new StaticDemo("obj2");
		obj2.display();
		System.out.println(obj2.num + ", " + /*obj2.staticNum (X)*/ StaticDemo.staticNum);
		
		StaticDemo obj3 = new StaticDemo("obj3");
		obj3.display();
		System.out.println(obj3.num + ", " + /*obj3.staticNum (X)*/ StaticDemo.staticNum);
	}

}
