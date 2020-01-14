package api.util;

import java.util.HashSet;

//Set의 주요 기능인 합집합, 교집합 기능 구현
public class hashSetTest02 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("jdbc");
		set.add("oracle");
		set.add("html");
		set.add("css");
		set.add("java");
		
		print(set, "set");
		
		//합집합 구현 방법 > Set 객체를 생성할 때, 합집합으로 표현할 Set을 생성자의 매개변수로 전달
		HashSet<String> set2 = new HashSet<String>(set);
		set2.add("servlet");
		set2.add("jsp");
		set2.add("jadoop");
		print(set2, "set2");
	
		HashSet<String> set3 = new HashSet<String>(set);
		set3.add("java");
		set3.add("jdbc");
		set3.add("oracle");
		set3.add("hive");
		print(set3, "set3");
		
		//set과 set3 교집합
		set.retainAll(set3);		//set, set3에서 중복되는 요소만 가지고 새로운 set 구조 생성
		print(set, "교집합");			//set, set3에서 중복되는 요소 빼고 모두 지움
	}
	
	//Set에 저장된 데이터를 꺼내서 출력
	public static void print(HashSet<String> set, String setName) {
		System.out.println("사이즈 : " + set.size());
		for(String data : set) {
			System.out.println(setName + "에 저장된 요소 > " + data);
		}
		System.out.println("----------------------------------------");
	}
}
