package chap05;

import java.util.*;

//워크북 p200 예제5-9
public class ArrayWorkshop08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] code = {-4, -1, 3, 6, 11};
		int[] arr = new int[10];
		
		Random rm = new Random();
		for(int i=0;i<arr.length;i++) {
			int rand = rm.nextInt(5);
			arr[i] = code[rand];
		}
		
		System.out.println("랜덤한 숫자로 배열 채우기 : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + "\t");
		System.out.println();
	}

}
