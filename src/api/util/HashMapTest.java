package api.util;

import java.util.HashMap;
import java.util.Set;

//HashMap의 사용방법
public class HashMapTest {
	public static void main(String[] args) {
		// 1. (key, value) 한 쌍으로
		// - Generic으로 데이터 타입을 명시할 때에도 key 타입, value 타입 같이 정의해야함
		HashMap<Integer, String> map = new HashMap<>();

		// map에서는 key로 요소를 구분 > key 중복 불가
		map.put(1, "servlet");
		map.put(1, "jsp");
		map.put(1, "spring");
		System.out.println("map에 저장된 요소의 개수 : " + map.size());
		System.out.println("key가 1인 요소의 value : " + map.get(1));

		// map에 저장된 데이터 모두 출력
		// map은 key를 이용해서 저장될 위치를 계산 > 순서대로 저장 (X)
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("1", "servlet");
		map2.put("2", "jsp");
		map2.put("3", "spring");
		map2.put("4", "tiles");
		map2.put("5", "mybatis");
		
		//1. key 목록 추출
		Set<String> keylist = map2.keySet();
		//2. 반복문 안에서 key를 이용하여 value 추출
		for(String key : keylist) {
			String value = map2.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
