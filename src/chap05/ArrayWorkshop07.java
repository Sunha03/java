package chap05;

import java.util.*;

//������ p199 ����5-8
public class ArrayWorkshop07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[45];
		for(int i=0;i<arr.length;i++) {
			arr[i] = i + 1;
		}
		
		Random rm = new Random();
		for(int i=0;i<6;i++) {
			int idx = rm.nextInt(45);
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
		
		System.out.println("�ζ� ��÷ ��ȣ : ");
		for(int i=0;i<6;i++)
			System.out.print(arr[i] + "\t");
		System.out.println();
	}

}
