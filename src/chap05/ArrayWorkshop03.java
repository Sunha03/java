package chap05;

import java.util.*;

//��ũ�� p23 4�� �����Դϴ�.
public class ArrayWorkshop03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr3 = new int[5];
		
		int sum = 0;
		for(int i=0;i<arr3.length;i++) {
			//Random Ŭ������ ����
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
