package chap04;

import java.util.Scanner;
//If else���� Scanner 
//Scanner Ŭ����(API)�� ����� 
//=> ���α׷� ���� �߰��� ���� �Է¹��� �� �ִ� ��ɵ��� ���� 
//Scanner�� ������ �Է� �޾� 90�� �̻��̸� '���'�� ����ϰ� 
//90�� �̸��̸� '������'�� Ŭ���ϼ���.
public class IfTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner key =new Scanner(System.in);
   
     
      int intVal = key.nextInt();
      if(intVal>=90) {
    	  System.out.println("���");
      }
      else {
    	  System.out.println("�����");
      }
	
	
	}

}
