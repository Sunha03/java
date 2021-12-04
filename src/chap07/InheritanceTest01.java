package chap07;

/*
 * << 상속 관계에서 멤버 변수가 갖는 특징 >> 
 * 1. 상속 관계에서는 사우이 클래스에서 정의된 멤버 변수를 하위 클래스에서 사용할 수 있음.(하위 클래스 참조 변수를 통해 접근 가능)
 * 2. 상위 클래스의 변수와 동일한 이름의 변수를 하위 클래스에 정의하는 경우 하위 클래스의 멤버변수가 우선 순위가 높음
 * 3. 부모 클래스의 변수를 액세스 하려면 super를 이용해서 접근함
 * 	  this -> 자기 자신의 객체, super -> 부모 객체
 * 4. 상위 클래스에 private으로 선언된 변수는 상속 관계에 있다고 하더라도 하위 클래스에서 접근할 수 없음
 */

class Super {
	int num = 100;
}

class Sub extends Super {
	public void display() {
		System.out.println("num => " + num);		//부모 클래스의 변수를 액세스 할 수 있음
	}
}

public class InheritanceTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//상위 클래스는 하위 클래스의 일반적인 내용을 정의하기 위해서 사용하는 클래스이므로 주로 하위 클래스를 생성해서 사용함.
		Sub obj = new Sub();
		obj.display();
		System.out.println("main => " + obj.num);
	}

}
