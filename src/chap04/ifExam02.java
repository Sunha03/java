package chap04;

import java.util.Scanner;

public class ifExam02 {

	public static void main(String[] args) {
		System.out.println("����:");
		Scanner kay = new Scanner(System.in);
		int numb = kay.nextInt();
		
		System.out.println("����:");
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		
		if(numb >=20) {
			System.out.print("����");
			
		
		}else {
			System.out.print("û�ҳ�");
			if(num==(1|3)) {
			System.out.print("����");
		}else {
			System.out.print("����");
		}
			
		}
		
	}

}
