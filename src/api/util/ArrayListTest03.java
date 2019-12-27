package api.util;

import java.util.*;

public class ArrayListTest03 {

	public static void main(String[] args) {
		String[] arr = {"java", "oracle", "jdbc", "html5", "css"};
		
		//변환되어 리턴된 ArrayList에 저장된 값을 꺼내서 출력하기
		ArrayList<String> list = changeData(arr);
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
	
	//배열 > ArrayList 변환&리턴
	public static ArrayList<String> changeData(String[] arr) {
		ArrayList<String> list = new ArrayList<String>();
		
		//매개변수로 전달된 ㅐ열에서 데이터를 꺼내서 ArrayList에 저장하는 코드
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		
		return list;
	}

}
