package chap07;

import java.util.*;

public class chap05_test06_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Student kim = new Student();
		kim.setName("Kim");
		kim.setKorean(100);
		kim.setEnglish(90);
		kim.setMath(95);
		kim.setScience(89);
		
		Student lee = new Student();
		lee.setName("Lee");
		lee.setKorean(60);
		lee.setEnglish(70);
		lee.setMath(99);
		lee.setScience(98);
		
		Student park = new Student();
		park.setName("Park");
		park.setKorean(68);
		park.setEnglish(86);
		park.setMath(60);
		park.setScience(40);*/

		//������ ����
		Student kim = new Student("Kim", 25, 100, 90, 95, 89);
		Student lee = new Student("Lee", 22, 60, 70, 99, 98);
		Student park = new Student("Park", 27, 68, 86, 60, 40);
		Teacher t = new Teacher("Jang", 45, "JAVA");
		Staff s = new Staff("Han", 25, "IT");
		
		System.out.println(kim.getName() + " ��� : " + kim.getAvg() + " ���� : " + kim.getGrade() + "����");
		System.out.println(lee.getName() + " ��� : " + lee.getAvg() + " ���� : " + lee.getGrade() + "����");
		System.out.println(park.getName() + " ��� : " + park.getAvg() + " ���� : " + park.getGrade() + "����");
		t.print();
		s.print();
		
		//Student ��ü �迭 ����
		/*Scanner sc = new Scanner(System.in);
		
		Student[] sd = new Student[3];
		for(int i=0;i<sd.length;i++) {
			sd[i] = new Student();
			System.out.println("�л��� �̸�, ����, ����, ����, ���� ������ ���ʷ� �Է��� �ּ���.");
			sd[i].setName(sc.next());
			sd[i].setKorean(sc.nextInt());
			sd[i].setEnglish(sc.nextInt());
			sd[i].setMath(sc.nextInt());
			sd[i].setScience(sc.nextInt());
		}
		
		for(int i=0;i<sd.length;i++) {
			//System.out.println(sd[i].getName() + " ��� : " + sd[i].getAvg() + " ���� : " + sd[i].getGrade() + "����");
			sd[i].print();
		}
		*/

		
		
	}

}
