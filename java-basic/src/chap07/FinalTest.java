package chap07;

final class FinalSuper {
	public void display() {
		System.out.println("super display");
	}
}

/*class FinalSub extends FinalSuper {		//final Ŭ������ ����� �Ұ���
	static final int NUM = 100;		//static fianl �������� �빮�ڷ�

	@Override		//������̼ǿ��� �˷��ֱ� ����
	public final void display() {
		System.out.println("display");
	}
	
}*/

public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*FinalSub obj = new FinalSub();
		//obj.NUM = 1000;			//����̹Ƿ� �� ���� �Ұ�
		System.out.println(FinalSub.NUM);
		//obj.display();			//final �޼ҵ�� �������̵��� �� ���� */
	}

}
