package chap04;

import java.util.Scanner;

public class ifExam01 {

	public static void main(String[] args) {
	Scanner key = new Scanner(System.in);
	int num = key.nextInt();
	if(num>0) {
		if((num%2)==0) {
			System.out.println(num+"�� ¦���Դϴ�");
		}else {
			System.out.println(num+"�� Ȧ���Դϴ�");
		}
	}
	else {
		System.out.println(num+"�� �����Դϴ�.");
			
		
		
	}

	}

}
