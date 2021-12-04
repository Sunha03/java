package chap05;

import java.util.*;

public class ArgsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * args = new String[2]
		 * 				----------
		 * 				명령행 매개변수의 개수만큼 설정
		 * args[0] = "100"
		 * args[1] = "200"
		 */
		System.out.println("?????????????????");
		System.out.println("명령행 매개변수 -> " + args[0]);
		System.out.println("명령행 매개변수 -> " + args[1]);
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println("sum => " + args[0] + args[1]);
		/*Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();x	
		System.out.println("출력 : " + st + "입니다.");*/
	}

}
