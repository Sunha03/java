package chap08;

public class ExceptionTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("********** ���α׷� ���� ************");
		try {
			System.out.println(10/0);			//���� �߻�
		}
		catch(Exception e) {
			System.out.println("���� �߻�!!");
			System.out.println("���� �޼��� : " + e.getMessage());
		}
		System.out.println("********** ���α׷� ���� ************");
	}

}
