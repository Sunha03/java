package api.util;

import java.util.HashMap;
import java.util.Set;

//HashMap�� �����
public class HashMapTest {
	public static void main(String[] args) {
		// 1. (key, value) �� ������
		// - Generic���� ������ Ÿ���� ����� ������ key Ÿ��, value Ÿ�� ���� �����ؾ���
		HashMap<Integer, String> map = new HashMap<>();

		// map������ key�� ��Ҹ� ���� > key �ߺ� �Ұ�
		map.put(1, "servlet");
		map.put(1, "jsp");
		map.put(1, "spring");
		System.out.println("map�� ����� ����� ���� : " + map.size());
		System.out.println("key�� 1�� ����� value : " + map.get(1));

		// map�� ����� ������ ��� ���
		// map�� key�� �̿��ؼ� ����� ��ġ�� ��� > ������� ���� (X)
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("1", "servlet");
		map2.put("2", "jsp");
		map2.put("3", "spring");
		map2.put("4", "tiles");
		map2.put("5", "mybatis");
		
		//1. key ��� ����
		Set<String> keylist = map2.keySet();
		//2. �ݺ��� �ȿ��� key�� �̿��Ͽ� value ����
		for(String key : keylist) {
			String value = map2.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
