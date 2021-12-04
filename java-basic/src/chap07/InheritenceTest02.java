package chap07;

/*
 * < ��� ���迡�� �޼ҵ尡 ���� Ư¡ >
 * 1. ��� ���迡���� ���� Ŭ������ ���ǵ� �޼ҵ带 ���� Ŭ�������� ����� �� ���� (���� Ŭ���� ���� ������ ���ؼ� ������ �� ����)
 * 2. ���� Ŭ������ ���ǵ� �޼ҵ�� ������ �޼ҵ带 ���� Ŭ�������� �����ϰ� ����� �� ����. �̷� ��� ���� Ŭ������ �޼ҵ尡 ȣ���
 *    > ���� Ŭ������ ����� �޼ҵ�� ������ �޼ҵ带 ���� Ŭ������ �����ϴ� ���� �޼ҵ� ������(�޼ҵ� �������̵�)��� ��
 *    	* �޼ҵ� �������̵� >> �޼ҵ� ����ΰ� �θ� Ŭ������ �޼ҵ� ����ο� �ݵ�� ��ġ�ؾ� ��
 *    					    �޼ҵ��, �ŰԺ��� ����, �Ű����� Ÿ��, ���� Ÿ�� ��� �����ؾ� ��
 */

class Parent {
	public void display() {
		System.out.println("�θ��� display...");
	}
}

class Child extends Parent {
	public void display() {
		System.out.println("�ڽ��� display...");
		super.display();
	}
	
	public void test() {
		System.out.println("�ڽ��� test...");
		super.display();
	}
}

public class InheritenceTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.test();
		obj.display();
	}

}
