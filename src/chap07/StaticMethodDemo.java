package chap07;

//static 메소드
// - static 멤버를 제어하기 위한 용도
// - 유틸리티처럼 자주 사용하는 메소드

public class StaticMethodDemo {
	
	public static void staticTest1() {
		//1. static 메소드에서 static 메소드 접근 (O)
		staticTest2();
		System.out.println("staticTest1(");
	}
	
	public void display() {
		//2. non-static 메소드에서 non-static 메소드 접근 (O)
		show();
		System.out.println("display()");
	}
	
	public static void staticTest2() {
		
		System.out.println("staticTest2()");
	}
	
	public void show() {
		//3. non-static 메소드에서 static 메소드 호출 (O)
		staticTest2();
		System.out.println("show()");
	}
	
	public static void staticTest3() {
		//4. static 메소드에서 non-static 메소드 호출 (X)
		//	 > non-static 메소드가 메모리에 없기 때문에 같은 클래스에서 정의된 메소드이지만
		//	   무조건 객체 생성 후에 호출해야함
		//show();
		StaticMethodDemo obj = new StaticMethodDemo();
		obj.show();
		System.out.println("staticTest3()");
	}
}
