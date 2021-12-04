package chap07;

/*
 * << ��� ���迡�� ��� ������ ���� Ư¡ >> 
 * 1. ��� ���迡���� ����� Ŭ�������� ���ǵ� ��� ������ ���� Ŭ�������� ����� �� ����.(���� Ŭ���� ���� ������ ���� ���� ����)
 * 2. ���� Ŭ������ ������ ������ �̸��� ������ ���� Ŭ������ �����ϴ� ��� ���� Ŭ������ ��������� �켱 ������ ����
 * 3. �θ� Ŭ������ ������ �׼��� �Ϸ��� super�� �̿��ؼ� ������
 * 	  this -> �ڱ� �ڽ��� ��ü, super -> �θ� ��ü
 * 4. ���� Ŭ������ private���� ����� ������ ��� ���迡 �ִٰ� �ϴ��� ���� Ŭ�������� ������ �� ����
 */

class Super {
	int num = 100;
}

class Sub extends Super {
	public void display() {
		System.out.println("num => " + num);		//�θ� Ŭ������ ������ �׼��� �� �� ����
	}
}

public class InheritanceTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� Ŭ������ ���� Ŭ������ �Ϲ����� ������ �����ϱ� ���ؼ� ����ϴ� Ŭ�����̹Ƿ� �ַ� ���� Ŭ������ �����ؼ� �����.
		Sub obj = new Sub();
		obj.display();
		System.out.println("main => " + obj.num);
	}

}
