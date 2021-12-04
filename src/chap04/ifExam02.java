package chap04;

import java.util.Scanner;

public class ifExam02 {

	public static void main(String[] args) {
		System.out.println("나이:");
		Scanner kay = new Scanner(System.in);
		int numb = kay.nextInt();
		
		System.out.println("성별:");
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		
		if(numb >=20) {
			System.out.print("성인");
			
		
		}else {
			System.out.print("청소년");
			if(num==(1|3)) {
			System.out.print("남자");
		}else {
			System.out.print("여자");
		}
			
		}
		
	}

}
