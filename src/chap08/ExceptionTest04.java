package chap08;

import java.util.Scanner;

public class ExceptionTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.print("�迭�� ��� ������ �Է��ϼ��� : ");
		int size = key.nextInt();
		String[] arr = new String[size];
		try {
			System.out.println("step01");
			System.out.println(arr[0].length());
			if(size > 3) {
				arr[0] = new String("java");
			}
			System.out.println(arr[1].length());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ��Ҹ� �߸� �׼���");
		}
		catch(NullPointerException e) {
			System.out.println("NULL �Դϴ�");
		}
		catch(Exception e) {
			System.out.println("���� �߻�");
		}
		finally {
			System.out.println("�ݵ�� ������ ��ɹ� - ������ ����");
		}
	}

}
