package chap06.constructor;

public class MyConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�⺻ �����ڸ� ȣ���ؼ� ��ü�� ������ �� setter �޼ҵ带 �̿��ؼ� �� �ʱ�ȭ�ϱ�
		/*MyConstructor obj = new MyConstructor();
		obj.setName("�嵿��");
		obj.setId("jang");
		obj.setPass("1234");*/
		
		//�Ű������� 3�� �ִ� ������ �޼ҵ带 ȣ���ϸ鼭 ���� �ʱ�ȭ�ϱ�
		//MyConstructor(String, String, String) ȣ�� ��
		MyConstructor obj = new MyConstructor("Kim", "k1357", "P");
		
		System.out.println(obj.getName() + ", " + obj.getId() + ", " + obj.getPass());
		
		//�Ű������� 4�� �ִ� ������ �޼ҵ带 ȣ���ϸ鼭 ���� �ʱ�ȭ�ϱ�
		//MyConstructor(String, String, String, String) ȣ�� ��
		MyConstructor obj3 = new MyConstructor("Kim", "k1357", "P", "Candy");
		
		System.out.println(obj3.getName() + ", " + obj3.getId() + ", " + obj3.getPass() 
							+ ", " + obj3.getNickname());
		
		//�Ű������� 6�� �ִ� ������ �޼ҵ带 ȣ���ϸ鼭 ���� �ʱ�ȭ�ϱ�
		//MyConstructor(String, String, String, String) ȣ�� ��
		MyConstructor obj4 = new MyConstructor("Kim", "k1357", "P", "Candy", "Seoul", 1000);
		
		System.out.println(obj4.getName() + ", " + obj4.getId() + ", " + obj4.getPass() 
									+ ", " + obj4.getNickname() + ", " + obj4.getPoint());
	}

}
