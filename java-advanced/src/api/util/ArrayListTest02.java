package api.util;

import java.util.ArrayList;

//Collection�� ������ ����� Ÿ���� generic ���·� ����
//CollectionŬ����<������Ÿ��>;
//		> ArrayList<String>;
public class ArrayListTest02 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("JAVA");
		list.add("HTML");
		list.add("CSS");
		list.add("C");
		list.add("C++");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}

}
