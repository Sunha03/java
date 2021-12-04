package api.util;

import java.util.*;

public class ArrayListTest03 {

	public static void main(String[] args) {
		String[] arr = {"java", "oracle", "jdbc", "html5", "css"};
		
		//��ȯ�Ǿ� ���ϵ� ArrayList�� ����� ���� ������ ����ϱ�
		ArrayList<String> list = changeData(arr);
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
	
	//�迭 > ArrayList ��ȯ&����
	public static ArrayList<String> changeData(String[] arr) {
		ArrayList<String> list = new ArrayList<String>();
		
		//�Ű������� ���޵� �������� �����͸� ������ ArrayList�� �����ϴ� �ڵ�
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		
		return list;
	}

}
