package chap07.poly;

/*
 * 인터페이스 연습
 * < 인터페이스 >
 * > 추상 메소드/상수만 정의하는 특별한 클래스
 * 
 *  1. 인터페이스는 interface 키워드를 이용해서 정의
 *  2. 인터페이스는 추상메소드만 정의하는 특별한 클래스
 *     - public abstract이 생략 가능
 *     - 상속을 받으면 자동으로 추가됨
 *  3. 인터페이스가 인터페이스를 상속할 수 있음 (extends 이용)
 *     - 하위 인터페이스가 상위 인터페이스의 추상메소드를 상속 받음
 *  4. 클래스가 인터페이스를 상속할 수 있음 (implements 이용)
 *     - 인터페이스를 상속받는 클래스가 이미 다른 클래스를 상속하는 경우에 extends를 먼저 정의하고 implement를 정의해야함
 *  5. 인터페이스는 여러 개를 상속할 수 있음. 즉, 다중 상속이 가능함
 *     implements 뒤에 인터페이스를 정의할 때 ','로 구분해서 나누면 됨
 *  6. 클래스와 인터페이스들을 상속받는 하위 클래스는 모든 클래스와 인터페이스의 하위로 인식됨
 *     > 상속받는 모든 클래스, 인터페이스의 하위 타입이 됨
 *     
 */

interface InterA {
	public abstract void test();
	void display(int num);
}

interface InterB extends InterA {
	void show();
}

interface InterC {
	
}

class SuperA {
	
}

//SubA는 SuperA, InterA, InterB, InterC를 상속
class SubA extends SuperA implements InterB, InterC {
	
}

public class InterfaceTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperA obj1 = new SubA();
		InterA obj2 = new SubA();
		SuperB obj3 = new SubA();
		InterC obj4 = new SubA();
	}

}
