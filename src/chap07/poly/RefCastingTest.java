package chap07.poly;

//��ü�� ����ȯ > ��Ӱ��迡 �ִ� ��쿡�� ������
class Parent {
	String name = "Jang";
	public void display() {
		System.out.println("�θ��� display");
	}
}

class Child extends Parent {
	String name = "Kim";
	public void display() {
		System.out.println("�ڽ��� display");
	}
	public void test() {
		System.out.println("����Ŭ�������� ���ǵ� �޼ҵ�");
	}
}

class Child2 extends Parent {
	
}

public class RefCastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=========================================");
		System.out.println("1. superŸ���� ���������� Super��ü�� ����");
		Parent obj1 = new Parent();
		obj1.display();
		System.out.println(obj1.name);
		
		System.out.println("=========================================");
		System.out.println("2. subŸ���� ���������� sub��ü�� ����");
		Child obj2 = new Child();
		obj2.display();
		System.out.println(obj2.name);

		/*
		 * ��ü�� ����ȯ
		 * > ������ ��������Ÿ�Կ� ���� ����, �޼ҵ�� �����Ǵ� ��ü�� ����
		 */
		System.out.println("=========================================");
		System.out.println("3. superŸ���� ���������� sub��ü�� ����");
		Parent obj3 = new Child();
		obj3.display();		//�ڽ�Ŭ������ display(). �޼ҵ� : �������̵��� �޼ҵ��� �������̵��� �޼ҵ尡 ȣ��
		System.out.println(obj3.name);		//�θ�Ŭ������ name. ���� : �������� Ÿ�Կ� �ش��ϴ� Ŭ������ ��������� ����
		
		//Ÿ���� ParentŸ�������� ������ ������ ��ü�� ChildŸ���̱� ������ ChildŸ������ ����ȯ�� ������(�����)
		((Child)obj3).test();
		
		/*System.out.println("=========================================");
		System.out.println("4. subŸ���� ���������� super��ü�� ����");
		Child obj4 = new Parent();		//ERROR. �ڽ�Ÿ������ ����ȯ �Ұ�
		obj4.display();
		System.out.println(obj4.name);
		*/
		
		/*System.out.println("=========================================");
		System.out.println("5. subŸ���� ��������(super��ü�� ����)");
		//��������� ����ȯ�� �ؼ� �����Ϸ��� �ӿ����� ��������� ĳ������ �Ϸ��� �� ��
		// obj1�� Child ������ ���� ���� �����Ƿ� ĳ���� ���ܰ� �߻���
		Child obj5 = (Child)obj1;*/
		
		System.out.println("=========================================");
		System.out.println("6. subŸ���� �������� = superŸ���� ��������(Sub��ü�� ����)");
		Child obj6 = (Child)obj3;
		System.out.println(obj6.name);
		obj6.display();
		obj6.test();
		
		Parent obj7 = obj2;		//��ĳ����
		
		Parent obj8 = null;
		Child obj9 = new Child();
		Child obj10 = null;
		
		obj8 = obj9;		//Parent = Child;
		obj10 = (Child)obj8;		//Child = (Child)Parent (O), Child = Parent (X)
									//�����Ϸ��� ����. �����ϸ� X
							//obj10�� Child�̰�, obj8�� Child�� ĳ���� �Ǿ����� > obj10���� Child�� ��� ����� ���� ������
		obj10.test();
	}

}
