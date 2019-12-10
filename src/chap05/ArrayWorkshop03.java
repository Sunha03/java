package chap05;

import java.util.*;

//워크북 p23 4번 문제입니다.
public class ArrayWorkshop03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr3 = new int[5];
		
		int sum = 0;
		for(int i=0;i<arr3.length;i++) {
			//Random 클래스로 수정
			Random rm = new Random();
			arr3[i] = rm.nextInt(10) + 1;
			sum += arr3[i];
		}
		
		for(int i=0;i<arr3.length;i++)
			System.out.print(arr3[i] + "\t");
		
		System.out.println();
		System.out.println("sum = " + sum);
		System.out.println("avg = " + (double)(sum / arr3.length));
	}
}
