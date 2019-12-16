package chap07.poly;

/*
 * �������̽� ����
 * < �������̽� >
 * > �߻� �޼ҵ�/����� �����ϴ� Ư���� Ŭ����
 * 
 *  1. �������̽��� interface Ű���带 �̿��ؼ� ����
 *  2. �������̽��� �߻�޼ҵ常 �����ϴ� Ư���� Ŭ����
 *     - public abstract�� ���� ����
 *     - ����� ������ �ڵ����� �߰���
 *  3. �������̽��� �������̽��� ����� �� ���� (extends �̿�)
 *     - ���� �������̽��� ���� �������̽��� �߻�޼ҵ带 ��� ����
 *  4. Ŭ������ �������̽��� ����� �� ���� (implements �̿�)
 *     - �������̽��� ��ӹ޴� Ŭ������ �̹� �ٸ� Ŭ������ ����ϴ� ��쿡 extends�� ���� �����ϰ� implement�� �����ؾ���
 *  5. �������̽��� ���� ���� ����� �� ����. ��, ���� ����� ������
 *     implements �ڿ� �������̽��� ������ �� ','�� �����ؼ� ������ ��
 *  6. Ŭ������ �������̽����� ��ӹ޴� ���� Ŭ������ ��� Ŭ������ �������̽��� ������ �νĵ�
 *     > ��ӹ޴� ��� Ŭ����, �������̽��� ���� Ÿ���� ��
 *     
 */

interface InterA {
	public abstract void test();
	void display(int num);
}

interface InterB extends InterA {
	void show();
}

interface InterC {
	
}

class SuperA {
	
}

//SubA�� SuperA, InterA, InterB, InterC�� ���
class SubA extends SuperA implements InterB, InterC {
	
}

public class InterfaceTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperA obj1 = new SubA();
		InterA obj2 = new SubA();
		SuperB obj3 = new SubA();
		InterC obj4 = new SubA();
	}

}
