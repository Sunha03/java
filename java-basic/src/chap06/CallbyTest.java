package chap06;

//�޼ҵ��� �Ű������� �⺻���� �������� �����ϴ� ��� ������
public class CallbyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����� �⺻�� ������ ������ ������ �ʱ�ȭ
		CallbyTest obj = new CallbyTest();
		
		int i = 100;
		int[] myarr = new int[5];
		for (int j = 0; j < myarr.length; j++) {
			myarr[j] = 100;
		}
		System.out.println("-------------- ���� �� -------------");
		obj.display(i, myarr);
		obj.change(i, myarr);
		
		System.out.println("-------------- ���� �� -------------");
		obj.display(i, myarr);
	}
	
	//�Ű������� ���޵� num�� ���� myarr�� �����Ѵ� �迭�� ��Ұ��� ����ϴ� �޼ҵ�
	public void display(int num, int[] myarr) {
		System.out.println("i = " + num);
		System.out.println("myarr�� ��� ��");
		for (int i = 0; i < myarr.length; i++) {
			System.out.println("myarr[" + i + "] : " + myarr[i]);
		}
	}

	//�Ű������� ���޵� i�� myarr�� �����ϴ� �迭�� ��� ���� �����ϴ� �޼ҵ�
	public void change(int a, int[] myarr) {
		a = 200;
		myarr[1] = 200;
	}
}
