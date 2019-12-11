package chap06;

import chap06.Person;

//Person클래스를 사용하는 클래스
public class PersonTest {
	public static void main(String[] args) {
		//Person p1 = new Person();
		//p1.name = "장동건";
		//p1.addr = "서울시";
		//p1.age = 45; 		//age변수는 private으로 선언되어 있으므로 같은 패키지의 클래스에서도 접근할 수 없다.
		
		//p1.setName("장동건");
		//p1.setAddr("서울시");
		//p1.setAge(45);
		
		Person p1 = new Person("장동건", "서울시", 45);
		
		System.out.println("성명:"+p1.name);
		System.out.println("주소:"+p1.addr);
		System.out.println("나이:"+p1.age);
		
		/*Person p2 = new Person();
		p2.name = "고소영";
		p2.addr = "울산시";
		p2.age = 75;*/
		
		Person p2 = new Person("고소영", "울산시", 75);
		
		System.out.println("성명:"+p2.name);
		System.out.println("주소:"+p2.addr);
		System.out.println("나이:"+p2.age);
	}
}
