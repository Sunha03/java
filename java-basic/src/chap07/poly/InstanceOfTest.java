package chap07.poly;

/*
 * ��ü�� Ÿ���� �˻��ϰ� �۾��� �� �ִ�.
 * instanceof������ �̿�
 */
class AA {
	
}

interface IA {
	
}

public class InstanceOfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubA obj = new SubA();
		//obj�� SuperAŸ���̶�� if��� ����
		//	   = SuperA�� �����ΰ�?
		System.out.println("-----------------------------");
		if(obj instanceof SuperA) {
			System.out.println("SuperAŸ���̴�.");
		}
		else {
			System.out.println("SuperAŸ�� �ƴϴ�.");
		}
		
		System.out.println("-----------------------------");
		if(obj instanceof InterA) {
			System.out.println("InterAŸ���̴�.");
		}
		else {
			System.out.println("InterAŸ�� �ƴϴ�.");
		}
		
		System.out.println("-----------------------------");
		if(obj instanceof InterB) {
			System.out.println("SuperBŸ���̴�.");
		}
		else {
			System.out.println("SuperBŸ�� �ƴϴ�.");
		}
		
		System.out.println("-----------------------------");
		if(obj instanceof IA) {
			System.out.println("IAŸ���̴�.");
		}
		else {
			System.out.println("IAŸ�� �ƴϴ�.");
		}
	}

}
