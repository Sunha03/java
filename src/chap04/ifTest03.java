package chap04;
//��øif�� ���ǿ� ��� 
//��� ����� ��ø ���� 
import java.util.Scanner;

//Scanner Ŭ����(API)�� ����� 
//=> ���α׷� ���� �߰��� ���� �Է¹��� �� �ִ� ��ɵ��� ���� 
//Scanner�� ������ �Է� �޾� 90�� �̻��̸� '���'�� ����ϰ� 
//90�� �̸��̸� '������'�� Ŭ���ϼ���.
public class ifTest03 {

	public static void main(String[] args) {
	
      Scanner key =new Scanner(System.in);
      System.out.println("����:");
      int jumsu = key.nextInt();
      
   
      System.out.println("����Ƚ��");
      int count = key.nextInt();
      if(jumsu>=90) {
    	  System.out.println("���");
      }
      else {
    	  if(count>3) {
    		  System.out.println("ó������ �ٽ� ����...");
    	  }else {
    		  System.out.println("�� ���� �����..");
    	  }
                 
      }
	
	
	}

}
