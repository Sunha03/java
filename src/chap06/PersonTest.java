package chap06;

import chap06.Person;

//PersonŬ������ ����ϴ� Ŭ����
public class PersonTest {
	public static void main(String[] args) {
		//Person p1 = new Person();
		//p1.name = "�嵿��";
		//p1.addr = "�����";
		//p1.age = 45; 		//age������ private���� ����Ǿ� �����Ƿ� ���� ��Ű���� Ŭ���������� ������ �� ����.
		
		//p1.setName("�嵿��");
		//p1.setAddr("�����");
		//p1.setAge(45);
		
		Person p1 = new Person("�嵿��", "�����", 45);
		
		System.out.println("����:"+p1.name);
		System.out.println("�ּ�:"+p1.addr);
		System.out.println("����:"+p1.age);
		
		/*Person p2 = new Person();
		p2.name = "��ҿ�";
		p2.addr = "����";
		p2.age = 75;*/
		
		Person p2 = new Person("��ҿ�", "����", 75);
		
		System.out.println("����:"+p2.name);
		System.out.println("�ּ�:"+p2.addr);
		System.out.println("����:"+p2.age);
	}
}
