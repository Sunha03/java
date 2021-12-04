package chap07.poly;

//추상클래스 - abstract의 의미
/*
 * 미완성된 클래스, 모든 내용이 구현이 되어 있지 않은 클래스로 완성되지 않았으므로 객체 생성 불가
 * > 메소드의 body가 구현되지 않은 메소드를 갖고 있는 클래스 (= 추상메소드)
 * 
 * 1) 추상메소드를 선언하는 방법
 *    접근제어자 abstract 리턴타임 메소드명(매개변수list, ...);
 *    > 추상메소드가 정의된 클래스는 미완성된 추상클래스가 되므로 일반클래스와 다름
 *      추상클래스를 정의하는 경우 클래스 선언부에도 abstract을 추가해야 함
 *      abstract class 클래스명 { ... }
 * 2) 추상클래스의 특징
 *    - 일반메소드와 추상메소드 모두 정의할 수 있음
 *    - 추상메소드가 1개라도 정의되어 있는 클래스는 반드시 abstract을 추가해야 함
 *    - 추상클래스는 인스턴스화 할 수 없음 = 객체 생성 불가
 *    - 추상클래스(abstract클래스)를 상속하면 에러 발생함
 *      > AbstractSub클래스가 abstract메소드를 갖고 있는 AbstractSuper클래스를 상속 받으면서 AbstractSub클래스도 추상클래스가 됨
 *      [해결방법]
 *      1. 상위클래스로 사용될 목적으로 만들어진 클래스라면 클래스 선언부에 abstract 붙이기
 *      2. 모든 추상메소드를 반드시 오버라이딩 해야함
 * 3) 추상클래스와 추상메소드를 작성하는 이유?
 *    > !!!!! 다형성을 적용하기 위해서 !!!!!
 *    > 상위클래스로 사용하기 위한 목적(객체생성을 문법적으로 제한하기 위해)
 *    > 하위클래스에서 반드시 재정의해야하는 메소드를 문법으로 정의하여 반드시 재정의하도록 하기 위해
 */
abstract class AbstractSuper {
	public abstract void show();
	public void display() {		//일반 메소드
		System.out.println("display");
	}
}

class AbstactSub extends AbstractSuper {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}

public class abstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AbstractSuper obj = new AbstractSuper();	//객체 생성 안됨
	}

}
