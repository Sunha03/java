package chap03;

public class OprTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�������� 
		int num1= 100;
		int num2= 200;
		//&������(and)
		System.out.println("============&����=========");
		System.out.println((num1<num2) & (num1 >=100));
		System.out.println((num1<num2) & (num1 >100));
		System.out.println((num1>num2) & (num1 >=100));
		System.out.println((num1>num2) & (num1 >100));
		

		System.out.println("============|����=========");
		System.out.println((num1<num2) | (num1 >=100));
		System.out.println((num1<num2) | (num1 >100));
		System.out.println((num1>num2) | (num1 >=100));
	
		System.out.println((num1>num2) | (num1 >100));

	
	
	    System.out.println();  //Enter Ű�� ���� �Ͱ� ���� ���
	    System.out.println(!true);
        System.out.println(!false);	
	
	}

}
