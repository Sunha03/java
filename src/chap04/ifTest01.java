package chap04;

import java.util.Random;
import java.util.Scanner;

public class ifTest01 {
	//if���� randomŬ���� ���� 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Random�� nextInt�� �̿��ؼ� 1���� 100������ ���� �߻���Ų �� �۾� 
		Random numb = new Random();
		
        int num = numb.nextInt(100);
        if(num>=90) {
        	System.out.println("����");
        System.out.println("�� ��° ����");
        }
        System.out.println("����");
        
        
        
        
        Scanner key =new Scanner(System.in);
        System.out.println("���ڿ��� �Է��ϼ���:");
         String data =key.next();
        System.out.println("Ű����� �Է¹��� ���ڿ�:"+data);
        System.out.print("���ڸ� �Է��ϼ���:");
        int intVal = key.nextInt();
        System.out.println("�Է¹��� ����=>"+intVal);
	}

}
