package chap08;

import java.util.Scanner;

public class ExceptionTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.print("배열의 요소 개수를 입력하세요 : ");
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
			System.out.println("배열의 요소를 잘못 액세스");
		}
		catch(NullPointerException e) {
			System.out.println("NULL 입니다");
		}
		catch(Exception e) {
			System.out.println("오류 발생");
		}
		finally {
			System.out.println("반드시 실행할 명령문 - 무조건 실행");
		}
	}

}
