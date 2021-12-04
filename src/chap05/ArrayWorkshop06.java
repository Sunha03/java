package chap05;

import java.util.*;

//본교재 p197 예제5-7
public class ArrayWorkshop06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for(int i=0;i<10;i++)
			System.out.print(arr[i]);
		System.out.println();
		
		Random rm = new Random();
		for(int i=0;i<100;i++) {
			int idx = rm.nextInt(10);
			int temp = arr[0];
			arr[0] = arr[idx];
			arr[idx] = temp;
		}
		
		for(int i=0;i<10;i++)
			System.out.print(arr[i]);
		System.out.println();
	}

}
