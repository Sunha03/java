package chap07.poly;

//�߻�Ŭ���� - abstract�� �ǹ�
/*
 * �̿ϼ��� Ŭ����, ��� ������ ������ �Ǿ� ���� ���� Ŭ������ �ϼ����� �ʾ����Ƿ� ��ü ���� �Ұ�
 * > �޼ҵ��� body�� �������� ���� �޼ҵ带 ���� �ִ� Ŭ���� (= �߻�޼ҵ�)
 * 
 * 1) �߻�޼ҵ带 �����ϴ� ���
 *    ���������� abstract ����Ÿ�� �޼ҵ��(�Ű�����list, ...);
 *    > �߻�޼ҵ尡 ���ǵ� Ŭ������ �̿ϼ��� �߻�Ŭ������ �ǹǷ� �Ϲ�Ŭ������ �ٸ�
 *      �߻�Ŭ������ �����ϴ� ��� Ŭ���� ����ο��� abstract�� �߰��ؾ� ��
 *      abstract class Ŭ������ { ... }
 * 2) �߻�Ŭ������ Ư¡
 *    - �Ϲݸ޼ҵ�� �߻�޼ҵ� ��� ������ �� ����
 *    - �߻�޼ҵ尡 1���� ���ǵǾ� �ִ� Ŭ������ �ݵ�� abstract�� �߰��ؾ� ��
 *    - �߻�Ŭ������ �ν��Ͻ�ȭ �� �� ���� = ��ü ���� �Ұ�
 *    - �߻�Ŭ����(abstractŬ����)�� ����ϸ� ���� �߻���
 *      > AbstractSubŬ������ abstract�޼ҵ带 ���� �ִ� AbstractSuperŬ������ ��� �����鼭 AbstractSubŬ������ �߻�Ŭ������ ��
 *      [�ذ���]
 *      1. ����Ŭ������ ���� �������� ������� Ŭ������� Ŭ���� ����ο� abstract ���̱�
 *      2. ��� �߻�޼ҵ带 �ݵ�� �������̵� �ؾ���
 * 3) �߻�Ŭ������ �߻�޼ҵ带 �ۼ��ϴ� ����?
 *    > !!!!! �������� �����ϱ� ���ؼ� !!!!!
 *    > ����Ŭ������ ����ϱ� ���� ����(��ü������ ���������� �����ϱ� ����)
 *    > ����Ŭ�������� �ݵ�� �������ؾ��ϴ� �޼ҵ带 �������� �����Ͽ� �ݵ�� �������ϵ��� �ϱ� ����
 */
abstract class AbstractSuper {
	public abstract void show();
	public void display() {		//�Ϲ� �޼ҵ�
		System.out.println("display");
	}
}

class AbstactSub extends AbstractSuper {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}

public class abstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AbstractSuper obj = new AbstractSuper();	//��ü ���� �ȵ�
	}

}
