package Workbook;

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

		//생성자 버전
		Student kim = new Student("Kim", 100, 90, 95, 89);
		Student lee = new Student("Lee", 60, 70, 99, 98);
		Student park = new Student("Park", 68, 86, 60, 40);
		
		System.out.println(kim.getName() + " 평균 : " + kim.getAvg() + " 학점 : " + kim.getGrade() + "학점");
		System.out.println(lee.getName() + " 평균 : " + lee.getAvg() + " 학점 : " + lee.getGrade() + "학점");
		System.out.println(park.getName() + " 평균 : " + park.getAvg() + " 학점 : " + park.getGrade() + "학점");

		//Student 객체 배열 버전
		/*Scanner sc = new Scanner(System.in);
		
		Student[] sd = new Student[3];
		for(int i=0;i<sd.length;i++) {
			sd[i] = new Student();
			System.out.println("학생의 이름, 국어, 영어, 수학, 과학 성적을 차례로 입력해 주세요.");
			sd[i].setName(sc.next());
			sd[i].setKorean(sc.nextInt());
			sd[i].setEnglish(sc.nextInt());
			sd[i].setMath(sc.nextInt());
			sd[i].setScience(sc.nextInt());
		}
		
		for(int i=0;i<sd.length;i++) {
			//System.out.println(sd[i].getName() + " 평균 : " + sd[i].getAvg() + " 학점 : " + sd[i].getGrade() + "학점");
			sd[i].print();
		}
		*/

		
		
	}

}
