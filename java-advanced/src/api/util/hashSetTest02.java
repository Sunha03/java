package api.util;

import java.util.HashSet;

//Set�� �ֿ� ����� ������, ������ ��� ����
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
		
		//������ ���� ��� > Set ��ü�� ������ ��, ���������� ǥ���� Set�� �������� �Ű������� ����
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
		
		//set�� set3 ������
		set.retainAll(set3);		//set, set3���� �ߺ��Ǵ� ��Ҹ� ������ ���ο� set ���� ����
		print(set, "������");			//set, set3���� �ߺ��Ǵ� ��� ���� ��� ����
	}
	
	//Set�� ����� �����͸� ������ ���
	public static void print(HashSet<String> set, String setName) {
		System.out.println("������ : " + set.size());
		for(String data : set) {
			System.out.println(setName + "�� ����� ��� > " + data);
		}
		System.out.println("----------------------------------------");
	}
}
