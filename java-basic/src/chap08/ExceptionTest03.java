package chap08;

import java.util.*;

//���� ���� ���ܰ� �߻��Ѵ� ��� ó��
//����ڰ� �Է��ϴ� ���� ���� ���ܰ� �ٸ��� �߻���
//1. ����ڰ� ����� ���� �Է� : ���ܰ� �߻����� �����Ƿ� catch ����� ������� ����
//2. ����ڰ� ���� ���ڿ� 0�� �Է�
//   > ArithmeticException�� �߻�
//   > Exception e = new ArithmeticException();
//     > ����Ÿ��                    > ���� Ÿ��
//3. ����ڰ� ���ڰ� �ƴ϶� ���ڸ� �Է� 
//   > InputMismatchException �߻�
//   > Exception e = new InputMismatchException();
// - �پ��� Exception�� ó���� ���� catch ����� ���� �� �����ϰ� ����� �� ����
// - ���� Ÿ�Կ� ���ϴ� Exception�� ���� ���߿� �����ؾ� ��
public class ExceptionTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		try {
			System.out.println("start");
			System.out.print("���ڸ� �Է��ϼ���");
			int num1 = key.nextInt();
			System.out.print("���� ���ڸ� �Է��ϼ���");
			int num2 = key.nextInt();
			System.out.println("��� : " + (num1 / num2));		//���� �߻�
		}
		catch(InputMismatchException e) {		//Exception�� ����
			System.out.print("���ڸ� �Է��� �� �����ϴ�.");
		}
		catch(ArithmeticException e) {		//Exception�� ����
			System.out.print("���� ���ڿ� 0�� �Է��� �� �����ϴ�.");
		}
		catch(Exception e) {		//��� ����Ŭ������ ���� Ŭ����
			System.out.println("���� �߻�!!");
			System.out.println("���� �޼��� : " + e.getMessage());
		}
	}

}
