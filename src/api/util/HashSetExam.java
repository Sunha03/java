package api.util;

import java.util.HashSet;

public class HashSetExam {
	public static void main(String[] args) {
		//HashSet 2개 작성
		//set1 > 1~10까지 정수
		//set2 > 5~15까지 정수
		HashSet<Integer> set1 = new HashSet<Integer>();
		for(int i=1;i<=10;i++)
			set1.add(i);
		
		//set1, set2 합집합 출력
		HashSet<Integer> set2 = new HashSet<Integer>(set1);
		for(int i=5;i<=15;i++)
			set2.add(i);
		print(set2, "합집합");
		
		//set1, set2 교집합 출력
		HashSet<Integer> set3 = new HashSet<Integer>();
		for(int i=5;i<=15;i++)
			set3.add(i);
		set1.retainAll(set3);
		print(set1, "교집합");
	}
	
	//Set에 저장된 데이터를 꺼내서 출력
	public static void print(HashSet<Integer> set, String setName) {
		System.out.println("사이즈 : " + set.size());
		for(int data : set) {
			System.out.println(setName + "에 저장된 요소 > " + data);
		}
		System.out.println("----------------------------------------");
	}
}
