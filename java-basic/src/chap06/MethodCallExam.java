package chap06;

//�޼ҵ��� ȣ�� ����
public class MethodCallExam {
	public void test() {
		first();
		System.out.println("test()");
	}
	
	public void first() {
		second();
	}
	
	public void second() {
		System.out.println("second()");
	}
	
	public static void maien(String[] args) {
		MethodCallExam obj = new MethodCallExam();
		obj.test();
	}
}
