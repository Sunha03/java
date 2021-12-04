package api.util;

import java.util.HashSet;
import java.util.Iterator;

//Set : 집합. 중복 허용(X)
public class hashSetTest {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("jdbc");
		set.add("oracle");
		set.add("html");
		set.add("css");
		set.add("java");
		
		System.out.println("사이즈 : " + set.size());
		
		//set에 저장된 요소 추출
		//1. HashSet 데이터를 표준 인터페이스 Iterator로 변환
		//	  * Iterator : 모든 자료구조에 담긴 데이터를 변환해서 담을 수 있도록 제공되는 추출 전용 인터페이스

		Iterator<String> it = set.iterator();
		//2. 변환한 후 추출
		while(it.hasNext()) {		//Iterator 안에 저장된 요소가 있는지 확인 - boolean 리턴
			String data = it.next();	//Iterator에 저장된 요소를 하나 꺼내서 반환
			System.out.println("꺼낸 요소 : " + data);
		}
		
		for(String data : set) {
			System.out.println("set에 저장된 요소 : " + data);
		}
	}
}
