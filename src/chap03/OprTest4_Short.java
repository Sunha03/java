package chap03;

public class OprTest4_Short {
//�񱳿����� ||, && (���ƿ�����) - ������� �˻����� �ʰ� ���ǿ� �����ϸ� skip �ϴ� ��찡 �߻��Ѵ�. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 100;
		String str = null; //���� str�� �ƹ��͵� ������� ���� ���� 
		//str.length();
        System.out.println(num>=100 || str.length()>10);
        //System.out.println(num>=100 | str.length()>10);
	    // ||�����ڴ� or �������� Ư���� �ľ��ϰ� ù��°���� true�̸� ���� ���� �˻����� �ʴ´�.
        // &&�����ڴ� and �������� Ư���� �ľ��ϰ� ù��°���� false�̸� ���� ���� �˻����� �ʴ´�. 
	
        System.out.println(num<100 && str.length()>10);
        System.out.println(num<100 & str.length()>10);
	
	
	
	}

}
