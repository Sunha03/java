package chap07;

/*
 * < 상속 관계에서 메소드가 갖는 특징 >
 * 1. 상속 관계에서는 상위 클래스에 정의된 메소드를 하위 클래스에서 사용할 수 있음 (하위 클래스 참조 변수를 통해서 접근할 수 있음)
 * 2. 상위 클래스에 정의된 메소드와 동일한 메소드를 하위 클래스에서 정의하고 사용할 수 있음. 이런 경우 하위 클래스의 메소드가 호출됨
 *    > 상위 클래스에 선언된 메소드와 동일한 메소드를 하위 클래스에 정의하는 것을 메소드 재정의(메소드 오버라이딩)라고 함
 *    	* 메소드 오버라이딩 >> 메소드 선언부가 부모 클래스의 메소드 선언부와 반드시 일치해야 함
 *    					    메소드명, 매게변수 개수, 매개변수 타입, 리턴 타입 모두 동일해야 함
 */

class Parent {
	public void display() {
		System.out.println("부모의 display...");
	}
}

class Child extends Parent {
	public void display() {
		System.out.println("자식의 display...");
		super.display();
	}
	
	public void test() {
		System.out.println("자식의 test...");
		super.display();
	}
}

public class InheritenceTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.test();
		obj.display();
	}

}
