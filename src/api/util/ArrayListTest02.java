package api.util;

import java.util.ArrayList;

//Collection에 저장할 요소의 타입을 generic 형태로 정의
//Collection클래스<데이터타입>;
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
